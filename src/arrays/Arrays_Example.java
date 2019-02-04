package arrays;

import java.util.Scanner;

public class Arrays_Example {

	public static void main(String[] args) {
	/*
		double[] a=new double[3];
		Scanner in=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter the value("+i+"): ");
			a[i]=in.nextDouble();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println("value in ("+i+"): "+a[i]);
		}
	*/	
	/*	
		int[] marks=new int[5];
		int total=0;
		Scanner in=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.print("Enter the Subject-"+(i+1)+" Mark: ");
			marks[i]=in.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			total=total+marks[i];
		}
		System.out.println("Total ="+total);
		*/
	/*
		String[] name= new String[3];
		Scanner in=new Scanner(System.in);
		for(int i=0;i<name.length;i++)
		{
			System.out.print("Enter the Name:");
			name[i]=in.nextLine();
		}
		for(int i=0;i<name.length;i++)
		{
			System.out.println("Second Letter: "+name[i].toUpperCase());
		}
		*/
		
		String address=" #219, Neeladri Nagar, Electronic City, Bengaluru, Karnataka 560100";
		String[] words=address.split(",");
		
		for(int i=0;i<words.length;i++)
		{
			System.out.println(i+" :"+words[i]);
		}
		//System.out.println("City is: "+words[3]);
	}

}
