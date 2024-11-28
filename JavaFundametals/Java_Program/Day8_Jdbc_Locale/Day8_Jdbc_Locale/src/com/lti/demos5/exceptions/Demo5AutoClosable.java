package com.lti.demos5.exceptions;

public class Demo5AutoClosable implements AutoCloseable {
	int num;

	Demo5AutoClosable(int num) {
		this.num = num;
	}

	public void close() {
		System.out.println("Close: " + num);
	}

	public static void main(String[] args) {
		try (Demo5AutoClosable a1 = new Demo5AutoClosable(1); Demo5AutoClosable a2 = new Demo5AutoClosable(2)) {
			throw new RuntimeException();
		} catch (Exception e) {
			System.out.println("ex");
		} finally {
			System.out.println("finally");
		}

	}

}
