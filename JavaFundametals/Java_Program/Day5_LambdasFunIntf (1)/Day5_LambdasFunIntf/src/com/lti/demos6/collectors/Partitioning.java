package com.lti.demos6.collectors;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Partitioning {

    public static void main(String[] args) {
        //Map value is List
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears","cat","animal");
        Map<Boolean, List<String>> map = ohMy.collect(
                Collectors.partitioningBy(s -> s.length() <= 5));
        System.out.println(map); 


        ohMy = Stream.of("lions", "tigers", "bears");
        map = ohMy.collect(
                Collectors.partitioningBy(s -> s.length() <= 7));
        System.out.println(map); 


        //Map value is Set
        ohMy = Stream.of("lions", "tigers", "bears","lions", "tigers");
        Map<Boolean, Set<String>> map1 = ohMy.collect(
                Collectors.partitioningBy(
                        s -> s.length() <= 7,
                        Collectors.toSet()));
        System.out.println(map1);


        ohMy = Stream.of("lions", "tigers", "bears", "hen");
        Map<Integer, Long> map2 = ohMy.collect(
                Collectors.groupingBy(
                        String::length,
                        Collectors.counting()));
        System.out.println(map2); 


    }
}
