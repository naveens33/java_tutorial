package methods;

public class ParaFunc {

	void add(int x, int y)
	{
		int z=x+y;
		System.out.println(z);
	}
	public static void main(String[] args) {
		ParaFunc obj=new ParaFunc();
		obj.add(5,6);
	}

}
