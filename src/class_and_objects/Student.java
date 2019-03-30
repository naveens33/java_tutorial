package class_and_objects;

public class Student {

	int rollno;
	String name;
	
	Student(int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
	}
	
	void display()
	{
		System.out.println(rollno+"-"+name);
	}
	
	public static void main(String[] args) {
		Student s1=new Student(12,"Prem");
		s1.display();	
	}
}
