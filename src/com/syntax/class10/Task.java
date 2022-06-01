package com.syntax.class10;

public class Task {

	public static void main(String[] args) {
		
		//From an array of integer elements find the largest number
		
		int[] elements= {21, 74, 11, 9, 35, 80, 16};
		
		int max = elements[0];
		
		for(int k = 1; k<elements.length; k++) {
			
			if(elements[k]> max) {
				max=elements[k];
			}
		}
			System.out.println("The largest element is "+max);
		
		
		}
	}

