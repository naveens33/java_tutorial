package constructor;

public class ConstructorOverloadingExample {

	ConstructorOverloadingExample()
	{
		System.out.println("This is Default Constructor");
	}	
	
	ConstructorOverloadingExample(int x)
	{
		System.out.println(x);
	}
	
	public static void main(String[] args) {

		ConstructorOverloadingExample obj=new ConstructorOverloadingExample();
		ConstructorOverloadingExample obj1=new ConstructorOverloadingExample(5);
	}

}
