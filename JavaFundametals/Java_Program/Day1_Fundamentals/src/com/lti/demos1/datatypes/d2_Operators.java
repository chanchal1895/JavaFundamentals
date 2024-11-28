package com.lti.demos1.datatypes;

public class d2_Operators {

//	/https://toppertips-bx67a.ondigitalocean.app/operators-and-statements-java-8-certification/
	public static void main(String[] args) {

		boolean ans=false;
		System.out.println(ans);
		
		
		// The logical complement operator, !,
		// flips the value of a boolean expression.
		
		
		  boolean x = false; 
		  System.out.println(x); // false x = !x;
		  System.out.println(x); // true
		 

		// Numeric Promotion Rules
		// 1. If two values have different data types, Java will automatically promote	 one of the values to the larger of the two data types.
		// 2. If one of the values is integral and the other is floating-point, Java
		// will automatically promote the integral value to the floating-point value’s	 data type.
		//	3. Smaller data types, namely byte, short, and char, are first promoted to int any time they’re used with a Java binary arithmetic operator,
				// even if neither of the operands is int.
		// 4. After all promotion has occurred and the operands have the same data type, the resulting value will have the same data type as its promoted operands.

		// Ex1 :
		
		//  int x = 13, y = -3; 
		  // x%y = +3 or -3? //result always take sign of numerator
		//  System.out.println(x % y);
		 

		// Example 2
		// What is the data type of x + y?
		
		 
		//double x = 3.21; float y = 2.1f;
		

		/*
		 * int x1 = 2 * 5 + 3 * 4 - 8; // 10 + 12 - 8; System.out.println(x1);
		 */
	
		  
		  
		System.out.println((5 + (-2 + 8) * 3 - 3 % 2) / 2);

		// ( 5 +(6) *3 -3 %2 ) /2
		// ( 5+6*3 -3%2 )/2
		// (5+ 18 -3%2 )/2
		// (5+18 -1 )/2
		// 23-1/2
		// 22/2
		// 11

	

		// Likewise, the negation operator,
		// -, reverses the sign of a numeric expression
		
		/*  double x = 1.21; 
		  
		  System.out.println(x); // 1.21
		  x = -x;
		  System.out.println(x); // -1.21
		  x = -x; 
		  System.out.println(x); // 1.21 */
		  
		//  int x = !5; // DOES NOT COMPILE 
		 // boolean y = -true; // DOES NOT COMPILE
		 // boolean z = !0; // DOES NOT COMPILE
		 

		// In Java 1 and true are not related inany way, just as 0 and false are not
		// related.

		// The following code snippet illustrates this distinction:
		
		  int counter = 0; 
		  System.out.println(counter); // Outputs 0
		  System.out.println(++counter); 		 // Outputs 1 
		  System.out.println(counter); //		  Outputs 1 
		  System.out.println(counter--); // Outputs 1
		  System.out.println(counter); // Outputs 0
		 

		/*
		 * int a = 10, b = 5, c = 1, result; result = a-++c-++b; // 10 - 2 - 6 // 2
		 * 
		 * System.out.println(result);
		 * 
		 * int i = 0; i = i++; i=i++; System.out.println(i);
		 */

		/*
		 * int x = 3; int y = ++x * 5 / x-- + --x;//
		 * 
		 * 
		 * System.out.println("x is " + x); System.out.println("y is " + y);
		 */

		/*
		 * int y = 10; final int x; if(y > 5) { x = 2 * y; } else { x = 3 * y; }
		 */

		// equivalent to
		/*
		 * int y = 10; int x = (y > 5) ? (2 * y) : (3 * y);
		 * 
		 * 
		 */
	}

}
