package com.self;

public class varArgs {
	
	static int sum(int ...arr){
		
		// it will take argument as int [] args list of arguments
		int result = 0 ;
		for (int a : arr) {
			result += a ;
		}
		
		return result ;
	}

	public static void main(String[] args) {
		// imagine there are blocks of args you wish to add 
		// you will not create function everytime you wish to increase the argument
		// rather you will create a function with varArgs 
		// which will add all the args passed 
		
		System.out.println("The sum of numbers are :" + sum(4,5,6,7,8,9));
		
	}

}
