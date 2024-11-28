package com.lti.demos2.utilfi;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class OwnPractices {

	public static void main(String[] args) {

		Function<String, Integer> f1 = s -> s.length();
		System.out.println(f1.apply("Meenal"));
		
		
		BiFunction<Integer,Double,Double> f2= (n1,n2)-> n1+n2;				
		
		System.out.println(f2.apply(100,200.87));
		
		BiFunction<String ,String ,String > fun = (x,y) -> x.concat(y);
		System.out.println(fun.apply("JAVA","11"));

		Consumer<String> c = System.out::println;
		c.accept("Hello");


	}
}
