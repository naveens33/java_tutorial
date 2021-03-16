package inhertance;

import methods.NonParaFunc;

class BaseClass_S
{
	public BaseClass_S()
	{
		System.out.println("Constructor");
	}
	
	void display4()
	{
		System.out.println("BaseClass");
	}
}

public class ChildClass_S extends BaseClass_S //NonParaFunc //
{
	 
	void display4()
	 {
			System.out.println("ChildClass");		 
	 }
	public static void main(String[] args) {
		ChildClass_S obj=new ChildClass_S();
		obj.display4();
	}

}
