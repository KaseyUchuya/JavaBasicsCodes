package com.syntax.class05;

public class LogicalAnd {

	public static void main(String[] args) {
		
		boolean job=true;
		double salary =100000;
		
		if(job && salary>=100000) {
			System.out.println("I am super duper happy");
			
		}
		
		System.out.println("-------------------------");
		
		boolean study=true;
		boolean homework=true;
		boolean practice=true;
		
		if(study && homework && practice) {
			System.out.println("You will succeed in the course"); 
		}else {
			System.out.println("You will struggle");
	}

}
}