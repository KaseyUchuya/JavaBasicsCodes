package com.syntax.class04;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		//Capture the name from the user and print
		// Your name is ___
		
		//Ask the user to enter the age and print
		//Your name is ___ and age is ___
		
		Scanner input = new Scanner(System.in);      
		
		// We are instructing the user what to enter
		System.out.println("Please enter your full name!");
		// We are capturing the whole line into a text variable
		String name = input.nextLine();
		System.out.println("Your name is" + name);
	
		// We are instructing the user what to enter
		System.out.println("Please enter your age as a double!");
		// We are capturing the text as a double 
		//
		double albanianAge = input.nextDouble();
		System.out.println("Your name is" + name + " ans age is " + albanianAge);
	}

}
