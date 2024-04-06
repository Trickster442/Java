package com.lab2;

public class While_Loops {

	public static void main(String[] args) {
		//While loops are used to run chunk of code repeatedly until
		//conditions are false
		int x = 3;
		while(x <= 1024) {
			System.out.println(x + " ,");
			x *= 5;
		}
		
		//for loops 
		//for loops are used to run code for required number of times
		// initialization
		//up to where
		//update
		for(int i = 0; i < 10 ; i++) {
			System.out.println(i + ", ");
		}
		
		
		for(int n = 10; n > 0 ; n--) {
			String word = "bottle";
			if (n <= 1) {
				System.out.println(n + " green " + word + ", hanging on the wall");
				System.out.println(n + " green " + word + ", hanging on the wall");
				System.out.println("And if one green bottle");
				System.out.println("should accidentally fall");
				System.out.println("There'll be " + (n-1) +" green "+ word + ",");
				System.out.println("hanging on the wall");
				System.out.println();
			}
			else {
			System.out.println(n + " green bottles, hanging on the wall");
			System.out.println(n + " green bottles, hanging on the wall");
			System.out.println("And if one green bottle");
			System.out.println("should accidentally fall");
			System.out.println("There'll be " + (n-1) +" green bottles, ");
			System.out.println("hanging on the wall");
			System.out.println();
			}
			
		}
	}

}
