package exceptionhandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MultipleCatchBlock {

	public static void main(String[] args) {

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
			int c=4/0;
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("Invalid index Sorry for the trouble.. Size of the list is 5");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
