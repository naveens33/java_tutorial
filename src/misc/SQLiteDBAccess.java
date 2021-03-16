package misc;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
public class SQLiteDBAccess {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		/*
		 * Basics of JDBC - SQLite connections and some DQL(Data Query Language) and DML(Data Manipulation Language) 
		 * sqlite-jdbc jar file
		 * First, create a Connection object to connect to the SQLite database.
		 * Next, create an instance of the Statement class from the Connection object.
		 * Then, create an instance of the ResultSet class by calling the executeQuery method of the Statement object. The executeQuery() method accepts a SELECT statement.
		 * After that, loop through the result set using the next() method of the ResultSet object.
		 * Finally, use the get* method of the ResultSet object such as getInt(), getString(), getDouble(), etc., to get the data in each iteration.
		 */
		
		Class.forName("org.sqlite.JDBC");
		String url = "jdbc:sqlite:D://SampleDatabase.db";
		Connection conn = DriverManager.getConnection(url);
		System.out.println("Connection Established Successfully");
		
		// Select record from a table
		String sql = "SELECT * FROM AddNewPayee";
		Statement stmt  = conn.createStatement();
	    ResultSet rs    = stmt.executeQuery(sql);
	    // by column name
	    while (rs.next()) {
            System.out.println(rs.getString("name")+" "+rs.getString("address")+" "+rs.getString("account")+" "+rs.getString("details"));
	     }
	    
	    // by column index
	    ResultSetMetaData rsmd = rs.getMetaData();
	    System.out.println(rsmd.getColumnCount());
	    while(rs.next())
	    {
	    	for(int i=1;i<=rsmd.getColumnCount();i++)
	    	{
	    		System.out.print(rs.getString(i));
	    	}
	    }
	    
	   // Insert a new record
	   sql = "INSERT INTO AddNewPayee (name,address,account,details) VALUES('somi','krishnagiri','7516546365','Friend')";
	   stmt.executeUpdate(sql);
	   
	   // Update a existing record
	   sql = "UPDATE AddNewPayee SET address='Delhi' where name='somi'";
	   stmt.executeUpdate(sql);
	   
	   // Delete a record
	   sql = "DELETE From AddNewPayee Where name='prem'";
	   stmt.executeUpdate(sql);
	   
	}

}
