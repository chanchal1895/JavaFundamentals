/* 1. An exception is an event that alters program flow.
 * 2. Java has a Throwable superclass for all objects that represents these exceptions.
 * 3. Runtime exceptions are also known as unchecked exceptions. 
 * 4. A checked exception includes Exception and all subclasses that do not extend RuntimeException. Checked exceptions tend to be more anticipated—for example, trying 
 *    to read a file that doesn’t exist. For checked exceptions, Java requires the code to either handle them or declare them in the method signature.
 * 5. throw tells Java that you want to throw an Exception. throws simply declares that the method might throw an Exception.
 * 6  When a class overrides a method from a superclass or implements a method from an interface, it’s not allowed to add new checked 
 *	  exceptions to the method signature.
 * 
 * */

package com.lti.demos6.exception;

public class ExceptDemo1 {

	public static void main(String[] args) {
		/*
		 * System.out.print("a");//a try { System.out.print("b");//ab throw new
		 * IllegalArgumentException(); } catch (IllegalArgumentException e) {
		 * System.out.print("c");//abc throw new RuntimeException("1"); } catch
		 * (RuntimeException e) { System.out.print("d"); throw new
		 * RuntimeException("2"); } finally { System.out.print("e"); throw new
		 * RuntimeException("3"); }
		 */
		
		ExceptionPractice ep = new ExceptionPractice();
		ep.parseFloat("13.2");
	}
	
	
}
