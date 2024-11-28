package com.lti.demos5.exceptions;

// Sometimes we may need to rethrow an exception in Java. 
//If a catch block cannot handle the particular exception it has caught, 
//we can rethrow the exception. The rethrow expression causes the originally thrown object to be rethrown.

//Because the exception has already been caught at the scope in which the rethrow expression occurs, 
//it is rethrown out to the next enclosing try block. 
//Therefore, it cannot be handled by catch blocks at the scope in which the rethrow expression occurred. 
//Any catch blocks for the enclosing try block have an opportunity to catch the exception.

// synatx
/*
catch(Exception e) {
System.out.println("An exception was thrown");
throw e;
}
*/
//Why rethrow ?
//Sometimes before propagating the exception to the higher level, 
///we might want to perform some activities. 
//For example, we might want to rollback the DB transaction, log the exception, or send an email.
//We can perform such activities in the catch block and re-throw the exception again.
//In this way, a higher level gets notified that the exception has occurred in the system.

public class ReThrowEx {
	public static void test1() throws Exception {
		System.out.println("The Exception in test1() method");
		//exception to be passed to the calling method. 
		throw new Exception("thrown from test1() method");
	}

	public static void test2() throws Throwable {
		try {
			test1();
		
		} catch (Exception e) {
			System.out.println("Inside test2() method");
			//exception to be passed to the calling method. 
			throw e;
			// throw new Exception(" thrown from test2() method");
		}
	}

	public static void main(String[] args) throws Throwable {
		try {
			test2();
		} catch (Exception e) {
			// System.out.println(e.getMessage());
			
			System.out.println("Caught in main");
			//If the rethrow operation occurs in the main method 
			//then the exception is passed to the JVM and displayed on the console.
			//throw e;
		}
		
		//Ex2:

		/*String name = null;

		try {
		     name.equals("Jay"); // causes NullPointerException
		} catch (Exception e) {
		    // log
		    throw e;
		}*/
		
		//Ex3:
		//Wrapping exceptions // Exception chaining // more clean 
	/*	String name1 = null;

		try {
		     name1.equals("vijay"); // causes NullPointerException
		} catch (Exception e) {
		    // log
		    throw new IllegalArgumentException(e);
		}
		
		*/
		
		
	}

}
