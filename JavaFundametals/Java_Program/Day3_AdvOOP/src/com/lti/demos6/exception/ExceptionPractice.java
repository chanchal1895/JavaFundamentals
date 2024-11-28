package com.lti.demos6.exception;

public class ExceptionPractice
{
	public float parseFloat(String s){
		   float f = 0.0f;
		   try{
		      f = Float.valueOf(s).floatValue();
		      System.out.println(Float.valueOf(s).getClass());
		      System.out.println(f);
		      return f ;
		   }
		   catch(NumberFormatException nfe){
		      System.out.println("Invalid input " + s);
		      f = Float.NaN ;
		      return f;
		   }
		   
		   finally { System.out.println("finally");  }
		   
		  // return f ;
		}
	
	public float parseFloat1( String s ){
	     float f = 0.0f;      // 1
	     try{
	          f = Float.valueOf( s ).floatValue();    // 2
	         return f ;      // 3
	     }
	     catch(NumberFormatException nfe){
	        f = Float.NaN ;    // 4
	      // return f;     // 5
	     }
	     finally {
	       //  return f;     // 6
	    	 System.out.println("finally");
	     }
	     System.out.println("finally");
	     return f ;    // 7
	 }
}
