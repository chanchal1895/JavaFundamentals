package com.lti.demos4.Tree;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx1 {
	public static void main(String[] args) {

	/*	Set<Integer> set = new TreeSet<>();
		set.add(66);
		set.add(10);
		set.add(66);
		set.add(8);

		System.out.println(set); 		*/
		
		System.out.println(" User defined Class - ");		
		
		Set<Student> mySet = new TreeSet<>();
		
		Student s1 = new Student(106, "jay", 3000.00f);
		Student s2 = new Student(106, "jay", 3000.00f);
		Student s3 = new Student(103, "Sanjay", 4000.00f);		
		
		mySet.add(s3);
		mySet.add(s2);
		mySet.add(s1);
	
		

		
		
		System.out.println(mySet);
		
		

		/*
		 * Iterator iterator = tree.iterator();
		 * 
		 * System.out.print("Tree set data: ");
		 * 
		 * while (iterator.hasNext()) { System.out.print(iterator.next() + " "); }
		 */
	}

}
