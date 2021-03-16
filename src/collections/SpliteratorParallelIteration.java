package collections;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorParallelIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<>();
		names.add("Rams");
		names.add("Posa");
		names.add("Chinni");
			
		// Getting Spliterator
		Spliterator<String> namesSpliterator = names.spliterator();
		while(namesSpliterator.tryAdvance(System.out::println))
		{
			Date date= new Date();
			long time = date.getTime();
			Timestamp ts = new Timestamp(time);
			System.out.println(ts);
		}
	}

}
