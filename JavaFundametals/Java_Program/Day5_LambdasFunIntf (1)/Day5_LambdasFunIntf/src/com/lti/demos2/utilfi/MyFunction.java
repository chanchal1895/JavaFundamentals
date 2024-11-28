package com.lti.demos2.utilfi;

import java.util.function.BiFunction;
import java.util.function.Function;

//Creating own functional interface
@FunctionalInterface
interface TriFunction<T, U, V, R> {
    R apply(T t, U u, V v);
}

@FunctionalInterface
interface QuadFunction<T, U, V, W, R> {
    R apply(T t, U u, V v, W w);
}

//A Function is responsible for turning one parameter into a value 
//of a potentially different type and returning it. 
//Similarly, a BiFunction is responsible for turning two parameters into a value and returning it


public class MyFunction {

    public static void main(String[] args) {
        Function<String, Integer> f1 = String::length;
        Function<String, Integer> f2 = x -> x.length();
        System.out.println(f1.apply("cluck")); // 5
        System.out.println(f2.apply("cluck")); // 5

        BiFunction<String, String, String> b1 = String::concat;
        BiFunction<String, String, String> b2 = (string, toAdd) -> string.concat(toAdd);
        System.out.println(b1.apply("baby ", "chick")); // baby chick
        System.out.println(b2.apply("baby ", "chick")); // baby chick
        
        BiFunction<Integer,Integer,Integer> add1 = (n1, n2) -> n1+n2; 	
		System.out.println( add1.apply(12, 2) );
		
		
		BiFunction<Integer,Integer,Integer> multi= (n1,n2)->n1*n2;
		System.out.println(multi.apply(10, 3));
    }
}




