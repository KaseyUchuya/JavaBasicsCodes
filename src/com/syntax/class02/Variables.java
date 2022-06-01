package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {
	
	String name = "Kasey";
	String lastName = "Uchuya";
	String grade = "A-";
	String city = "Chicago";
	String state = "IL";
	int phoneNumber1 = 571-786-5995;
			
	grade ="B+";
	city = "Fairfax";
	state = "VA";
	String phoneNumber2 = "571-286-8651";
	
	System.out.println(name);
	System.out.println(lastName);
	System.out.println(city);  
	System.out.println(state);
	System.out.println(grade);
	System.out.println(phoneNumber2);
	
	
	System.out.println("*************");
	
	//b)
	//Change student's city, state, phone number and grade. And print tho
	
	//Not good, because you're not re-assigning
	//String city2 = "Garfield";
	
	
	city = "Garfield";
	state ="NJ";
	
			
	System.out.println("My name is " + name + "and my last name is" + lastName + '.');
	System.out.println("I live in city of " + "state"  );		
	}

}
