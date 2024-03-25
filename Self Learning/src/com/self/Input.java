package com.self;
import java.util.Scanner ;
//to take user input first import Scanner from java.util

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Taking user Input");
		Scanner sc_obj = new Scanner(System.in);
		//create object for scanner class
		System.out.println("Enter number 1");
		int a = sc_obj.nextInt();
		boolean z = sc_obj.hasNextInt(a);
		//hasNextInt method of scanner can be used to check whether value was inserted
		System.out.println(z);
		//for integer we use nextInt you can use various other method for various data types
		System.out.println("Enter number 2");
		int b = sc_obj.nextInt();
		int sum = a + b ;
		System.out.println("The sum of two number is : "+ sum);
	}

}
