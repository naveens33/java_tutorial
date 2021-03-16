package charsequence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Exmaple6 {

	public static void main(String[] args) {
		// Palindrom with String
/*
		String city="Delhi",rev="";
		char[] arr=city.toCharArray();
		
		for(int i=0;i<arr.length;i++)
		{
			rev+=arr[arr.length-i-1];
		}
		System.out.println(rev);
		if(city.equals(rev))
		{
			System.out.println("Palindrome");	
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
*/
		/*char[] a= new char[]{'a','b','c','d'};

		for(int i=0;i<a.length/2;i++){
			char temp=a[a.length-i-1];
			a[a.length-i-1]=a[i];
			a[i]=temp; 
		}
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		*/
		/*int[] a = new int[] {-1,5,6,9};
		Set s1= new HashSet();
		for(int i=a[0];i<=a[a.length-1];i++) {
			s1.add(i);
		}
		Set s2 =new HashSet();
		for(int i=0;i<a.length;i++) {
			s2.add(a[i]);
		}
		s1.removeAll(s2);
		System.out.println(s1);
		*/
		/*String s = "bangalore is a garden city";
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		for(char c : s.toCharArray()) {
			if(m.containsKey(c)) {
				Integer temp =m.get(c)+1;
				m.put(c, temp);
			}
			else {
				m.put(c, 1);
			}
		}
		System.out.println(m);
		*/
		List<String> fruits = new ArrayList<String>();
		fruits.add("banana");
		fruits.add("orange");
		fruits.add("apple");
		Map<String, Integer> m = new HashMap<String, Integer>();
		for(String fruit : fruits) {
			int count =0;
			for(int i=1;i<fruit.length()-1;i++) {
				if("a,e,i,o,u".contains(""+fruit.charAt(i)) 
						&& !("a,e,i,o,u".contains(""+fruit.charAt(i-1)) 
								&& !("a,e,i,o,u".contains(""+fruit.charAt(i+1))))){
					count++;
				}
				m.put(fruit, count);
			}
		}
		System.out.println(m);
}}

