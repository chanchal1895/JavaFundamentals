package com.lti.demos1.strings;

//compare two strings 

public class Demo2_TestString {
	
public static void main(String[] args) { 
	
	/*String s1 = "1";
	String s2 = s1.concat("2");
	s2.concat("3");
	System.out.println(s2);
	*/
	 	 
    String s1 =new String("Happy");
	String s2 =new String("Birthday");		
	
	s1.concat(s2);	
	System.out.println(s1);	
	
	String s3=s1+s2;	
	System.out.println(s1);	//	check System.out.println(s1);
	System.out.println(s3);
	
	//String s4=s1.concat(s2);		
	//System.out.println(s4);// check System.out.println(s1);
//	String object is immutable( meaning the value stored in the object cannot be changed) 
	//and that when you perform operations such as concat or replace,
	//internally a new object is created to hold the result.
	
	//more effiecient 
	
	StringBuilder sb = new StringBuilder("Happy");
	sb.append("Birthday");
	System.out.println(sb);

	
	/*When the intern() method is executed then it checks 
	 *///whether the String equals to this String Object is in the pool or not.
	
	//If it is available, then the string from the pool is returned.
	//Otherwise, this String object is added to the pool and a reference to this String object is returned.
	//It follows that for any two strings s and t, 
	//s.intern() == t.intern() is true if and only if s.equals(t) is true.
	   

}
}


/*char x='p';

String word;

//assign the string to the variable:
word = "Alexander";
//preform some actions on the string:

//1. retrieve the length by calling the
//length method:

int length = word.length();
System.out.println("Length: " + length);

//2. use the case functions:
System.out.println("toUpperCase: " + word.toUpperCase());
System.out.println("toLowerCase: " + word.toLowerCase());

//3. use the trim function to eliminate leading
//or trailing white spaces:
word = word.trim();
System.out.println("trim:" + word);

//4. check for a certain character using indexOf()
System.out.println("indexOf('e'): " + word.indexOf('e'));    
System.out.println("Last 'e' is located at index "+word.lastIndexOf('e'));

//5. print out the beginning character using charAt()
System.out.println("first character: " + word.charAt(5));

//6. make the string shorter   

 word = word.substring(3,8);
 System.out.println("shorter string: " + word);
*/
