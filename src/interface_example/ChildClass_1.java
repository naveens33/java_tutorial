package interface_example;

public class ChildClass_1 extends ParentClass_1
{

	public static void main(String[] args) {
		ChildClass_1 obj=new ChildClass_1();
		obj.display1();

		IParentClass2 obj1=new ParentClass2();
		obj1.display2();
		obj1.display4();
	}

}
