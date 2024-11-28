package com.lti.demos;

public class UserApp {
	
	
	public static void main(String[] args) {	
		
		MaxFinder mf = (num1,num2) -> num1>num2?num1:num2;			
		
		//MaxFinder mf= new MaxFinderImpl();		
		double result=mf.maximum(500, 200);
		System.out.println(result);
		
		
		
		
	}

}
