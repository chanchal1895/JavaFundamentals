package com.lti.demos7.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/*
 * 
If you have a field that is a generic type, its type parameters are compiled into the class.

If you have a method that takes or returns a generic type, those type parameters are compiled into the class.

This information is what the compiler uses to tell you that 
you can't pass a Box<String> to the empty(Box<T extends Number>) method.


If you have code that uses a generic type, the compiler inserts casts as needed (in the caller) to check types. 
The generic objects themselves are just the raw type; the parameterized type is "erased". 
So, when you create a new Box<Integer>(), there is no information about the Integer class in the Box object.
 */


// uncheked warnings :
/*A warning by which the compiler indicates that it cannot ensure type safety.
The term "unchecked" warning is misleading.  It does not mean that the warning is unchecked in any way.  The term "unchecked" refers to the fact that the compiler and the runtime system do not have enough type information to perform all type checks that would be necessary to ensure type safety. In this sense, certain operations are "unchecked". 
The most common source of "unchecked" warnings is the use of raw types.  "unchecked" warnings are issued when an object is accessed through a raw type variable, because the raw type does not provide enough type information to perform all necessary type checks. 
*/


//http://www.angelikalanger.com/GenericsFAQ/FAQSections/TechnicalDetails.html#FAQ001
class TestClass1 {
	
	  public List getList() {  
		  List myList = new ArrayList();
		  myList.add("hello");
		  return myList;  
		  }

		
	public static void main(String[] args) {
		  List myList = new ArrayList();
		  myList.add("abc");        // unchecked warning
		//read Type safety: The method add(Object) belongs to the raw type TreeSet. 
		//References to generic type TreeSet<E> should be parameterized
		
		//meaning :
		//When the add method is invoked the compiler does not know whether it is safe to add a String object to the collection.  
		//If the TreeSet is a collection that contains String s (or a supertype thereof), then it would be safe.
		//But from the type information provided by the raw type TreeSet the compiler cannot tell. 
		//Hence the call is potentially unsafe and an "unchecked" warning is issued. 
		
		//How to remove these warnings 
		//way 1. "unchecked" warnings are also reported when the compiler finds a cast whose target type is either a parameterized type or a type parameter. 
	//Raw types.  java 5 compatible Collection came after that version 
	//remove using List<String> , List<Object> , List<?> , 	
		
		    
			System.out.println("\n ");
			Map genericsMap = new HashMap();
			
			genericsMap.put("1954", "FORTRAN");
			//String language = genericsMap.get("1954"); //Type mismatch: cannot convert from Object to String
			//System.out.println("Language: " + language);
			
//			/ we instantiate a generic map using the parameterized type as String for generic type. 
			//It provides us the type safety and helps avoid the need for explicit casting.
			
			Map<String,String> genericsMap1 = new HashMap<>();	
			genericsMap1.put("1954", "FORTRAN");
			String language = genericsMap1.get("1954"); 
			System.out.println("Language: " + language);
			
			
	
	}
   
        
	}

