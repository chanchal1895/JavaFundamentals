package com.lti.demos4.primitive;

import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyIntStream {

	public static void main(String[] args) {

		/*
		 * Stream<Integer> stream = Stream.of(1, 2, 3);
		 * System.out.println(stream.reduce(0, (s, n) -> s + n));// 6
		 * 
		 * //Alternatively, stream = Stream.of(1, 2, 3);
		 * System.out.println(stream.mapToInt(x -> x).sum());//6
		 * 
		 * 
		 * IntStream intStream = IntStream.of(1, 2, 3); OptionalDouble avg =
		 * intStream.average(); System.out.println(avg.getAsDouble());// 2.00
		 * 
		 * 
		 * Random ran = new Random(); intStream = ran.ints();
		 * intStream.limit(5).forEach(System.out::println);//
		 * 
		 * IntStream count = IntStream.iterate(5, n -> n + 1).limit(5);
		 * count.forEach(System.out::println);// 1 2 3 4 5 // 2 3 4 5
		 */
		//Alternatively, 
		IntStream range = IntStream.range(1, 6);
		  range.forEach(System.out::println); //1 2 3 4 5  // 6 not included
		  
		
		 IntStream rangeClosed = IntStream.rangeClosed(1, 6);
		  rangeClosed.forEach(System.out::println);// 1 2 3 4 5 6
		 //
		  
	}
}