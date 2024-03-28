package com.self;
import java.util.Scanner;

public class Switch_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Switch case is used when we have to make a 
		 * choice between number of alternative for a
		 * given variables
		 * Syntax : Switch(var){
		 * Case C1:
		 * code
		 * break 
		 * case c2: 
		 * code 
		 * break 
		 * }
		 */
		int age ;
		System.out.println("Enter your age: ");
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		
		
		switch (age){
			case 18:
				System.out.println("You're 18");
				break ;
			case 21:
				System.out.println("You're 21");
				break ;
			default:
				System.out.println("Enjoy your life !!!");
		}
		
		
	}

}
