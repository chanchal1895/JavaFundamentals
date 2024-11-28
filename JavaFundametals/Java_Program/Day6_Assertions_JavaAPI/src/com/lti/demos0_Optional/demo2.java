package com.lti.demos0_Optional;

import java.util.Optional;

//isPresent() vs ifPresent()
public class demo2 {
	public static void main(String[] args) {
		
		
		Optional<String> gender = Optional.of("MALE");
        String answer1 = "Yes";
        String answer2 = null;

        System.out.println("Non-Empty Optional:" + gender); // gender has a value ,
        System.out.println("Non-Empty Optional: Gender value : " + gender.get()); 
        System.out.println("Empty Optional: " + Optional.empty());

        System.out.println("ofNullable on Non-Empty Optional: " + Optional.ofNullable(answer1));// Optional[Yes]
        System.out.println("ofNullable on Empty Optional: " + Optional.ofNullable(answer2));//Optional.empty // output is not false or not null
        //output is Optional.empty  
        
        
        // java.lang.NullPointerException
      //  System.out.println("ofNullable on Non-Empty Optional: " + Optional.of(answer2));
		
		//isPresent() - returns an Optional with the specified present non-null value.
		
        Optional<String> opt = Optional.of("Jay");
        System.out.println(opt.isPresent());// true 
		
		
       // empty()static method returns an empty Optional instance.
        //No value is present for this Optional.
		
		
        Optional<String> empty = Optional.empty();
        System.out.println(empty.isPresent()); // false 

        // Optional object with the static of API:
        String name = "Jay";
       // Optional.of(name);
        
        System.out.println(Optional.of(name)); //Optional[Jay]
		
		
		
		// // The ifPresent API enables us to run some code on the wrapped value if it is
        // found to be non-null.
        // Before Optional, we would do something like this:
       // String name1 = "Vijay";
        String name1=null;
        
     /*   if (name1 != null) {
         System.out.println(name1.length());
        }*/
      
        
  
        //thorws null pointer exp , so not a better idea , see ofNullable
    //   Optional<String> opt1 = Optional.of(name1);
     //  System.out.println();

      
     // With orElse, the wrapped value is returned if it is present and the argument given to
        // orElse is returned if the wrapped value is absent
        String nullName = null;

        // If a value is present, invoke the specified consumer with the value, 
        //otherwise do nothing.
  
        String name2 = Optional.ofNullable(nullName).orElse("Name not provided ");
        System.out.println(name2);
		
       // return the value if present, otherwise invoke other 
        //and return the result of that invocation.
		
        String nullName3 = null;
        String name3 = Optional.ofNullable(nullName3).orElseGet(() -> "Name not provided ");
        System.out.println(name3);
		
		
        //orElseThrow Optional class API
        //Return the contained value, if present, 
        //otherwise throw an exception to be created by the provided supplier.
		
     /*    String nullName4 = null;
        String name4 = Optional.ofNullable(nullName4)
          .orElseThrow(IllegalArgumentException::new);
        System.out.println(name4);
		*/
		
        
       // get() Optional class API
       // If a value is present in this Optional, returns the value, 
        //otherwise throws NoSuchElementException.
    
     //  String str="Jay";

        
        Optional<String> nullValue= Optional.ofNullable(null);
        System.out.println(nullValue.get());
	}

}
