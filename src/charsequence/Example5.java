package charsequence;

public class Example5 {

	public static void main(String[] args) {
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		System.out.println(str1==str2);
		// Palindrome using StringBuilder
		
		StringBuilder name=new StringBuilder("madam1");
		StringBuilder copy=new StringBuilder(name);
		name.reverse();
		/*
		 * Convert to String before equals
		 */
		if(name.toString().equals(copy.toString()))
		{
			System.out.println("is pali");
		}
		else
		{
			System.out.println("is not pali");
		}
	}

}
