package com.lti.demos.MCQ;

import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeSet;

class MyComparator implements Comparator<String> {

	public int compare(String a, String b) {
		return a.toLowerCase().compareTo(b.toLowerCase());
	}

}

class Helper {
	public static <U extends Exception> void printException(U u) {
		System.out.println(u.getMessage());
	}
}

class Wildcard {
	public void showSize(List<?> list) {
		System.out.println(list.size());
	}
}

public class TestMSQs {
	public static void main(String[] args) {

		
		Map m = new HashMap();
	 m.put(123, "456");
		 m.put("abc", "def");
		System.out.println(m.contains("123"));
		
		
		Queue<Integer> q = new LinkedList<>();
		q.add(10);
		q.add(12);
		q.remove(1);
		System.out.print(q);

	}

}/*
	 * // Wildcard card = new Wildcard();
	 * 
	 * // ArrayDeque<?> list = new ArrayDeque<String>(); // ArrayList<? super Date>
	 * list = new ArrayList<Date>(); // List<?> list = new ArrayList<?>();error //
	 * List<?> list = new ArrayList<Integer>(); // List<? extends Exception> list =
	 * new LinkedList<java.io.IOException>(); // Vector<? extends Number> list = new
	 * Vector<Integer>();
	 * 
	 * card.showSize(list);
	 * 
	 * 
	 * Helper.printException(new FileNotFoundException("A"));
	 * Helper.printException(new Exception("B")); //
	 * Helper.<Throwable>printException(new Exception("C"));
	 * Helper.<NullPointerException>printException(new NullPointerException("D"));
	 * // Helper.printException(new Throwable("E"));
	 * 
	 * 
	 * 
	 * 
	 * Map<Integer, Integer> map = new HashMap<>(10);
	 * 
	 * String[] values = { "123", "Abb", "aab" }; Arrays.sort(values, new
	 * MyComparator()); for (String s: values) System.out.print(s + " "); }
	 * 
	 * 
	 * }
	 * 
	 * TreeSet<String> tree = new TreeSet<String>(); tree.add("one");
	 * tree.add("One"); tree.add("ONE"); System.out.println(tree.ceiling("On"));
	 * 
	 * 
	 * // Ex1
	 * 
	 * LinkedList<String> list = new LinkedList<>(); list.add("Grapes of Wrath");
	 * list.add("1984"); list.forEach(System.out::println); Iterator it =
	 * list.iterator();
	 * 
	 * // while (it.hasMore()) // System.out.println(it.next());
	 * 
	 * 
	 * List<String> list = new ArrayList<>(); list.add("Monday"); //
	 * list.add(String::new); list.add("Tuesday"); list.remove(0);
	 * System.out.println(list.get(0));
	 * 
	 * 
	 * // How many lines does this code output?
	 * 
	 * List<String> list = new LinkedList<>(); list.add("Archie");
	 * list.add("X-Men"); list.stream().forEach(s -> System.out.println(s));
	 * list.stream().forEach(s -> System.out.println(s));
	 * 
	 * 
	 * } }
	 * 
	 */