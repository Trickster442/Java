package com.lab2;

public class TenGreenBottles {
	public static void main(String[] args) {

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
