package com.lti.demos2.utilfi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class HandleException {
	//solution 
			static Consumer<String> exceptionHandledConsumer(Consumer<String> unhandledConsumer) {
			    return obj -> {
			        try {
			            unhandledConsumer.accept(obj);
			        } catch (NumberFormatException e) {
			            System.err.println("Can't format this string");
			        }
			    };
			}
	public static void main(String[] args) {
				
		//if data is ABCD 
		List<String> integers1 = Arrays.asList("44", "ABCD", "145"); 
	//integers1.forEach(str -> System.out.println(Integer.parseInt(str)));  // exc NumberFormat for ABCD  
		
			 //solution  // way 1 without Generics 
		 integers1.forEach(exceptionHandledConsumer(str -> System.out.println(Integer.parseInt(str))));
		

		    
		    
		    
		
}
	
}