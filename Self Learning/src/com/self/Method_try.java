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
	}
	
	public static void main(String[] args) {
		int a = 5 ;
		int b = 8 ;
		int c = logic(a, b);
		System.out.println(c);
	}
	
}
