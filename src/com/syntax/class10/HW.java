package com.syntax.class10;

public class HW {

	public static void main(String[] args) {
		/*
		 * Create an array to store double values and then print all elements using
		 * different loops
		 */
		
		double[] num = { 2.999, 3.99, 4.99, 5 };
		
		for(double x : num) {
			System.out.println(x+" ");
		}
		
		System.out.println();
		for(int i =0; i <num.length; i++) {
			System.out.println(num[i]+ " ");
		}
		
		//Create an array on integers
		//and calculate the sum  of all elements in an array
		
		int[] numbers= {1,2,3,4,5};
		
		int sum=0;
		
		for(int i=0; i<numbers.length; i++) {
			
			sum=sum+numbers[i];
		}
			System.out.println("Sum of all elements = "+sum);
			
			sum=0;
			
			for(int n:numbers) {
				sum+=n;
			}
			
			System.out.println("Sum of all elements = "+sum);
		}
	}


