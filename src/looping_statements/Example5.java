package looping_statements;

public class Example5 {

	public static void main(String[] args) {
		// Prime number of not
		
		int num =18,count=0;
		
		for(int i=2;i<num/2;i++)
		{
			if(num/i==0)
			{
				count+=0;
			}
		}
		if(count==0)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not");
		}
	}

}
