package com.lti.demos5.mapdemo;

import java.util.HashMap;
import java.util.Map;

public class Ex_Map1 {

	public static void main(String[] args) {

		// key - unique
		// value - duplicate
		// replace  ?   not added ? 
		Map<String, String> mailIds = new HashMap<String, String>();
		mailIds.put("user1@gmail.com", "password1");
		mailIds.put("user2@gmail.com", "password1");		
		mailIds.put("user1@gmail.com", "password3");
		System.out.println(mailIds);
		
		
		System.out.println(mailIds.size());	
		
		// we cannot iterate a Map directly using iterators,
		// because Map are not Collection

		
		
		for (Map.Entry<String, String> entry : mailIds.entrySet()) 
		{
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
	
		  HashMap<Integer, Product> prdMap = new HashMap<>();		
		  
		  Product p1 = new Product(101, "TShirt", 1_200, 5); 
		  Product p2 = new Product(102, "TShirt", 1_200, 5);	
		  
		  prdMap.put(1111, p1); 
		  prdMap.put(1112, p2);	  
		  
		  for (Map.Entry<Integer, Product> entry : prdMap.entrySet())	
		  {
		  System.out.println("Key = " + entry.getKey() + ", Value = " +  entry.getValue());
		  }
	  
	}
}











//The capacity is not publically exposed, it.16 bit
		//as elements are added to an ArrayList, its capacity grows automatically.

//types ( TreeMap, LinkedHashMap,HashMap,Hashtable, etc.)

// Map.Entry<K, V> interface.
//Map.entrySet() method returns a collection-view(Set<Map.Entry<K, V>>) 
//of the mappings contained in this map.
//So we can iterate over key-value pair using getKey() and getValue() methods of Map.Entry<K, V>. 
