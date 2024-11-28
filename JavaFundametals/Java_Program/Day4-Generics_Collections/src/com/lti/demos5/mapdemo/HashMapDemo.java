package com.lti.demos5.mapdemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo 
{
	public static void main(String[] args) 
	{
		HashMap<Integer, Product> products = new HashMap<>();
		
		products.put(101, new Product( 101, "TShirt", 1_200, 120 ));
		products.put(873, new Product( 873, "HTCOneS", 23_000, 100 ) );
		products.put(999, new Product( 999, "SportsShoes", 4_500, 160 ) );
		products.put(834, new Product( 834, "DellInspiron3433", 56_000, 60) );
		products.put(348, new Product( 348, "LGTv3473", 89_000, 20 ) );
		
		Product p = products.get( 834 );
		System.out.println(p);		
		
	/*	Set<Integer> s = products.keySet();
		
		Iterator<Integer> it = s.iterator();
		
		while(it.hasNext())
		{
			Integer key = it.next();
			
			Product product = products.get( key ); //get(key) returns a value of that key
			//products.remove(834); //fail fast
			System.out.println( product );
		}*/
	/*
			Set<Integer> keys = products.keySet(); // keyset() returns all keys to set
			Collection<Product> values = products.values();
			Set keyValuePair = products.entrySet(); //
		
		
		Iterator it = values.iterator();
		
		while(it.hasNext())
			
	System.out.println(it.next());
				
		
		System.out.println(keys);
		System.out.println(values);
	
		System.out.println("\n" + keyValuePair);
		*/
	}
}



/* Hashcode is integer value that identifies the object and 
is built using object's hashcode() method. Every object have hashcode() method, 
when called, it returns integer value that represents object. 
hashcode is used basically to distribute the objects systematically, 
so that searching can be done faster.

*hashcode of an object is generated using hashcode() method, 
*which looks into object properties, manipulate on it and come up with specific integer value which represents that object.
hashcode is basically used for distributing and arranging objects across hashmap table./


Can two objects have same hashcode?
Yes. Two objects can very well have same hashcode.
f two Objects have same hashcode, it doesn't mean both are same. 
hashcode is used to group all Objects having same hashcode at one place,
So that searching within them can be done faster compare to all Objects dumped at one place.


Hashcode only helped in arrangement of letters, which actually made searching faster.

So, In object perspective, two in-different object's can have same hashcode and to uniquely identify it, each object need to be scan and see, whether it is the same object we are looking for.

That is where hashcode() and equals() method come into picture.

1. hashcode() method generate hashcode/identifier of a object. (which can be same for 2 different objects).
2. Once hashcode is evaluated, equals() method helps us to look within the objects that have 
    the same hashcodes and get the object we are interested in by comparing object internal properties.
hashcode() methods helps in finding the correct Letter box.
equals() method helps to look for each letter within that Letter box.
*/
