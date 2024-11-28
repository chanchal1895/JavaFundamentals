package com.lti.demos2.utilfi;


import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;



// use a Consumer when you want to do something with a parameter but not return anything.
		//BiConsumer does the same thing except that it takes two parameters.
public class MyConsumer {

    public static void main(String[] args) {    	
		
		  Consumer<String> c1 = System.out::println;
		  
		  Consumer<String> c2 = x -> System.out.println(x.toUpperCase());
		  
		  c1.accept("Annie"); 
		  c2.accept("Annie");
		  

			Consumer<Double> circle = radius -> 
			{
				double circumference = Math.PI * Math.pow(radius, 2);
				double area = 2 * Math.PI * radius;			
				System.out.println("Area: " + area);
				System.out.println("Circumference: " + circumference);			
			};		
			
			circle.accept(12d);
	        
			BiConsumer<Double, Double> rectangle = (length, breadth)->
			{
				double area = length * breadth;
				
				double perimeter = 2 * length * breadth;
				
				System.out.println("Rectangle Details:");
				System.out.println("Area = " + area);
				System.out.println("Perimeter = " + perimeter);
			};
			
		rectangle.accept(12d, 6d);	
		  
		/*
		 * @FunctionalInterface
		public interface Consumer {
		    void accept(T t);
		}

		Consumer<String> printConsumer = new Consumer<String>() {
		    public void accept(String name) {
		        System.out.println(name);
		    };
		};

		names.forEach(printConsumer);
		
		using lambda 
		names.forEach(name -> System.out.println(name));

		 */
		
		  
		  //forEach method --> uses internally Consumer implementation 
		  // explain later 
		/*  
		
		  List<String> list = Arrays.asList("Jay","Vijay","Sanjay");    
			
			for (String name : list) {
			    System.out.println(name);
			}
			//We can write this using forEach:

			list.forEach(name -> {
			    System.out.println(name);
			});
		
		*/
			/*
			 * Collection interface has Iterable as its super interface. 
			 *And this interface has a new API starting with Java 8:

			default void forEach(Consumer<? super T> action) 
				{
				   
				    for (T t : this) {
				        action.accept(t);
				    }
				}
				
		  

		/*
		 * Map<String, Integer> map = new HashMap<>();
		 * 
		 * BiConsumer<String, Integer> b1 = map::put; //used an instance method
		 * reference since we want to call a //method on the local variable map .
		 * 
		 * BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);
		 * 
		 * 
		 * b1.accept("chicken", 7); // map::put is same as b2.accept("chick", 1); //k,
		 * v) -> map.put(k, v); System.out.println(map);
		 */
        
		
		/*
		 * Map<String, String> map1 = new HashMap<>(); BiConsumer<String, String> bc1 =
		 * map1::put; BiConsumer<String, String> bc2 = (k, v) -> map1.put(k, v);
		 * bc1.accept("chicken", "Cluck"); bc2.accept("chick", "Tweep");
		 * System.out.println(map1);
		 */
		  
		  
		/*
		 * Consumer<String> c= (String str)-> System.out.println(str);
		 * c.accept("Hello LE!");
		 * 
		 * 
		 * 
		 * Consumer<String> consumer= (String name)->System.out.println("Hi,"+name);
		 * consumer.accept("Smita");
		 * 
		 * // <class or instance name> :: <method name> Consumer<String> c5=
		 * System.out::println; c5.accept("Hi, Smita");
		 */
        

        
    }
}
