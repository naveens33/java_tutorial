package looping_statements;

public class Do_While_loop_example {

	public static void main(String[] args) {
		/*
		 * 1. Initialization 
		 * 2. Increment/Decrement  
		 * 3. Condition
		 */
	/*	
		int i=10;
		do
		{
			System.out.println("Hello");
			i++;
		}while(i<10);
	*/
	/*
		int i=1;
		int prod=1;
		do
		{
			prod=prod*i;
			i++;
		}while(i<=10);
		System.out.println(prod);
	*/
		/*
		int i=1;
		do
		{
			int j=1;
			do
			{
				System.out.print("*");
				j++;
			}while(j<=i);
			System.out.println();
			i++;
		}while(i<=5);
		*/
		
		//Infinite Loop
		do
		{
			System.out.println("Hello");
		}while(true);
	}

}
