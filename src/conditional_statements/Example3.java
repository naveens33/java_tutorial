package conditional_statements;

import java.util.Scanner;

public class Example3 {

	public static void main(String arg[])
	{
		String month;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the month: ");
		month=in.next();
		switch(month)
		{
		case "jan":
		case "Mar":	
		case "May":	
			System.out.println("31");
			break;
		case "Apr":
		case "Jun":	
		case "Sep":	
			System.out.println("30");
			break;
		case "Feb":
			System.out.println("28");
			break;
		default:
			System.out.println("Wrong index");
		}
	}
}
