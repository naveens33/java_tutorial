package misc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
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
		String url = "jdbc:sqlite:D://TestDataFile.db";
		Connection conn = DriverManager.getConnection(url);
		System.out.println("Connection Established Successfully");
		
		String sql = "SELECT * from AddNewPayee";
		Statement stmt  = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		/*
		while(rs.next())
		{
			System.out.println(rs.getString("name")+" "+rs.getString("address")+" "+rs.getString("account")+" "+rs.getString("details"));
		}
		*/
		ResultSetMetaData rsmd = rs.getMetaData();
		System.out.println(rsmd.getColumnCount());
		while(rs.next())
		{
			for(int i=1;i<=rsmd.getColumnCount();i++)
			{
				System.out.print(rs.getString(i)+"  ");
			}
			System.out.println();
		}
		/*
		sql = "INSERT INTO AddNewPayee (name,address,account,details) values('Somi','Krishnagiri','43473236784','Friend')";
		stmt.executeUpdate(sql);
		
		sql = "UPDATE AddNewPayee SET address='Delhi' where name='Somi'";
		stmt.executeUpdate(sql);
		
		sql = "DELETE from AddNewPayee where name='Prem'";
		stmt.executeUpdate(sql);
	*/
	}

}
