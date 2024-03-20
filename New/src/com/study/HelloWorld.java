package com.study;

public class HelloWorld {

	public static void main(String[] args) {
		
		int num1 = 5 ;
		int num2 = 10 ;
		int sum = num1 + num2 ;
		System.out.println(sum);
		System.out.println("Hellow");
		System.out.println();
		
		System.out.println("Arithmetic Operator");
		System.out.println(1+1);
		System.out.println(5-2*3);
		System.out.println((5-2)*3);
		System.out.println(4.5+6.7);
		System.out.println(3-2.1);
		System.out.println(6/2);
		System.out.println(7/2);
		System.out.println(7.0/2.0);
		System.out.println(8%2);
		System.out.println(9%2);
		System.out.println();
		
		HelloWorld z = new HelloWorld() ;  //creating object for class
		z.calculate(6, 7);   //accessing calculate method of class 
		System.out.println(z.calculate(6, 7));
		System.out.println();
		
		
		System.out.println("Comparison Operations");
		System.out.println(1+1 == 2);
		System.out.println(1+1 != 3);
		System.out.println(1<3);
		System.out.println(1>3);
		System.out.println(3<=3);
		System.out.println(3>=1);
		System.out.println();
		
		
		System.out.println("Logical Operations");
		System.out.println(true && false);
		System.out.println(true || false);
		System.out.println(!false);
		System.out.println();
		
		System.out.println("String Operations");
		System.out.println("Hello," + "world!");
		System.out.println("Catch" + 22);
		System.out.println("A piece of string".length());
		System.out.println("ABCDEFG".charAt(3));
		System.out.println("MMXVIII".toLowerCase());
		System.out.println("Yellow Submarine".startsWith("Yellow"));
		
		System.out.println();
		
		System.out.println("Type Conversion");
		System.out.println((double)5);
		System.out.println((int)5.3);
		System.out.println((int)'a');
		System.out.println((char)120);
		System.out.println(String.valueOf(1234));
		System.out.println(Integer.parseInt("5678"));
		System.out.println(Double.parseDouble("3.14159"));
		System.out.println();
		System.out.println();
		
		System.out.println(1 + 1.5);
		System.out.println("a" + "b");
		System.out.println("1" + 1.5);
		System.out.println('a' + 'b');
		System.out.println('a' + 1);
		System.out.println(false || !false);
		System.out.println("Hello".length());
		
		
		//creating variables
		int age = 19 ;
		char grade = 'A';
		double gigaWatts = 1.21;
		Boolean isBlue = true;
		String phoneNumber = "555-1234";

	}
	
	public int calculate(int a , int b) {
		int c = a + b ;
		return c;
	}

}
