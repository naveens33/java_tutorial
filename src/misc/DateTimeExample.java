package misc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateTimeExample {

	public static void main(String[] args) throws ParseException {
		String str="Dec";
		
		// TODO Auto-generated method stub
		Date m = new SimpleDateFormat("MMM", Locale.ENGLISH).parse(str);
		Calendar cal = Calendar.getInstance();
		cal.setTime(m);
		int month = cal.get(Calendar.MONTH);
		System.out.println(month);
		
	}

}
