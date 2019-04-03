package exceptionhandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example1 {

	public String getData(int index)
	{
		List<String> obj=new ArrayList();
		
		obj.add("Prem");
		obj.add("Kumar");
		obj.add("Somi");
		try
		{
			return obj.get(index);			
		}
		catch(Exception e)
		{
			return "Invalid index provided";
		}
	}
	public static void main(String[] args) {
		
		while(true)
		{
			Scanner in=new Scanner(System.in);
			System.out.print("Enter the index between 0-2 to get the name: ");
			int index=in.nextInt();
			Example1 obj=new Example1();
			System.out.println(obj.getData( index));
			
			System.out.print("To Quit enter 'Yes' or 'No'");
			String s=in.next();
			if(s.equals("Yes"))
			{
				System.out.println("Thanks for using");
				break;
			}
		}
	}

}
