package com.lti.demos3.streams;

import java.util.Arrays;
import java.util.List;
/* Streams follow the “what, not how” principle. 
 * While working with Stream API, as a developer, we only need to specify what needs to be done.

Stream can be sequential or parallel. 
A parallel stream is especially useful if program is running on multicore CPU system.
The main reason for using a stream is for its supports 
for sequential and parallel aggregate operations. 

It allows developer to traverse over a collection of elements 
and perform aggregate operations, pipeline two or more operations, 
perform parallel execution, and more. */
import java.util.Optional;

public class AfterJavaGetName 
{
	public static void main(String[] args)
	{
	List<Person> persons = Arrays.asList(
            new Person("Jay", 30),
            new Person("Vijay", 20),
            new Person("Sanjay", 40)
    );
   
	Optional<Person> result1 = persons.stream()      
			// Convert to steam
            .filter(  x -> "Jay".equals(x.getName()))        // we want "Jay" only
            .findAny()  ;                                    // If 'findAny' then return found
           // .orElse(null);           
	// If not found, return null
	
		

    System.out.println(result1);  
    
    
    
    
    
    
    
    
/*
    Person result2 = persons.stream()
            .filter(x -> "Viru".equals(x.getName()))
            .findAny()
            .orElse(null);

    System.out.println(result2);

    
    // multiple conditions 
    
    Person result3 = persons.stream()
            .filter((p) -> "Vijay".equals(p.getName()) && 20 == p.getAge())
            .findAny()
            .orElse(null);

    System.out.println("result 3 :" + result3);

    //or like this
    Person result4 = persons.stream()
            .filter(p -> {
                if ("Vijay".equals(p.getName()) && 30 == p.getAge()) {
                    return true;
                }
                return false;
            }).findAny()
            .orElse(null);

    System.out.println("result 4 :" + result4);*/
    
    
}

}
