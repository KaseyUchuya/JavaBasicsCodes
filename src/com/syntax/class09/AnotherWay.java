package com.syntax.class09;

public class AnotherWay {

	public static void main(String[] args) {
		

		String[] fruits= {"mango","apples","kiwi","pear"};
		
		System.out.println(fruits[2]);
		//fruits[4]="peach"; RE: ArrayIndexOutOfBoundsException: 4
		
		System.out.println("My favorite fruit is "+fruits[0]);//mango
		
		//I want to find a size of an array/how many elements?
		
		int size=fruits.length;
		System.out.println(size);
	}

}
