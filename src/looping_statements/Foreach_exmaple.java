package looping_statements;

import java.util.Scanner;

public class Foreach_exmaple {

	public static void main(String[] args) {

		String name;
		
		System.out.print("Enter the name: ");
		Scanner in=new Scanner(System.in);
		name=in.nextLine();
		
		int len=name.length();
		
		for(int i=0;i<len;i++)
		{
			System.out.println(name.charAt(i));
		}
		
		
		for(char c : name.toCharArray())
		{
			System.out.println(c);
		}

	}

}
