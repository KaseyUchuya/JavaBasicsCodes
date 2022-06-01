package com.syntax.class08;

public class FoorLoopExamples {

	public static void main(String[] args) {
		// I need to print numbers from 1 to 90
		
		
		for(int i=1; i<=90; i++) {
			
			System.out.println(i+" ");
		}	
		
		/*start point
		 * end point
		 * increment/decrement
		 */
		
		System.out.println();
		//I need numbers from 60 to 10
		
		for(int i=60; i>=10; i--) {
			
			System.out.println(i+" ");
		}
		
		System.out.println();
		//what is the output?
		
		for(int i=5; i<=40; i+=5) {
			
			System.out.println(i+" ");
		}
		
		 //break tasks
		//.1 1 t0 100
		
		for(int i=1; i<=100; i++) {
			System.out.println(i+" ");
		}
		
		//2. 100 to 1
		
		for(int i=100; i<=100; i++) {
			System.out.println();
		}
		
		//3. even 20 to 1
		 for(int a=20; a>=1; a-=2) {
			 System.out.println(a+" ");
	}
		 
		 //4. odd 20 to 50
		 for(int i=20; i<=50; i +=2 ) {
			 System.out.println(i+" ");
		 }
		 

}
}
