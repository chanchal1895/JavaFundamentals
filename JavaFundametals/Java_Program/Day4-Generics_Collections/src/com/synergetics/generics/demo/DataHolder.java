package com.synergetics.generics.demo;

import java.util.ArrayList;

public class DataHolder<T>  //T - Long  
{
	private ArrayList<T> data;   

	public DataHolder() 
	{
		data = new ArrayList<>();
	}
	
	public void add(T value)  
	{
		data.add( value );
	}
	
	public T get(int id)    
	{
		return data.get( id );
	}
}
