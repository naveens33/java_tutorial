package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class ArrayListVsVector {

	public static void main(String[] args) throws InterruptedException {
		//List<Integer> li = new ArrayList<Integer>();
		List<Integer> li = new Vector<Integer>();
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for(int i=1;i<=20;i++) {
					li.add(i);
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for(int i=1;i<=20;i++) {
					
					li.add(i);
				}
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(li);
		System.out.println("Size: "+li.size());
	}
}
