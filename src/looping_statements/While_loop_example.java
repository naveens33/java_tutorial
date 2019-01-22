package looping_statements;

public class While_loop_example {

	public static void main(String[] args) {

		/*
		 * 1. Initialization 
		 * 2. Condition 
		 * 3. Increment/Decrement 
		 */
	/*	
		int i=10;
		while(i<10)
		{
			System.out.println("Hello");
			i++;
		}
	*/
	/*	int i=10;
		while(i>0)
		{
			System.out.println("Hello");
			i--;
		}
	*/
	/*	
		int i=97;
		while(i<=156)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			i++;
		}
	*/
	/*
		//Sum of n numbers 0-10
		int x=0;
		int sum=0;
		while(x<=10)
		{
			sum=sum+x;
			x++;
		}
		System.out.println("Sum of x= "+sum);
	
		//Sum of Odd and Even n numbers
		int i=0;
		int sumeven=0;
		int sumodd=0;
		while(i<10)
		{
			if(i%2==0)
			{
				sumeven=sumeven+i;
			}
			else
			{
				sumodd=sumodd+i;	
			}
			i++;
		}
		System.out.println("Ans for sum of even: "+sumeven);
		System.out.println("Ans for sum of odd: "+sumodd);
*/		
		
		//Infinite Loop
		while(true)
		{
			System.out.println("Hello");
		}
	}

}
