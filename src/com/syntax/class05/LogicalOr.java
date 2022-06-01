package com.syntax.class05;

public class LogicalOr {

	public static void main(String[] args) {
		
		String day="Monday";
		
		if(day.equals("Monday")|| day.equals("Friday")) {
			System.out.println("I have no class");
			
		}else if (day.equals("Tuesday") || day.equals("Wednesday")) {
			System.out.println("I have manual testing class");
			
		}else if (day.contentEquals("Thursday")) {
			System.out.println("I have review class");
			
		}else if (day.contentEquals("Saturday") || day.contentEquals("Sunday")) {
			
		}

	}    

}
