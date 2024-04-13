package com.self;

public class recursion {
	
	static int factorial(int a) {
		if (a == 0 || a ==1) {
			return 1 ;
		}
		else {
			return a * factorial(a-1);
		}
	}

	public static void main(String[] args) {
		// the method of calling function by itself
		
		System.out.println("The factorial value is: " + factorial(4));
	}

}
