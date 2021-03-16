package arrays;

import java.util.HashMap;
import java.util.Map;

public class Example1 {

	public static void main(String[] args) {
		int arr[] = {1, 1, 2, 2, 3, 3, 3};
		Map<Integer,Integer> m = new HashMap<Integer,Integer>();
		for(int a: arr) {
			if(m.containsKey(a)) {
				m.put(a, m.get(a)+1);
			}
			else {
				m.put(a, 1);
			}
		}
		int ans=0;
		for(Integer key:m.keySet()) {
			if(m.get(key)%2==0) {
				ans+=key;
			}
		}
		System.out.println(ans);
	}

}
