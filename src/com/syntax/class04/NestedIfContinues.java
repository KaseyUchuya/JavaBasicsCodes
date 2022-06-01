package com.syntax.class04;

public class NestedIfContinues {

	public static void main(String[] args) {
		// check if patient has allergies
		// If no allergies --> You're healthy
		// otherwise:
		// If peanut allergy: Don't eat peanut
		// Lactose allergy: Don't drink milk
		// Bee allergy: Don't mess with bees
		// Seafood allergy: Don't eat fish
		
	boolean allergies = true;
	boolean peanut = true;
	boolean lactose = false;
    boolean bee = true;
    
    if (!allergies) {
    	// No allergy
    	System.out.println("You're healthy!");
    } else {
       //we have to check which allergy
    	if (peanut) {
    	System.out.println("Don't eat peanut!");
    	} 
    	
    		if (lactose) {
        System.out.println("Don't dring milk!");
    	}
    		
    	if (bee) {
        System.out.println("Don't mess with bees");
    	}
    }
		
	}

}
