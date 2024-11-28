package com.lti.demos1;

public class MaxFinderWithoutlambda implements MaxFinder {

	@Override
	public double maximum(double num1, double num2) {

		if (num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}
}
