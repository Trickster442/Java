package com.self;

public class Method_try {
	static int logic (int x, int y) {
		int z ;
		
		if (x > y) {
			z = x + y ;
		} else {
			z = x * y ;
		}
		
		return z ;
		
		//why do we use static because to access without creating obj
		// you can access method in two ways
		// directly with static
		// by creating obj 
		// Class_name Obj_name = new Class_name();
		// obj_name.obj();
		
	}
	static void change(int [] arr) {
		arr[0] = 21 ;
	}
	public static void main(String[] args) {
		int a = 5 ;
		int b = 8 ;
		int c = logic(a, b);
		System.out.println(c);
		
		
		//you can create array in this way
		// int [] array_name = {1 , 3, 6 }
		int [] i = {23, 32, 41, 50 };
		change(i);
		System.out.println(i[0]);
		
	}
	
}
