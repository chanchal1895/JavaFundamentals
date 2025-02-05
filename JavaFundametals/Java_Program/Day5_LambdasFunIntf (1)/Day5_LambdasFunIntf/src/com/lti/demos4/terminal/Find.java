package com.lti.demos4.terminal;

import java.util.stream.Stream;

public class Find {

    public static void main(String[] args) {
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        s.findAny().ifPresent(System.out::println); 
        //or
        Stream.of("monkey", "gorilla", "bonobo")
                .findAny()
                .ifPresent(System.out::println);

        Stream<String> infinite = Stream.generate(() -> "chimp");
     
        infinite.findAny().ifPresent(System.out::println); // chimp
     
        
        //or
        Stream.generate(() -> "chimp")
                .findAny()
                .ifPresent(System.out::println); // chimp
    }
}
