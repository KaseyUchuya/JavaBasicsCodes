package com.syntax.class07;

public class PreincrementAndPostincrement {

	public static void main(String[] args) {
	
		int num=10;
		//post increment
		//first use and then increment
		
		int result=num++;
		
		System.out.println("Value of num = "+num);
		System.out.println("value of result = "+result);
		
		int num1=10;
		
		int result1=++num1;
		
		System.out.println("Value of num 1 = "+num1);
		System.out.println("result1 = "+result1);

	}

}
