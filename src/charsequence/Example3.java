package charsequence;

public class Example3 {

	public static void main(String[] args) {
		String str="HellO";
		String dup="";
		for(int i=0;i<str.length();i++)
		{
			Character ch=str.charAt(i);
			if(ch.isLowerCase(ch))
			{
				dup=dup+ch.toUpperCase(ch);
			}
			else if(ch.isUpperCase(ch))
			{
				dup=dup+ch.toLowerCase(ch);
			}
		}
		System.out.println(dup);
	}

}
