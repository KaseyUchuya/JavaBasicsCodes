package com.syntax.class08;

public class LoopsPractice {

	public static void main(String[] args) {
		
		int sum=0;
		
		for(int i = 1; i<6; i++) {
			System.out.println(sum+" ");//0 1 3 6 10
			
			sum+=1;
			
			//System.out.println(i+" "); //1 3 6 10 15
		}
		
		System.out.println();
		System.out.println(sum);//15
		
		/*
		 * write a program to find sum of all even and all odd numbers
		 * from 1 to 70
		 */
		
		int sum2=0;
		
		for(int i=1; i<=70; i++) {
			if (i % 2 !=0) {
				sum2 +=1;
				
			}
			System.out.println("Sum of all odds = "+sum2);
		}
		
	}
		
}