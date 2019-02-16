package constructor;

public class Constructor_Example {
	
	Constructor_Example()
	{
		System.out.println("This is Construtor");
	}
	Constructor_Example(int x)
	{
		System.out.println(x);
	}
	Constructor_Example(double x)
	{
		System.out.println(x);
	}
	Constructor_Example(int x, double y)
	{
		System.out.println(x);
		System.out.println(y);
	}
/*	
	int add(int x, int y)
	{
		int z=x+y;
		return(z);			
	}
	*/
	public static void main(String[] args) {
		Constructor_Example obj=new Constructor_Example();
		Constructor_Example obj1=new Constructor_Example(3);
		Constructor_Example obj2=new Constructor_Example(3,6.5);
		Constructor_Example obj3=new Constructor_Example(3.6);
		
	//	int c=obj.add(5, 6);
	//	System.out.println(c);

	}

}
