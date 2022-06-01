package com.syntax.class05;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to the DMV");
	
		System.out.println("Please enter your age");
		int age=scan.nextInt(); //capture int
		System.out.println(age);

		if(age>=18) {
			System.out.println("Congrats are recieving a drivers license");
			
		}else {
			System.out.println("you will be issued a learners permit");
		}

	}

}
