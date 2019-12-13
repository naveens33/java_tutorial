package conditional_statements;

import java.util.Scanner;

public class Switch_Example {

	public static void main(String[] args) {
		int index;
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the week index");
		index=in.nextInt();
		
		switch(index)
		{
		case 0:
			System.out.println("Sunday");
		
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		default:
			System.out.println("Invalid index");			
		}
	}

}
