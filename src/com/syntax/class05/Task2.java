package com.syntax.class05;

import java.util.Scanner;

public class Task2 {
	
	public static void main(String [] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Hello, do you have a credit card with Spring bank?");
		String Yn =scan.next();
		
		if(Yn.equalsIgnoreCase("no")) {
			System.out.println("We will offer you a credit card ");
			
		}else
			System.out.println("What is the balance on your card");
		int balance=scan.nextInt();
				
		if (balance > 1000) {
			System.out.println("Pay it off immediately");
		}else {
			System.out.println("Go ahead and spend more");
		}
	}

}
