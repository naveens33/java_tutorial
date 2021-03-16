package arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
/*
 * Farthest from zero

You are given an integer array A of size N.

Task Write a program to print the farthest element from 0. If there are multiple elements, print the number with the least value.

Input format

    The first line contains a single integer N denoting the size of the array A.
    The next line contains N integers denoting the elements of the array A.

Output format

Print the farthest element from 0.
 */
public class Example2 {

	public static void main(String[] args) {
		Integer[] arr = {-10, 7, 5, 1, 10};
		Set<Integer> s =  new TreeSet<Integer>();
		s.addAll(Arrays.asList(arr));
		List<Integer> li = new Stack<Integer>();
		li.addAll(s);
		
		if(li.get(0)<0) {
			if(Math.abs(li.get(0))>=li.get(li.size()-1)) {
				System.out.println(li.get(0));
			}
			else {
				System.out.println(li.get(li.size()-1));
			}
		}
		else {
			System.out.println(li.get(li.size()-1));
		}
		
		
	}

}
