package com.syntax.class04;

public class NestingElseIf {

	public static void main(String[] args) {
		// If student completed the quiz we'll check the score
		// If score > 90 --> Great job!
		// If score > 80 --> Well done!
		// If score > 70 --> Just passed!
		// otherwise --> F, You failed!
		//
		// If student didn't complete the quiz, Please finish your quiz!
		
		boolean completed = true;
		int score = 82;
		
		if (completed) {
			//Let's check the score
			
			if (score >90) {
				System.out.println("A, Great job!");
			}
			
			if (score >= 80) {
			   System.out.println("B, well done!");
			}
			
			if (score >= 70) {
			System.out.println("C, just passed!");
			
		} else {
			System.out.println("F, you failed!");
		}
		
	} else {
			System.out.println("Please finish your quiz!");
		}
		}

}
