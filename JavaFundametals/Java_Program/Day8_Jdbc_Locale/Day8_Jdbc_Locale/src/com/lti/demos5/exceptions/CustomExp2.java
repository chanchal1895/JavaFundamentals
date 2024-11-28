package com.lti.demos5.exceptions;

public class CustomExp2 implements AutoCloseable {

	@Override
	public void close() throws Exception {
		throw new Exception(" something went wrong with close() method !!");

	}

	//try withour throws clause
	public static void main(String[] args) throws Exception { 
		// And you know that checked exceptions need to be handled or declared.
		try (CustomExp2 t = new CustomExp2()) {
			System.out.println("Hello Custom Exp " );
		}

	}

}
