package com.lti.demos5.exceptions;

public class CustomExp1 implements AutoCloseable {

	public void close() {
		System.out.println("something went wrong with close() method !!");
	}

	public static void main(String[] args) {
		try (CustomExp1 c = new CustomExp1()) {
			System.out.println("hello ...");
		}
	}

}
