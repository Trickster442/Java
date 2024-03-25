package com.self;
import java.util.Scanner;
public class Exer_1 {
	public static void main (String [] args) {
		//To write to calculate CBSE percentage from 5 subjects
		Scanner input = new Scanner(System.in);
		float total = 0f;
		System.out.println("Enter your marks out of 100 !!!");
		System.out.println("Enter your sub1 marks : ");
		float sub1 = input.nextFloat();
		System.out.println("Enter your sub2 marks : ");
		float sub2 = input.nextFloat();
		System.out.println("Enter your sub3 marks : ");
		float sub3 = input.nextFloat();
		System.out.println("Enter your sub4 marks : ");
		float sub4 = input.nextFloat();
		System.out.println("Enter your sub5 marks : ");
		float sub5 = input.nextFloat();
		
		total = ((sub1 + sub2 + sub3 + sub4 + sub5)/500)* 100 ;
		System.out.println("Your total percentage is: " +total);
		
	}
}
