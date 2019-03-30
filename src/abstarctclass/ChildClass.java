package abstarctclass;

public class ChildClass extends SampleAbsClass {

	public static void main(String[] args) {
		ChildClass obj=new ChildClass();
		//SampleAbsClass obj=new SampleAbsClass();
		System.out.println(obj.a);
		obj.display();
	}

	void print() {
		// TODO Auto-generated method stub
		
	}

}
