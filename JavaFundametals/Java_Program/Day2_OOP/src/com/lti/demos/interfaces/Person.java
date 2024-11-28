package com.lti.demos.interfaces;

public interface Person {
	
	
	 void calc();
	 
	 // can declare static methods //must have body 
	 public static void showCompanyLocation()
	 					{
		 					System.out.println("Powai");
		 				}
	 //error if no body specified 
	 // public static void showCompanyLocation();
	 //Rules :
	 //A default method may only be declared within an interface and not within a class or abstract class.
	// 2. A default method must be marked with the default keyword. If a method is marked as default, it must provide a method body.
	// 3. A default method is not assumed to be static, final, or abstract, as it may be used  or overridden by a class that implements the interface
	//4.Like all methods in an interface, a default method is assumed to be public and will not compile if marked as private or protected

	 public default String getRank() {
		 return "First";
		 }

}
