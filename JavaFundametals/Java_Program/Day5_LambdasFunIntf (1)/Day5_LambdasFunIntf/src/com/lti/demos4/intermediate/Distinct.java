package com.lti.demos4.intermediate;

import java.util.stream.Stream;


//returns a stream with duplicate values removed. 
//The duplicates do //not need to be adjacent to be removed. 
//As you might imagine, Java calls equals() to determine whether the objects are the same.


public class Distinct {

    public static void main(String[] args) {
        Stream<String> s = Stream.of("duck", "duck", "duck", "goose");
        s.distinct().forEach(System.out::print); // duckgoose
        
       
    }
}
