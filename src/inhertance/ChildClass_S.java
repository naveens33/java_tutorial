package inhertance;

import function.NonParaFunc;

class BaseClass_S
{
	public void display1()
	{
		System.out.println("BaseClass");
	}
	private void display2()
	{
		System.out.println("BaseClass_private");
	}
	protected void display3()
	{
		System.out.println("BaseClass_protected");
	}
	void display4()
	{
		System.out.println("BaseClass");
	}
}

public class ChildClass_S extends BaseClass_S //NonParaFunc //
{
	public static void main(String[] args) {
		ChildClass_S obj=new ChildClass_S();
		//obj.display();
		/*obj.display1();
		obj.display2();
		obj.display3();
		obj.display4();*/
	}

}
