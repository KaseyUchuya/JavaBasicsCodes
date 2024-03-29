package com.syntax.class10;

public class AnotheryWayOf2DArray {

	public static void main(String[] args) {
		/*
		 * create 2d array of states
		 * 
		 * 1 array -> NY --> all cities of NY state
		 * 2 array -> CA --> all cities of CA state
		 * 3 array -> FL --> all cities of FL state
		 * 4 array -> VA --> all cities of VA state
		 */
		
		String[][] usa= {
				
				{"New York", "Albany", "Buffalo"},
				
				{"Los Angeles", "San Fransisco", "San Jose", "San Diego", "Redding"},
				
				{"Miami", "Orlando", "Niceville", "Tampa"},
				
				{"McLean", "Richmond", "Leesburg"}
				
		};
		
			System.out.println(usa[1][2]); //San Jose
			System.out.println("I want to go to "+usa[2][0]);//Miami
			
			System.out.println("Total # of 1D arrays in array usa = "+usa.length);//4
			
			//I want to see how many elements are inside my first array
			int elem1array=usa[0].length;
			System.out.println("# of elements in 1st array = "+elem1array);
			
			//I want to see how many elements are inside my second array
			int elem2array=usa[1].length;
			System.out.println("# of elements in 2nd array = "+elem2array);
		}
	}


