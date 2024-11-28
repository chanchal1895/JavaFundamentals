package com.lti.demos7.generics;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class AA {
}

class BB extends AA {
}

class CC extends BB {
}
public class Bounds2 {
	public static void main(String[] args) {		
		

		//class Test<T extends X> 	
		//If x is a class then as the type parameter we can pass either x or its child classes.
		//If x is an interface then as the type parameter we can pass either x or its implementation classes.
		//upper bound 
		List<?> list1 = new ArrayList<AA>();
		List<? extends AA> list2 = new ArrayList<AA>();
		List<? extends AA> list21 = new ArrayList<BB>();
		List<? extends AA> list213 = new ArrayList<CC>();		
		List<? extends BB> list3 = new ArrayList<CC>();				
		List<? extends CC> list4 = new ArrayList<CC>();
		
		//lower bound 
		List<? super AA> list5 = new ArrayList<AA>();	
		//List<? super AA> list6 = new ArrayList<BB>();	
		//List<? super AA> list7 = new ArrayList<CC>();			
		
		List<? super BB> list9 = new ArrayList<AA>();		
	   	
	  	ArrayList<Number> numList= new ArrayList<>(); //Number Super class 
		numList.add(new Integer(100));  // Integer Subclass 
		numList.add(new Long(100));	     // Long Subclass
		//numList.add(new String("100"));
			   	
	  //	ArrayList<? extends Number> numList1= new ArrayList<>(); 	  	
	//	numList1.add(new Integer(100)); 
		//numList1.add(new Long(100));	     
		//numList.add(new String("100"));
		
		//solution
	    List<? extends Number> lint = new ArrayList<Integer>(); // type is arrayList 
	    List<Integer> lint2 = (List<Integer>) lint;                 //Number Integer 
	    lint2.add(123);
	    lint2.add(1234);
	    System.out.println(lint2);
		
				
		ArrayList<? super Number> numList2= new ArrayList<>(); 
		numList2.add(new Integer(100)); 
		numList2.add(new Long(100));	     
		//numList.add(new String("100"));	
		
		
		ArrayList<Integer> numList3= new ArrayList<>();
		numList3.add(new Integer(100));		
		//numList1.add(new Long(100));	
		//numList.add(new String("100"));
		//numList.add(new Number(100));
		
		List<? extends  Integer> list = new ArrayList<>();		
		//list.add(new Integer(100));
		//list.add(new Long(100));	   
		//List.add(new String("100"));
		
		
			
		
	}
	

	

}
