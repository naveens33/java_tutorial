package exceptionhandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExceptionHandling_example {

	public static void main(String[] args) {
	/*	
		List<String> Name=new ArrayList<String>();
		Name.add("prem");
		Name.add("gokul");
		Name.add("Jaya");
		Name.add("prem");
		Name.add("vivek");
		
		int index;
		Scanner in =new Scanner(System.in);
		System.out.print("Enter the index to return the student name: ");
		index=in.nextInt();
		
		System.out.println("Name: "+Name.get(index));
	//********************************IndexOutOfBoundsException********************************
	Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 12, Size: 5
	at java.util.ArrayList.rangeCheck(Unknown Source)
	at java.util.ArrayList.get(Unknown Source)
	at exceptionhandling.ExceptionHandling_example.main(ExceptionHandling_example.java:23)
		*/
	/*	
		String city="Bangalore";
		for(int i=0;i<10;i++)
		{
			System.out.println(city.charAt(i));
		}
	//**********************************StringIndexOutOfBoundsException***********************************	
	Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 9
	at java.lang.String.charAt(Unknown Source)
	at exceptionhandling.ExceptionHandling_example.main(ExceptionHandling_example.java:34)
		*/
	/*
		int a,b,c,d;
		Scanner in =new Scanner(System.in);
		System.out.print("Enter the value for a: ");
		a=in.nextInt();
		System.out.print("Enter the value for b: ");
		b=in.nextInt();
		c=a-b;
		d=4/c;
		System.out.println(d);
	/**********************************ArithmeticException*****************************************
	Exception in thread "main" java.lang.ArithmeticException: / by zero
	at exceptionhandling.ExceptionHandling_example.main(ExceptionHandling_example.java:48)	
	*/
/*	
		// try, catch, finally
		List<String> Name=new ArrayList<String>();
		Name.add("prem");
		Name.add("gokul");
		Name.add("Jaya");
		Name.add("prem");
		Name.add("vivek");
		
		int index;
		Scanner in =new Scanner(System.in);
		System.out.print("Enter the index to return the student name: ");
		index=in.nextInt();
		
		try
		{
			System.out.println("Name: "+Name.get(index));	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Thanks for using my program");
			System.out.println("My List is: "+Name);
		}

		//throw
		List<String> Name=new ArrayList<String>();
		Name.add("prem");
		Name.add("gokul");
		Name.add("Jaya");
		Name.add("prem");
		Name.add("vivek");
		
		int index;
		Scanner in =new Scanner(System.in);
		System.out.print("Enter the index to return the student name: ");
		index=in.nextInt();
		
		try
		{
			System.out.println("Name: "+Name.get(index));	
			throw(new ArithmeticException());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Thanks for using my program");
			System.out.println("My List is: "+Name);
		}
*/	
		//particular exception
		List<String> Name=new ArrayList<String>();
		Name.add("prem");
		Name.add("gokul");
		Name.add("Jaya");
		Name.add("prem");
		Name.add("vivek");
		
		int index;
		Scanner in =new Scanner(System.in);
		System.out.print("Enter the index to return the student name: ");
		index=in.nextInt();
		
		try
		{
			//System.out.println("Name: "+Name.get(index));	
			throw(new ArithmeticException());
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Thanks for using my program");
			System.out.println("My List is: "+Name);
		}
	}
}
