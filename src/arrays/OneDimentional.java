package arrays;

import java.util.Scanner;

public class OneDimentional {

	public static void main(String[] args) {
		
		int[] a=new int[3];
		Scanner in =new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter the value for "+i+" :");
			a[i]=in.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
