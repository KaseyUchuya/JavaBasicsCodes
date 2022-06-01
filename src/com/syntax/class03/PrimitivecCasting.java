package com.syntax.class03;

public class PrimitivecCasting {

	public static void main(String[] args) {
		//widening, implicit casting, automatically 
		double d = 7;
		System.out.println(d);
		
		// compile time error -> Type mismatch: cannot convert from 
		//double to int

		//narrowing (explicit casting, manually)
		int i = (int) 7.58;
		System.out.println(i);
		
		//narrowing a large number into a byte
		byte b = (byte)123865;
		System.out.println(b);
		
		long l1 = 45;
		long l2 = 234826438223l;
		
		//narrowing/explicit/manually
		//you are trying to fit something from a
		//big box into a small one
		int number1 = (int)l1;
		System.out.println("number1 = " + number1);
		
		int number2 = (int)l2;
		System.out.println("number2 = " + number2 );
		
		
		
		
	}

}
