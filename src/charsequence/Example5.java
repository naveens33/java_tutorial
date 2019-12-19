package charsequence;

public class Example5 {

	public static void main(String[] args) {
		// Palindrome using StringBuilder
		
		StringBuilder name=new StringBuilder("madam");
		StringBuilder copy=name;
		name.reverse();
		if(name.equals(copy))
		{
			System.out.println("is pali");
		}
		else
		{
			System.out.println("is not pali");
		}
	}

}
