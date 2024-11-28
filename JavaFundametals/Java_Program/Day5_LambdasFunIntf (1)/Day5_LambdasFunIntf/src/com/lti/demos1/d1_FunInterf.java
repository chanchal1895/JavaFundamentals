package com.lti.demos1;

interface Power 
{
	public double pow(double x, double y);
}
public class d1_FunInterf {
	public static void main(String[] args) {		
		
		double x=5,y=3;
		
		Power p= (a,b) ->  Math.pow(a,b); // don't declare Power p= (x,y) ..
		
		double res= p.pow(x, y);
		System.out.println(res);
		
		
		
	}
}