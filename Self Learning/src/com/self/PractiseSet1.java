package com.self;
import java.util.Scanner ;

public class PractiseSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Practice 1
		int a = 5 ;
		int b = 9 ;
		int c = 10 ;
		int sum = a+b+c ;
		System.out.println(sum);
		
		
		// to print cgpa from 3 subjects
		float sub1 = 92;
		float sub2 = 78;
		float sub3 = 83;
		float cpga = (sub1 + sub2 + sub3)/30 ;
		System.out.println(cpga);
		
		// Question 3;

		
		System.out.println("What is your name :");
		Scanner sc_ob = new Scanner(System.in);
		String name = sc_ob.next();
		System.out.println("Hello, " + name + " have a good day");
		
		

	}

}
