package class_and_objects;

public class Student {

	int rollno;
	String name;

	void setdata(int x, String y)
	{
		rollno=x;
		name=y;
	}
	
	void display()
	{
		System.out.println("Roll no: "+rollno);
		System.out.println("Name: "+name);
	}
	
	public static void main(String[] args) {
		Student s1=new Student();
		s1.setdata(1, "Abi");

		Student s2=new Student();
		s2.setdata(2, "Bavi");
		System.out.println("Roll no: "+s1.rollno);
		System.out.println("Name: "+s2.name);
		
		System.out.println("Roll no: "+s2.rollno);
		System.out.println("Name: "+s1.name);
	}
}
