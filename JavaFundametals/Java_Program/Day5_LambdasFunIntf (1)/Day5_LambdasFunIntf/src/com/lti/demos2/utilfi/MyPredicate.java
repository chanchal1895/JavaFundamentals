package com.lti.demos2.utilfi;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

// often used when filtering or matching. 
public class MyPredicate {

	  static public boolean match(String s) {
          Predicate<String> p = str -> str.equals("abc");
          return p.test(s);
       }
	
    public static void main(String[] args) {
    	    	
		
		  Predicate<String> p1 = String::isEmpty;
		  
		  
		  Predicate<String> p2 = x -> x.isEmpty();
		  
		  System.out.println(p1.test("Hello")); 
		  System.out.println(p2.test(""));
		 
        
		  
	        Predicate<String> p = str -> str.equals("abc");
	        String toBeTested = "def";
	        // test predicate with another string
	        boolean result = p.test(toBeTested);
	        if(result) {
	           System.out.println("Strings matched");
	        } else {
	           System.out.println("Strings do not match");
	        }	        
	        
	       //  If you want to create a method that takes a string argument and compares it with “abc”, 
	        //then using Predicate, you can write it as above main

	      boolean ans = match("abc");
	      System.out.println(ans);
	        
	     
	     //   Note that since we are matching string values, the type of Predicate is a String. 
	        //If we want to match integer values, then change the type of Predicate to Integer or use an IntPredicate.


	        

        BiPredicate<String, String> b1 = String::startsWith;
        
        BiPredicate<String, String> b2 = (string, prefix) -> string.startsWith(prefix);
        
        System.out.println(b1.test("chicken", "chick"));
        System.out.println(b2.test("chicken", "abcd"));
        
      

        
        //extra with streams :
        
		
		/*
		 * List<String> numbers = Arrays.asList("25", "72", "50", "100", "34", "67");
		 * 
		 * System.out.println("original list: " + numbers); List<Integer> even =
		 * numbers.stream() .map(s -> Integer.valueOf(s)) .filter(number -> number % 5
		 * == 0) .collect(Collectors.toList()); System.out.println(even);
		 */
		  
		  List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		  
		  System.out.println("Print even numbers:"); evaluate(list, (n)-> n%2 == 0 );
		  
		  System.out.println("Print odd numbers:"); evaluate(list, (n)-> n%2 == 1 );
		  
		  System.out.println("Print numbers greater than 5:"); evaluate(list, (n)-> n >		  5 );
		 
	    
        
    }
    
    public static void evaluate(List<Integer> list, Predicate<Integer> predicate) {
    	
		for(Integer n: list) 
		{
			if(predicate.test(n)) 
			{
				System.out.println(n + " ");
			}
		}
}
}
