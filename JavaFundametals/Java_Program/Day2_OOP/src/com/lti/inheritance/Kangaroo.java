package com.lti.inheritance;

/*Overriding basically supports late binding. 
 * Therefore, it's decided at run time which method will be called. It is for non-static methods.
 */

//Hiding is for all other members (static methods, instance members, static members). It is based on the early binding.
// More clearly, the method or member to be called or used is decided during compile time.
//Static methods are hidden, non-static methods are overriden. 

//Overriding Vs Hiding 

/*
 If both method in parent class and child class are an instance method, it called overrides.
If both method in parent class and child class are static method, it called hiding.
One method cant be static in parent and as an instance in the child. and visa versa.

In method overriding, method resolution is done by the JVM on the basis of runtime object. 
Whereas in method hiding, method resolution is done by the compiler on the basis of reference.

0

This is the difference between overriding and hiding:

Animal a = new Cat();

a.testClassMethod() will call the method in parent class since it is an example of method hiding. 
The method to be called is determined by the type of the reference variable and decided at compile time.

a.testInstanceMethod() will call the method in child class since it is an example of method overriding. 
The method to be called is determined by the object which is used to call the method at runtime.
 */
class Marsupial {
	
	public static boolean isBiped() {  // class method // class vari
		return false;
	}
	//it is replaced at runtime in the parent class with the call to the child class’s method

	public void getMarsupialDescription() {
		System.out.println("Marsupial walks on two legs: " + isBiped());
	}
}

public class Kangaroo extends Marsupial {
	public static  boolean isBiped() { 
		return true;
	}

	public void getKangarooDescription() {
		System.out.println("Kangaroo hops on two legs: " + isBiped());
	}

	public static void main(String[] args) {
		Kangaroo joey = new Kangaroo();
		joey.getMarsupialDescription();
		joey.getKangarooDescription();
	}
}

// final methods can't override 
//when you’re defi ning a parent class and want to guarantee certain behavior of a method in the parent class, 
//regardless of which child is invoking the method

// provides immutability // thread safty and security 
//String methods - we  don't create subclass and override -  