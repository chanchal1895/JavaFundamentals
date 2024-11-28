package com.lti.demos3.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NowJava8 {
	public static void main(String[] args) {	
		
		//Example 1:
        List<String> lines = Arrays.asList("Java", "DotNet", "Oracle","SQLServer");

        List<String> result = lines.stream()                // convert list to stream
                				.filter(l -> !"DotNet".equals(l))   
                				.collect(Collectors.toList());    // collect the output and convert streams to a List

        result.forEach(System.out::println);                //output : spring, node
        
        
        /*//Example 2: 
      //Old way:
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
       
        for(Integer n: list) {
        	System.out.println(n);
        }

        //New way:
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        
        list1.forEach(n -> System.out.println(n));


        //or we can use :: double colon operator in Java 8
        list1.forEach(System.out::println);*/
        
    }

}
