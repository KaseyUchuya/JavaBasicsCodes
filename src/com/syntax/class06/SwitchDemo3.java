package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String country, favoriteFood;
		
		System.out.println("Please tell me where are you from");
		country=scan.nextLine();
		
		switch (country.toLowerCase()) {
		
		case "Mexico":
			favoriteFood="tacos";
			break;
		case "canada":
			favoriteFood="poutine";
		case "Turkey":
			favoriteFood="lahmacun";
			break;
		case "Pakistan":
			favoriteFood="pati chai";
		case "Eygpt":
			favoriteFood="koshary";
			break;
		case "USA":
			favoriteFood="burgers";
			break;
		default:
			favoriteFood="unknown";
			break;
		}
		
		System.out.println("You are from "+country+" and your favorite food is "+favoriteFood);

	}

}
