package com.self;
import java.util.Arrays;


public class Array {
	public static void main(String[] arg) {
		//Array is of fixed size so you need to declare the limit
		// String [] days = new String[7];
		String[] days = new String [] {"Monday", "Tuesday", "Wednesday"};
		System.out.println(Arrays.toString(days));
		System.out.println(days.length);
		Arrays.fill(days, "Thursday");   //changes all values to given
		System.out.println(Arrays.toString(days));
	}
}

