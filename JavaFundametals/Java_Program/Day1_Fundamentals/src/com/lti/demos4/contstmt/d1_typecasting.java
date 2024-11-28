package com.lti.demos4.contstmt;

public class d1_typecasting {

	public static void main(String[] args) {

		// int x='a';
		// System.out.println(x);//97

		// double d=10;
		// System.out.println(d);//10.0

		/*
		 * Whenever we are assigning bigger data type value to the smaller data type
		 * variable then explicit type casting is required. 3. Also known as Narrowing
		 * or down casting. 4. There may be a chance of lose of information in this type
		 * casting. 5. The following are various possible conversions where explicit
		 * type casting is required.
		 */

		/*
		 * int x=130; byte b=(byte)x; // System.out.println(b); //-126
		 */

		// When ever we are assigning higher datatype value to lower datatype value
		// variable by explicit type-casting ,
		// the most significant bits will be lost i.e., we have considered least
		// significant bits.

		/*
		 * int x=150; short s=(short)x; byte b=(byte)x; System.out.println(s); //150
		 * System.out.println(b); //-106
		 */

		// When ever we are assigning floating point value to the integral types by
		// explicit type casting ,		// the digits of after decimal point will be lost .

		double d = 130.456;

		int x = (int) d;
		System.out.println(x); // 130

		byte b = (byte) d;
		System.out.println(b); // -206
		
		//

	}
}
