package com.lti.demos;

public class MaxFinderImpl implements MaxFinder{

	@Override
	public double maximum(double num1, double num2) {
		if(num1>num2)	
		{	
			return num1;
		}	
		else	
		{	
			return num2;
		}	

	}

	
}
