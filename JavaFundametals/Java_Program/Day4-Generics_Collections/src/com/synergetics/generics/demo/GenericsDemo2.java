package com.synergetics.generics.demo;

public class GenericsDemo2 
{
	public static void main(String[] args) 
	{
		//List<String> myList= new ArrayList<>();
			
		DataHolder<String> weekdays = new DataHolder<String>();
		
		weekdays.add("Sunday");
		weekdays.add("Monday");
		weekdays.add("Tuesday");
		weekdays.add("Wednesday");
		weekdays.add("Thursday");
		weekdays.add("Friday");
		weekdays.add("Saturday");
	
	   // weekdays.add(12);
		
		System.out.println( weekdays.get(0) );
		System.out.println( weekdays.get(1) );
		
		
		  DataHolder<Long> mobileNumbers = new DataHolder<Long>();
		  
		  mobileNumbers.add(9834983473l); 
		  mobileNumbers.add(9834983443l);
		  mobileNumbers.add(98349834573l);
		  mobileNumbers.add(98349834473l);
		  
		  System.out.println( mobileNumbers.get(0) );
		 
	}
}
















