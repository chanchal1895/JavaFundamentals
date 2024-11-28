package com.lti.demos2.utilfi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;
import java.util.function.Supplier;

//used when you want to generate or supply values without taking any input.

public class MySupplier {

    public static void main(String[] args) {
    	
    	Collection<String> c = new TreeSet<>(); 
    	c.add("pen");
    	c.remove("pen");
    	System.out.println(c.isEmpty());

    	
        Supplier<LocalDate> s1 = LocalDate::now;
       // System.out.println(s1);        
        
        Supplier<LocalDate> s2 = () -> LocalDate.now();
        
        LocalDate d1 = s1.get();
        LocalDate d2 = s2.get();
        
        System.out.println(d1);
        System.out.println(d2);        
        
        
        Supplier<StringBuilder> sb2 = () -> new StringBuilder("Welcome");
        System.out.println(sb2.get());
               
     
        //output  System.out.println(s1); -> com.lti.demos2.utilfi.MySupplier$$Lambda$1/471910020@7ba4f24f
        
        //That’s the result of calling toString() on a lambda. Yuck. This actually does mean 
       // something. Our test class is in a package that we created named functionalinterface. 
        //Then comes $$, which means that the class doesn’t exist in a class file on the file system. It exists only in memory. 
        
        
        
        //EXtra:
        
        
        
    }
}
/*

interface SampleSupplier<T> 
{
	void get();
}

class SupplierImpl implements SampleSupplier<Object>
{

	@Override
	public void get() {
	
		System.out.println("Hello");
	}
	
}


class SupplierImpl1 implements SampleSupplier<LocalDate>
{

	@Override
	public void get() {	
	System.out.println(LocalDate.now());
		
	}
	
} */