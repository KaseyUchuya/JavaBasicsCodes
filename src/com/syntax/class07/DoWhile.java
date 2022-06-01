package com.syntax.class07;

public class DoWhile {

	public static void main(String[] args) {
		
		int num=1;
		
		while(num<=3) {
			System.out.println(num+" ");
			num++;
		}
		
		System.out.println(" --------------  ");
		
		//do while first executes the code
		//and only then checks the condition
		
		int num1=10;
		
		do {
			System.out.println(num+" ");
			num++;
	} while (num1 <= 3);
		
		//print numbers 1to 30 using do while
		
		int b=1;
		
		do {
			System.out.println(b+" ");
			b++;
		}while (b<=30);
		
		System.out.println(" --------- ");
		
		//print even numbers from 70 to 30
		
		int num3 = 70;
		
		do {
			System.out.println(num3+" ");
			num3-=2; //68, 66, 64 etc
		} while (num3>=30);
}
}