package com.lti.demos1.datatypes;

//import java.sql.Date;
//import java.util.Date;
import java.lang.Math.*;
import java.util.Random;
/* redudendent imports */
import java.lang.System; //java.lang is automatically considered to be imported.
import java.lang.*;//java.lang is automatically considered to be imported.
// import java.util.*;// Random is already imported from java.util.Random so this is unncessory 
 
//Another case of redundancy involves importing a class that is in the same package as the class importing it. 
//Java automatically looks in the current package for other classes.
  //see page 58  for MCQ 
/*Classes in the same package are often imported together. 
 *You can use a shortcut to import all the classes in a package:
import java.util.*; // imports java.util.Random among other things

In this example, we imported java.util.Random and a pile of other classes. 
The * is a wildcard that matches all classes in the package. 
Every class in the java.util package is available to this program when Java compiles it. 
It doesn’t import child packages, fields, or methods; it imports only classes.
*/
public class d3_imports {
	public static void main(String[] args) {		
		
		
		
		Random r = new Random(); 
		System.out.println(r);
		
		//Naming Conflict
		
		java.sql.Date  d= new java.sql.Date(10/5/21);
		
		java.util.Date d1= new java.util.Date();		
		
		System.out.println(d);
		
		Math.sqrt(25);		
		
		
				
	
		
		
		
	}
}




