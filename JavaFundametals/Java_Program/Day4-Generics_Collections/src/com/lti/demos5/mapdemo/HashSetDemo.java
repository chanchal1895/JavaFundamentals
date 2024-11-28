package com.lti.demos5.mapdemo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

//9323099601   -meenaluphale@gmail.com   

public class HashSetDemo {
	public static void main(String[] args) {
		
		Set<String> mySet= new HashSet<>();
		
		mySet.add(new String("A"));
		
		mySet.add(new String("A"));
		
		System.out.println(mySet);
		
		
		
		Map<String,String> myMap= new HashMap<>();
		
		myMap.put(new String("A"),"abcd");
		
		myMap.put(new String("A"),"xyz");
		
		System.out.println(myMap);
	
		
		/*		
		Set mySet= new HashSet();// does not maintain the order 
		mySet.add("a");
		mySet.add(2);
		mySet.add("b");
		mySet.add(null);
		System.out.println(mySet);
		
		
		
		
		
		TreeSet<Book> myList = new TreeSet<>(); // u can inherit methods of super class also 
		
		Book b1= new Book(123441, "Learning Java", "Vishal", "IT");
		Book b2= new Book(654321, "Learning SQL server", "Puja", "IT");
		Book b3= new Book(123441, "Learning Java", "Vishal", "IT");
		
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		System.out.println(b3.hashCode());
		
		myList.add(b1);	
		myList.add(b2);
		myList.add(b3);	
				
		System.out.println(myList);
		
	*/
		
		
		//Book b2= new Book(123441, "Learning Java", "Amit", "IT");		
//		myList.add(b2 );
		
			
		/*Iterator<Book> it = myList.iterator();
		
		while( it.hasNext() )
		{
			System.out.println( it.next() );
		}*/
		
	}
}

////HashSet myList = new HashSet(); //row type warning//not inherited from a superclass


/*HashSet cannot contain duplicate values.
HashSet allows null value.
HashSet is an unordered collection. It does not maintain the order in which the elements are inserted.
HashSet internally uses a HashMap to store its elements.
HashSet is not thread-safe.

When?
 when you want a collection of unique objects. 
gives time performance for insertion, removal and retrieval operations. 
but HashSet doesn’t maintain any order. //in fact that's why faster
So if order of elements is not so important.
 If you want your elements to be ordered in some way use TreeSet.
*/
/*Java doc says 
 
 A raw type is :reference type that is formed by taking the name of a generic type declaration 
 without an accompanying type argument list.
An array type whose element type is a raw type.
A non-static member type of a raw type R that is not inherited from a superclass or superinterface of R.

*/