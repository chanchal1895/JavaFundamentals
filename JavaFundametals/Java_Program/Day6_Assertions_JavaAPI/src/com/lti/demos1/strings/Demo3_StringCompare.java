package com.lti.demos1.strings;

class Demo3_StringCompare {
	public static void main(String args[]) {
// hash code is an unique id number allocated to an object by JVM. 
//This is what allows objects to be stored/retrieved quickly in a Hashtable.
//The hashcode() method returns the same hash value when called on two objects, 
//which are equal according to the equals() method.

		//	HashCode equals
		
		String s1 = "Hello";		
		String s2 = "Hello";	
		
		String s3 = new String("Hello");	
		
		System.out.println(s1==s2);		
		System.out.println(s1==s3);	
		
			
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());				
	
		
		System.out.println("\n");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
	
	

	}
}