package looping_statements;

import java.util.Scanner;

public class ContinueStatement_Example {

	public static void main(String[] args) {
		/*
		int x;
		Scanner in=new Scanner(System.in);
		while(true)
		{
			System.out.println("Shall i execute(0/1): ");
			x=in.nextInt();
			if(x==0) {
				continue;
			}
			System.out.println("Hello");
		}
		*/
		for(;;)
		{
			System.out.println("Hello");
		}
	}

}
