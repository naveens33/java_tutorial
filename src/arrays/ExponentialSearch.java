package arrays;

import java.util.Arrays;

public class ExponentialSearch {

	public static void main(String[] args) {
		int arr[] = {1, 3, 5, 8, 9, 11, 13, 15, 23, 38, 44};
		int target = 38;
		if (arr[0]==target) {
			System.out.print(target+"found in index 0");
		}
		else {
			int i=1;
			int n=arr.length;
			while(i<n && arr[i]<target) {
				i=i*2;
			}
			int left =  i/2;
			int right = Math.min(i, n-1);
			System.out.println("length: "+n+"\nexponential: "+i+"\nleft:"+left+"\nright:"+right);
			System.out.println(Arrays.binarySearch(arr, left, right, target));
		}
	}

}
