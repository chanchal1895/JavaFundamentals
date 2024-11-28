package com.lti.demos4.terminal;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collect {

	public static void main(String[] args) {
		
		  Stream<String> stream = Stream.of("w", "o", "l", "f");
		  
		  StringBuilder word = stream.collect(StringBuilder::new,StringBuilder::append,
		  StringBuilder::append); System.out.println(word); System.out.println("\n");
		  
		

		/*
		// stream = Stream.of("w", "o", "l", "f");
		 * 
		 * set = stream.collect(Collectors.toCollection(TreeSet::new));
		 * System.out.println(set); // [f, l, o, w] System.out.println("\n");
		 * 
		 * //unsorted stream = Stream.of("w", "o", "l", "f"); Set<String> set1 =
		 * stream.collect(Collectors.toSet()); System.out.println(set1); // [f, w, l, o]
		 * System.out.println("\n");
		 */
	}
}