package com.synergetics.generics.demo;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo3 {
	
	public static void main(String[] args) {		
 		
		//List  myList= new ArrayList();
		//myList.add(new Integer(100)); 
		//Integer i=myList.iterator().next(); 
		
		
		List<Integer> myList1= new ArrayList<>();
		myList1.add(200);//after generics 
		myList1.add(new Long(200));
		myList1.add(new Short((short) 10));
		
		
		//Integer i=myList1.iterator().next();
		//Object o=myList1.iterator().next();
			
		
		ArrayList<Number> numList= new ArrayList<>(); //Number Super class 
		numList.add(new Integer(100));  // Integer Subclass 
		numList.add(new Long(100));	     // Long Subclass
		//numList.add(new String("100"));
		
		
		ArrayList<Integer> numList1= new ArrayList<>();
		numList1.add(new Integer(100));
		
		//numList1.add(new Long(100));	
		//numList.add(new String("100"));
		//numList.add(new Number(100));
		
	}

}






