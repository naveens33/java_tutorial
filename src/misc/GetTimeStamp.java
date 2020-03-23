package misc;

import java.util.Date;
import java.io.File;
import java.sql.Timestamp;
 
public class GetTimeStamp
{
    public static void main( String[] args )
    {
 /*
 Date date= new Date();
 
 long time = date.getTime();
     System.out.println("Time in Milliseconds: " + time);
 
 Timestamp ts = new Timestamp(time);
 System.out.println(ts);
 System.out.println("Current Time Stamp: " + ts.toString().replace('-', '_').replace(' ', '_').replace(':', '_').replace('.', '_'));
 */
    	String reportpath;
		Date date= new Date();
		long time = date.getTime();
		System.out.println(time);
		Timestamp ts = new Timestamp(time);
		System.out.println(ts);
		System.out.println(System.getProperty("user.dir"));
		reportpath=System.getProperty("user.dir") + "\\src\\misc\\"+ts.toString().replace('-', '_').replace(' ', '_').replace(':', '_').replace('.', '_')+"/";
		File file = new File(reportpath);
	      boolean bool = file.mkdir();
    }
}