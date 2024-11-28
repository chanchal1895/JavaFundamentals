package com.synergetics.generics.demo;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsDemo 
{
	public static void main(String[] args) 
	{
		
		// generics - offers compile time safety 
		
		ArrayList<String> countries = new ArrayList<>();
		
		countries.add("India");
		countries.add("USA");
		countries.add("Australia");
		countries.add("Russia");
		
		//countries.add(1);		
		
		Iterator<String> it = countries.iterator();
		
		while( it.hasNext() )
		{		
			String str = it.next();
			
			System.out.println(str.toUpperCase());
		}
		
	}
}
