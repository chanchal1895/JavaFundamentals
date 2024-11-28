package com.lti.demos5.exceptions;
public class CustomExp3 implements AutoCloseable {

	public void close() throws IllegalStateException {
		throw new IllegalStateException("something went wrong with close() method !!");
		//throw new RuntimeException("something went wrong with close() method !!");
	}

	public static void main(String[] args) {
		try (CustomExp3 t = new CustomExp3()) {
			System.out.println("Hello ");
		} catch (IllegalStateException e) {
			System.out.println("caught: " + e.getMessage());
		}
	}

}
