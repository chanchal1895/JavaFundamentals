package com.lti.demos3.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//why and how to resolve java.util.stream.ReferencePipeline$
// when  missing a terminal operation to consume the stream. 
//Try adding something like .collect(Collectors.toList())



/*
 * /*
 *  Java forEach loop
        Java provides a new method forEach() to iterate the elements. 
        It is defined in Iterable and Stream interface.
        It is a default method defined in the Iterable interface. 
        Collection classes which extends Iterable interface can use forEach loop to iterate elements.

        This method takes a single parameter which is a functional interface. 
        So, you can pass lambda expression as an argument.
 */

public class MyStream {

    public static void main(String[] args) {
        //Finite stream
        Stream<String> empty = Stream.empty(); 

        Stream<Integer> singleElement = Stream.of(1); 
        
        Stream<Integer> fromArray = Stream.of(1, 2, 3);
        System.out.println(fromArray);
        
        
		 //list to stream 
        
        List<String> list = Arrays.asList("a", "b", "c");    
        
		  Stream<String> fromList = list.stream(); 	  		  
		  
		  Stream<String> fromListParallel =  list.parallelStream();
		  
		//Infinite Stream 
		  
		/*
		 * Stream<Double> randoms = Stream.generate(Math::random);
		 * 
		 * randoms.forEach(System.out::println);
		 */
			
		  
		 // Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);
		  
		 // oddNumbers.forEach(x -> System.out.println(x + ","));
		 
		 
    }
}












