package arrays;

import java.util.Scanner;

public class TwoDimentional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a=new int[2][2];
		Scanner in =new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println("Enter the value for "+i+" "+j+" :");
				a[i][j]=in.nextInt();
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}

}
