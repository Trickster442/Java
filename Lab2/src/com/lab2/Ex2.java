package com.lab2;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = -5 ;
		if (age > 5 & age < 12) {
			System.out.println("You are a child");
			
		} else if(age >= 3 & age <= 5) {
			System.out.println("You're a toddler");
		} else if(age < 3) {
			System.out.println("You're an infant");
		} else if (age >= 68) {
			System.out.println("You're a pensioner");
		} else if(age >= 12 & age <= 18) {
			System.out.println("You're a young adults");
		} else if (age < 0) {
			System.out.println("Invalid");
		}else if (age > 18) {
			System.out.println("You're an adult");
		}
		else {
			System.out.println("Error");
		}
	}

}
