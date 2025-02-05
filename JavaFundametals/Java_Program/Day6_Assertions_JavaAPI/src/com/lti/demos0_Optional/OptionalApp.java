package com.lti.demos0_Optional;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalApp {

public static void main(String[] args) {
	 String str = "Hello World";

     Optional<String> optionalOf = Optional.of(str);
     Optional<String> optionalNullable = Optional.ofNullable(str);

     System.out.println("For non null value");
     System.out.println("\toptionalOf1 : " + optionalOf.get());
     System.out.println("\toptionalNullable : " + optionalNullable.get());

    
     System.out.println("\nFor null value");
     try {
         optionalOf = Optional.of(str);
     } catch (NullPointerException e) {
         System.out.println("\tNullPointerException thrown for 'Optional.of' method");
     }

     optionalNullable = Optional.ofNullable(str);

     try {
         System.out.println("optionalNullable : " + optionalNullable.get());
     } catch (NoSuchElementException e) {
         System.out.println("\tNoSuchElementException thrown for 'optionalNullable.get()' method");
     }

}

}
