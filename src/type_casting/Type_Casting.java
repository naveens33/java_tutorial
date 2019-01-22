package type_casting;

public class Type_Casting {

	public static void main(String[] args) {
		/*
		//int to double
		int a,b;
		double c;
		a=56;
		b=70;
		c=(double)a/(double)b;
		System.out.println(c);
		*/

		/*
		//Converting String to Int/Double
		String a="560";
		int ans;
		ans=Integer.parseInt(a)/3;
		System.out.println(ans);
		
		double ans1;
		ans1=Double.parseDouble(a)/3;
		System.out.println(ans1);
	*/
		//Convertion from Int to String 
		int total;
		int mark1,mark2,mark3;
		mark1=56;
		mark2=90;
		mark3=89;
		total=mark1+mark2+mark3;
		String ans=""+total;
		System.out.println(ans);
	}
}
