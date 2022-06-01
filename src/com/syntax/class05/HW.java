package com.syntax.class05;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		int age = 17;
		int weight = 110;
		if (age >= 18) {
			if (weight >= 110) {
				System.out.println("You are " + age + " years old, and your weight is " + weight + " lbs.");
				System.out.println("You are eligible to be a donor.");
			} else {
				System.out.println(
						"You are " + age + " years old, and your weight is " + weight + " lbs. It is less then 110 lbs.");
				System.out.println("You are not eligible to be a donor.");
			}
		} else {
			System.out.println("You are not eligible to be a donor. You are younger than 18 years old.");
		}
	}
	
	}


