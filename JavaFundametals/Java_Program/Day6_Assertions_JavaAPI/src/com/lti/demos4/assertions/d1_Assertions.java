package com.lti.demos4.assertions;

//word-->assert--> state that is true, where you expect something to be true.

public class d1_Assertions {
	public static int methodOne()
	{
	return 999;
	}
	
	public static void main(String[] args) {
		
		//int assert=10;  assert is keyword can't use as a variable name 
		//System.out.println(assert);
		
		//Types of assert statements:
		//1.//Simple version : assert(b);//b should be boolean type.
		
	/*	int x=10;	
	  ;;;;;;;;;
		assert(x>10);	
		;;;;;;;;;	 
		System.out.println(x); //10  */
		
		//Note: By default assertions are disable and hence they won't be executed by default we 
		//have to enable assertions explicitly by using -ea option.
		
		//demo pgm  -> run configuration--> vm arguments -> -em 
		
		//**** Keep an eye out for a question that contains an 	assert statement but that is not executed with assertions enabled; 
		//the assert statement is ignored in that situation.
		
		//2. //and Argumented version 
		//Syntax: assert(b):e;  		'b' should be boolean type.		'e' can be any type. 
		//'e' will be evaluated if and only if 'b' is false that is if 'b' is true then 'e' won't be 		evaluated
		
/*	int x=10;		
		assert(x>10):"here x value should be >10 but it 	is not";		
		System.out.println(x); 
		
	 */
	
	// 2nd argument we can take method call also but void type method call not  	allowed
		
		int x=10;
		;;;;;;;;;
		assert(x>10):methodOne();
		;;;;;;;;;
		System.out.println(x);
	
		
		/*Various runtime flags:
			1. -ea: To enable assertions in every non system class(user defined classes).
			-enableassertions: It is exactly same as -ea.
			2. -da: To disable assertions in every non system class.
			-disableassertions: It is exactly same as -da.
			3. -esa: To enable assertions in every system class(predefined classes or application 
			classes).
			-enablesystemassertions: It is exactly same as -esa.
			4. -dsa: To disable assertions in every system class.
			-disablesystemassertions: It is exactly same as -dsa.*/
	}

}

/*
The most common way of debugging is uses of sops. But the main disadvantage 
of sops is after fixing the bug compulsory we should delete extra added sops 
otherwise these sops also will be executed at runtime which impacts performance 
of the system and disturbs logging mechanism.
2. To overcome these problems sun people introduced assertions concept in 1.4 
versions.
3. The main advantage of assertions over sops is based on our requirement we can 
enable or disable assertions and by default assertions are disable hence after 
fixing the bug it is not required to delete assert statements explicitly.
4. Hence the main objective of assertions is to perform debugging.
5. Usually we can perform debugging either in development environment or Test 
environment but not in production environment hence assertions concept is 
applicable for the development and test environments but not for the production.
*/

//Why Assertions?

//Java assertions are built on top of Java exceptions and exception handling. Indeed, when a Java assertion fails, the result is an AssertionError exception that can be caught like any other Java exception. 
//The key differences between exceptions and assertions are:

//Assertions are intended to be used solely as a means of detecting programming errors, aka bugs. 
//By contrast, an exception can indicate other kinds of error or "exceptional" condition; e.g. invalid user input, missing files, heap full and so on.

//JDK 1.4 introduced a new keyword called assert,
//to support the so-called assertion feature. 
//Assertion enables you to test your assumptions about your program logic (such as pre-conditions, post-conditions, and invariants).
//Each assertion contains a boolean expression that you believe will be true when the program executes. 
//If it is not true, the JVM will throw an AssertionError. 
//This error signals you that you have an invalid assumption that needs to be fixed.
//Assertion is much better than using if-else statements, as it serves as proper documentation on your assumptions, 
//and it does not carry performance liability in the production environment 


