package exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Example2 {

	public static void main(String[] args) throws FileNotFoundException, ArithmeticException{

		File obj=new File("D:\\dfhsg"); 
		FileReader in=new FileReader(obj);
	}

}
