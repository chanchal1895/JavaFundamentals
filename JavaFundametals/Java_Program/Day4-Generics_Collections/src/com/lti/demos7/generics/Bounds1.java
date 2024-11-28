package com.lti.demos7.generics;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//Wrapper - converting prim to non prim( object )
//Generics - 


public class Bounds1 {

	public static void main(String[] args) {
		
		List<Number> numbers = new ArrayList<>();		
		numbers.add(new Integer(42));
		numbers.add(new Long(42));
		//Object obj= new Integer(100);		
		//numbers.add(obj);		
		//List<Object> objects = numbers; // DOES NOT COMPILE
		// objects.add("forty two");
		// System.out.println(numbers.get(1));
		
		// Unbounded wildcard
	//List<?> l1 = new ArrayList<String>();

		unBoundedWildcards();
	}

	protected static void unBoundedWildcards() {
		List<String> keywords = new ArrayList<>();
		keywords.add("java");
		//printList1(keywords); // DOES NOT COMPILE
		printList2(keywords);
	}

	private static void printList1(List<Object> list) {
		for (Object x : list) {
			System.out.println(x);
		}
	}

	private static void printList2(List<?> list) {
		for (Object x : list) {
			System.out.println(x);
		}
	}
}
