package com.syntax.class08;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		

		String answer="yes";
		String CreditCard;
		
		Scanner scan = new Scanner(System.in);
		
		do {
		System.out.println("Would you like to apply for credit card with us?");
		CreditCard=scan.next();
		
		}while(CreditCard!=answer);
		
		System.out.println("Lets get you started! ");
		
		scan.close();
	}
		
}	

	


