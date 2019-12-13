package conditional_statements;

import java.util.Scanner;

public class IfElse_Example {

	public static void main(String[] args) {
		int age;
		System.out.println("Enter your age: ");
		Scanner in=new Scanner(System.in);
		age=in.nextInt();
		if(age>=18)
		{
			System.out.println("Eligible");
		}	
		else
		{
			System.out.println("Not Eligible");			
		}
	}
}
