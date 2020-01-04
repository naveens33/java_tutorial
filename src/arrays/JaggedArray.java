package arrays;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		//int a[]=new int[] {12,43,65,19};
		
		int a[][]=new int[][] {
			{12,43,54},
			{65,34,78,56},
			{12,32}
		};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"   ");
			}
			System.out.println();
		}
	}

}
