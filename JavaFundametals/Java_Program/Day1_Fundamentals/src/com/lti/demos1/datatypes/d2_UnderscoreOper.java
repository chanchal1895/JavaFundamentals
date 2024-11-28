package com.lti.demos1.datatypes;

//https://docs.oracle.com/javase/7/docs/technotes/guides/language/underscores-literals.html


public class d2_UnderscoreOper {
	public static void main(String[] args) {
		
		
		//The following example shows other ways you can use the underscore in numeric literals:

		long creditCardNumber = 1234_5678_9012_3456L;
		long socialSecurityNumber = 999_99_9999L;		
		float pi = 	3.14_15F;	
		
		//You can place underscores only between digits;
		//you cannot place underscores in the following places:

		//At the beginning or end of a number
		//Adjacent to a decimal point in a floating point literal
		//Prior to an F or L suffix
		//In positions where a string of digits is expected
		//The following examples demonstrate valid and invalid underscore placements (which are highlighted) in numeric literals:

	//	float pi1 = 3_.1415F;      // Invalid; cannot put underscores adjacent to a decimal point
		
	//	float pi2 = 3._1415F;      // Invalid; cannot put underscores adjacent to a decimal point
	//	long socialSecurityNumber1   = 999_99_9999_L;         // Invalid; cannot put underscores prior to an L suffix

		//int x1 = _52;              // This is an identifier, not a numeric literal
	
		int x2 = 5_2;              // OK (decimal literal)
		//int x3 = 52_;              // Invalid; cannot put underscores at the end of a literal
		int x4 = 5_______2;        // OK (decimal literal)


	}

}
