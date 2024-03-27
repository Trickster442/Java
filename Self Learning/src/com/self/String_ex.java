package com.self;

public class String_ex {
	public static void main(String[] args) {
		//String is an class 
		//Like other class you can use String in object way
		String name = new String("Sandip"); 
		System.out.println(name);
		
		//Due to its excess use it can also be used as datatypes
		//It is an immutable data types, it can't be changed once declared
		String name_s = "Sandip " ;
		System.out.println(name_s);
		
		//Use of system.out.printf 
		// %d is for int - it is an format specifier
		// %f for float
		// %c for char
		// %s for string
		float a = 8.9999f ;
		int b = 9 ;
		String caste = "Magar" ; 
		char z = 'Z' ;
		
		System.out.printf("You can use format specificier for float %f for double %d for string %s for char %c ", a, b, caste, z);
	}
}
