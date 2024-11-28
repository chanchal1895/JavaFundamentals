package com.lti.demos5.mapdemo;
import java.util.Hashtable;
import java.util.Enumeration;
public class HashtableExample
{
	public static void main(String args[])
	{
		Hashtable hashtable = new Hashtable();
		hashtable.put( "One", new Integer(1) ); // adding value into hashtable
		hashtable.put( "Two", new Integer(2) );
		hashtable.put( "Three", new Integer(3) );
		hashtable.put( "One", new Integer(100) );
		
		System.out.println("Hashtable contains " + hashtable.size() + " key value pair.");
		
		Enumeration e = hashtable.keys();

		while( e.hasMoreElements() )
		{
		System.out.println( e.nextElement() );
		}
		System.out.println("Retriving all values from the Hashtable");

		e = hashtable.elements(); 

		while( e. hasMoreElements() ){

		System.out.println( e.nextElement() );

		}
		System.out.println( hashtable.remove("One") + " is removed from the Hashtable.");

		
		if( hashtable.contains( new Integer(1) ) )
		{
		System.out.println("Hashtable contains 1 as value");
		}
		else
		{
		System.out.println("Hashtable does not contain 1 as value");
		}

		if( hashtable.containsKey("One") )
		{

		System.out.println("Hashtable contains One as key");

		}else
		{

		System.out.println("Hashtable does not contain One as value");

		}
		Integer one = (Integer) hashtable.get("One");

		System.out.println("Value mapped with key \"One\" is " + one);
		System.out.println("Retriving all keys from the Hashtable");

		
	}

}
