package charsequence;

public class Example2 {

	public static void main(String[] args) {
		String text="hello";
		String rev="";
		for(int i=0;i<text.length();i++)
		{
			rev=rev+text.charAt(text.length()-i-1);
		}
		if(text.equals(rev))
		{
			System.out.println("Its Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}

}
