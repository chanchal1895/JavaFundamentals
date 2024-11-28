package com.lti.demos1;

public class MaxFinderTest {
	public static void main(String[] args)
	{			
		//Test 1
		
		MaxFinder mf= new MaxFinderWithoutlambda();
		double result1 =mf.maximum(200, 300);
		System.out.println(result1 );
		
		
		
		//Test 2: using Lambda
		MaxFinder obj =  (num1,num2) -> num1>num2?num1:num2;		
		//MaxFinder obj =  (num1,num2) ->{ if (num1 > num2) return num1; else return num2;};
		
		
		double result = obj.maximum(35.5, 200.5);// where is actual implementation of this ?
		System.out.println(result);		
	}
}

//MaxFinder obj =  (num1,num2) -> num1>num2?num1:num2;

/*
 * 1 
A lambda expression is an kind of anonymous function

 Simply put, it’s a method without a declaration, i.e., access modifier, return value declaration, and name.
 * 
 * Lambda expressions basically express instances of functional interfaces
 (An interface with single abstract method is called functional interface. An example is java.lang.Runnable).
 Comparable Comparator --> 
 
 lambda expressions implement the only abstract function and  therefore implement functional interfaces

lambda expressions are added in Java 8 and provide below functionalities.

Enable to treat functionality as a method argument, or code as data.
A function that can be created without belonging to any class.
A lambda expression can be passed around as if it was an object and executed on demand.

*/



