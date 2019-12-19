package arrays;

public class SplitFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String address="#219, Neeladri Nagar, Electronic City, Bengaluru, Karnataka 560100";
		String[] arr=address.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("index: "+i+" Value: "+arr[i]);
		}
		//System.out.println("City is "+arr[5]);
		
	}

}
