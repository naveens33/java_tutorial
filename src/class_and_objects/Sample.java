package class_and_objects;

public class Sample {

	int dm1,dm2,dm3;
	
/*	void display()
	{
		System.out.println("dm1: "+dm1);
		System.out.println("dm2: "+dm2);
		System.out.println("dm3: "+dm3);
	}
*/	
	public static void main(String[] args) {
		Sample obj=new Sample();
		obj.dm1=5;
		obj.dm2=6;
		obj.dm3=7;
		System.out.println("dm1: "+obj.dm1);
		System.out.println("dm2: "+obj.dm2);
		System.out.println("dm3: "+obj.dm3);
		//obj.display();
	}

}
