package com.syntax.class05;

public class HW2 {

	public static void main (String []args) {
	int num1 = 15;
	int num2= 44;
	int num3= 23; 
	
	if(num1 >= num2) {
		
		if(num1 >= num3) {
			System.out.println(num1 + "is the largest number");
		}else {
			System.out.println(num3 + "is the largest number");
		}
		
	}else { //otherwise num2>num1
		
		if (num2>=num3) {
			System.out.println(num2 + "is the largest number");
		}else { //num3>num2
			
			System.out.println(num3 + "is the largest number");
		}
	}
  }
}