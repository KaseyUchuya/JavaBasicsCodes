package com.syntax.class04;

public class Homework {
	
	public static void main(String[] args) {
	// task-2; Write a program to check whether number is positive or negative.
	int num = 0;
	
	// 1st way
//	if (num > 0) {
//		System.out.println("Number is positive!");
//	} else if (num < 0) {
//	System.out.println("Number is negative!");	
//	}else{
//		System.out.println("Number is zero!");
//	}
		
	// 2nd way
	if (num > 0) {
		System.out.println("Number is positive!");
	} else if (num == 0) {
		System.out.println("Number is zero");
		} else {
		System.out.println("Number is negative!");
		}
		
		// task-3: Check whether the number is odd or even
		int num3 = 0;
		int remainder = num3 % 2;
		
		if (remainder == 0) {
		System.out.println(num3 + " is even!");
		} else {
		System.out.println(num + "is odd!");	
		
		}

	}
}