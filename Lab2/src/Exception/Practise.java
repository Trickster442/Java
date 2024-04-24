package Exception;
import java.io.*;
import java.util.ArrayList;
public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int [] numArray = new int[4];
//		//Array Index out of bound exception
//		numArray[7] = 9;
		
		ArrayList<String> list = new ArrayList<>();
		list.add("My");
		list.add("Name");
		System.out.println(list.get(2)); 
		
		ArithmeticException ex = new ArithmeticException("/ by zero");
		ex.getMessage();
			
		
		
	}

}
