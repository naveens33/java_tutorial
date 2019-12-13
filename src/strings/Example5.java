package strings;

public class Example5 {

	public static void main(String[] args) {
		// Palindrome for string using StringBuilder
		String name="madam";
		StringBuilder n=new StringBuilder(name);
		n.reverse();
		if(name.equals(n.toString()))
		{
			System.out.println("is pali");
		}
		else
		{
			System.out.println("is not pali");
		}
	}

}
