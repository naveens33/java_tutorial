package conditional_statements;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		int age;
		Scanner in =new Scanner(System.in);
		System.out.println("Enter your age ");
		age=in.nextInt();
		if(age>=18)
		{
			System.out.println("Do you have pan card?(true/false)");
			boolean panstatus=in.nextBoolean();
			if(panstatus==true)
			{
				System.out.println("Eligible");
			}
			else
			{
				System.out.println("Apply for Pan");
			}
		}
		else
		{
			System.out.println("Not Eligible");			
		}
	}

}
