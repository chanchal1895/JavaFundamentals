package com.lti.demos4.assertions;

public class d1_usingAssertions {

	
	public enum Seasons {
		SPRING, SUMMER, FALL,WINTER
	}

	//case WINTER IS missing 
	public static void test(Seasons s) {
		switch (s) {
		case SPRING:
		case FALL:
			System.out.println("Shorter hours");
			break;
		case SUMMER:
			System.out.println("Longer hours");
			break;
		default:
			//System.out.println("Invalid season");
			//break;
			assert false : "Invalid season";
		}
	}

	public static void main(String[] args) {
		// 1. control flow invariant
		
		//test (Seasons.SPRING);
		test (Seasons.WINTER);

		
		//Pre-conditions of public methods
		//Assertion should not be used to check the validity of the arguments (pre-condition) passed into "public" method. 
		//It is because public methods are exposed and anyone could call this method with an invalid argument. 
		//Instead, use a if statement to check the argument and throw an IllegalArgumentException otherwise.
		//On the other hand, private methods are under your sole control and it is appropriate to assert the pre-conditions. For example,

	/*	// Constructor of Time class
		public Time(int hour, int minute, int second) {
		   if(hour < 0 || hour > 23 || minute < 0 || minute > 59 || second < 0 || second > 59) {
		      throw new IllegalArgumentException();
		   }
		   this.hour = hour;
		   this.minute = minute;
		   this.second = second;
		}*/
		
	}
}
/*
 * You can use assertions for many reasons, including the following. You won’t
 * be asked to identify the type of assertion on the exam.
 * 
 * Internal Invariants You assert that a value is within a certain constraint.
 * assert x < 0 is an example of an internal invariant.
 * 
 * Class Invariants You assert the validity of an object’s state. Class
 * invariants are typically private methods within the class that return a
 * boolean .
 * 
 * Control Flow Invariants You assert that a line of code you assume is
 * unreachable is never reached.
 * 
 * Preconditions You assert that certain conditions are met before a method is
 * invoked.
 * 
 * Post Conditions You assert that certain conditions are met after a method
 * executes successfully.
 */