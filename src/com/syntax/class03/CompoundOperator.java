package com.syntax.class03;

public class CompoundOperator {

	public static void main(String[] args) {
		int num = 100;
		num = num + 100; //200
		System.out.println(num);
		
		num = num + 100;
		System.out.println(num);//300
		
		//We can use compound operators which are shorter
		num +=100;
		System.out.println();

	}

}
