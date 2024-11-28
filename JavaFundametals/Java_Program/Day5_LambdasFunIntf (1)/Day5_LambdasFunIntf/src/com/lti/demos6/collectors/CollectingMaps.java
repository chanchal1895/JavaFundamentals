package com.lti.demos6.collectors;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectingMaps {

    public static void main(String[] args) {
    	Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        Map<String, Integer> map = ohMy
                .collect(Collectors.toMap(s -> s, String::length)); 

        System.out.println(map); // lions=5 tigers=6 bears=5   


       
        ohMy = Stream.of("cat", "rat","tigers", "bears","tigers");
        Map<Integer, String> map1													
                = ohMy.collect(Collectors.toMap(String::length, k -> k, (s1, s2) -> s1 + "," + s2));
        
               System.out.println(map1); // toMap(5, 
               										//

        System.out.println(map1.getClass()); 


        ohMy = Stream.of("cat", "rat","tigers", "bears","tigers");
        TreeMap<Integer, String> map2
                = ohMy.collect(Collectors.toMap(String::length,
                                                k -> k,
                                                (s1, s2) -> s1 + "," + s2,
                                                TreeMap::new));
        System.out.println(map2); 
        System.out.println(map2.getClass()); 
    }
}
