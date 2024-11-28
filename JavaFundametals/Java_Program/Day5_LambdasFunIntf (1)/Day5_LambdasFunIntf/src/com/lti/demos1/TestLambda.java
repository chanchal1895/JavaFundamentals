package com.lti.demos1;
//Effectively final means that it is never changed after getting the initial value. 
//Here, a is not declared final, but it is considered effectively final since it is never changed. 
//In Java 7 and earlier versions, a had to be declared final to be able to be used in an local class like this,
//but from Java 8 it is enough that it is effectively final.

public class TestLambda {
public static void main(String[] args) {
	
	String nonFinal = "I am non final local variable"; 
	//nonFinal="hello";
	
	
	Runnable r = new Runnable() 
	{ 
		@Override public void run()
		{ 
	
			System.out.println(" non-final  : " + nonFinal); 
			// compile time error - must be final or effective final 
			 //nonFinal = "Can I change non-final variable inside anonymous class"; 
			} }; 
			
			Thread t = new Thread(r); t.start();
		}
	}
//, a lambda can’t access private variables in another class