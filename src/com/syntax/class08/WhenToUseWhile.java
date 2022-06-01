package com.syntax.class08;

import java.util.Scanner;

public class WhenToUseWhile {

	public static void main(String[] args) {
	
		  /*
		  * declare a secret number;
		  * you want to ask user to guess your secret number
		  * your code should keep asking to guess until user gets your secret number
		  * once user gets the secret numbers ->
		  */

		
		int secret=4;
		int guessedNum;
		
		Scanner scan = new Scanner(System.in);
		
		do {
		System.out.println("Guess the number I am thinking of: ");
		guessedNum=scan.nextInt();
		
		}while(guessedNum !=secret);
		
		System.out.println("That was my number! ");
		
		scan.close();
	}
		
}	
