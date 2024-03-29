package com.syntax.class02;

public class ArithemeticOperatorsDemo {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		int sum = num1 + num2;
		int sub = num1 - num2;
		int div = num1 / num2;
		int mult = num1 * num2;
		
		System.out.println("addition ->" + num1 + num2);
		
		System.out.println("addition -> " + sum);
		System.out.println("subtraction -> " + sub);
		System.out.println("division -> + div");

		double d1 = 3.4;
		double d2 = 5.73;
		double dSum = d1 * d2;
		System.out.println("Double addition -> " + dSum);
		
		// you can store an integer as a double
		double dSum2 = num1 + num2;
		System.out.println("dSum2 -> " + dSum2);
		
		System.out.println("**************");
		//order of operation
		System.out.println("Ahmet_" + 10 + 30);
		
		//first parenthesis, then concatenation
		System.out.println("Ahmet_" + (10 + 30));
		
		// first multiplication then concatenation 
		System.out.println("Ahmet_" + 10 * 30);
		
		
		
	}

}
