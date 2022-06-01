package com.syntax.class07;

public class WhileLoopExamples {

	public static void main(String[] args) {
		
		// print numbers 1 to 10
		
		int num=1;
		
		while(num<=10) {
			
			System.out.println(num+" ");
			num++;
		}
		

		int num1=1;
		
		while(num<=10) {
			num++;
			System.out.println(num1+" ");
	}
		//print 100 to 100
		System.out.println();
		
		int a=10;
		
		while(a<=100) {
			System.out.println(a+" ");
			a++;
		}
		
		int b=10;
		
		while(b<=10) {
			System.out.print(b);
			b--;
		}
		
		//print numbers from 100 to 50;
		
		int c=100;
		
		while(c>=50) {
		System.out.println(c+ " ");
		c--;
		
		}
		
		//print numbers from -1 to -10
		System.out.println();
		
		int d=-1;
		
		while(d>=-10) {
			System.out.println(d+ " ");
			d--;
		}
		
		//print numbers from 1 to 20 but only even numbers
		System.out.println();
		
		int e=2;
		while(e<=20) {
			System.out.println(e+" ");
			e+=2;
			
		}
		
		//second way
		System.out.println();
		
		int f = 1;
		
		while (f <= 20) {
			
			if (f % 2 == 0) {
				System.out.println(f + " ");
				
				
			}
			
			f++;
			
		}
			//print only odd numbers from 100 to 1
			System.out.println();
			
			int r= 100;
			
			while (r>=1) {
				
				if(r % 2 !=0) {
				
				System.out.println();
		}
		r--;
	}
			
			//another way
			System.out.println();
			int y=99;
			while(y>=1) {
				System.out.println(y+" ");
				y-=2;
			}
}
}
