package com.syntax.class10;

public class ArrayEvenInt {

	public static void main(String[] args) {
		
               
		int[][] integers= {
				{2, 8, 1, 6, 4, 3, 2},
				{8, 9, 3, 2, 8, 1, 5},
				{7, 4, 8, 3, 2, 9, 5}
		};
		
			for(int n=0; n<integers.length; n++) {
				
				for(int e=0; e<integers[n].length; e++)
					
				if(integers[n][e]%2==0) {
					System.out.println("The even integers are: "+integers[n][e]);
				
					
				}
			}
		}
		
		

	}


