package com.lti.demos1.strings;

public class Demo1 {
	public static void main(String[] args) {

		// If both operands are numeric, + means numeric addition.
		// If either operand is a String, + means concatenation.
		// The expression is evaluated left to right.

		System.out.println(1 + 2);
		System.out.println("a" + "b");
		System.out.println("a" + "b" + 3);
		System.out.println(1 + 2 + "c");

		int three = 3;
		String four = "4";
		System.out.println(1 + 2 + three + four);

		String s = "1";
		s += "2";
		s += 3;
		System.out.println(s);
		
		
		

	}
}
