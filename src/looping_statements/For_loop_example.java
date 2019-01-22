package looping_statements;

public class For_loop_example {

	public static void main(String[] args) {
		/*
		 * 1. Initialization 
		 * 2. Condition
		 * 3. Increment/Decrement 
		 */
	/*	
		for(int i=0;i<10;i++)
		{
			System.out.println("Hello");
		}
	*/
		/*
	//Infinite Loop
		for(;;)
		{
			System.out.println("Hello");
		}
		*/
	/*	
		for(int num=1;num<=10;num++)
		{
			int count=0;
			for(int i=1;i<=(num/2);i++)
			{
				if(num%i==0)
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(num);
			}
		}
		*/
		int sum=0;
		for(int x=0;x<=10;x++)
		{
			sum=sum+x;
		}
		System.out.println("Sum of x= "+sum);
	}
}
