package Week6;
import java.util.ArrayList;

public class Lecture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] numArray = new int[4];
//		numArray[7] = 9 ;         //since array of length 4 is declared it will throw arrayoutofindex exception
		
//		
//		ArrayList<String> list = new ArrayList<String>();
//		list.add("My");
//		list.add("Name");
//		System.out.println(list.get(2)); //indexoutofBound exception
		double[] arr = new double[0];
		System.out.println(Lecture.mean(arr));
	}
	public static double mean(double[] numbers) {
	    if(numbers.length == 0) {
	        throw new IllegalArgumentException("Empty array");
	    }
	    
	    double total = 0;
	    for(double x : numbers) {
	        total += x;
	    }
	    return total / numbers.length;
	}
	

}
