package com.synergetics.generics.demo;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

 class Wildcard {
	 public void showSize(List<?> list) {
	 System.out.println(list.size());
	 }
 }

public class Hello<T> {
	T t;

	public Hello(T t) {
		this.t = t;
	}

	public String toString() {
		return t.toString();
	}

	public static void main(String[] args) {
		/*System.out.print(new Hello<String>("hi"));
		System.out.print(new Hello("there"));
*/
	/*	Set<Number> numbers = new HashSet<>();
		numbers.add(new Integer(86));
		numbers.add(75);
		numbers.add(new Integer(86));		
		numbers.add(309L);
		Iterator iter = numbers.iterator();
		while (iter.hasNext())
			System.out.print(iter.next());*/
		
		//Wildcard card = new Wildcard();
		
		 //ArrayDeque<?> list = new ArrayDeque<String>();
	  // ArrayList<? super Date> list = new ArrayList<Date>();
		 //List<?> list = new ArrayList<?>();
		 //List<Exception> list = new LinkedList<java.io.IOException>();
		// Vector<? extends Number> list = new Vector<Integer>();
		
		 //card.showSize(list);

	}
}