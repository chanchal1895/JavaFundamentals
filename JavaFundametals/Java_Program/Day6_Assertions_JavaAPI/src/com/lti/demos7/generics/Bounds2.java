package com.lti.demos7.generics;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


class Fly{}
class Bird  extends Fly {}
class Sparrow extends Bird { } 


class AA {
}

class BB extends AA {
}

class CC extends BB {
}
//The wildcard ? is used to indicate any type.

//? super T: 
//indicates lower bound meaning, any reference types which are superclass of T are allowed.
//? extends T:
//indicated upper bound meaning, any reference types which are subclass of T are allowed.

//https://docs.oracle.com/javase/tutorial/java/generics/restrictions.html
//5. Type Erasure
//Generics were added to Java to ensure type safety. And to ensure that generics won't cause overhead at runtime, the compiler applies a process called type erasure on generics at compile time.

//Type erasure removes all type parameters and replaces them with their bounds or with Object if the type parameter is unbounded. This way, the bytecode after compilation contains only normal classes, interfaces and methods, ensuring that no new types are produced. Proper casting is applied as well to the Object type at compile time.

//https://www.baeldung.com/java-generics
//https://www.tutorialspoint.com/java_generics/java_generics_type_erasure.htm

public class Bounds2 {
	public static void main(String[] args) {		
		
		//Fly 
		//Bird
		//Sparrow 
		
		
		List<? super Bird> birds = new ArrayList<Bird>();
		List<Sparrow> spList= new ArrayList<Sparrow>();
		List<Fly> flyList= new ArrayList<Fly>();
		
		//birds=spList;  
		//birds=flyList;


		birds.add(new Sparrow());  // can't instantiate instance of parameterized parameter read above link 
		birds.add(new Bird()); 
		//birds.add(new Fly()); 

		//class Test<T extends X> 	
		//If x is a class then as the type parameter we can pass either x or its child classes.
		//If x is an interface then as the type parameter we can pass either x or its implementation classes.
		//upper bound 
	
		
		
		List<? extends Bird> birds1 = new ArrayList<Bird>();
		List<Sparrow> spList1= new ArrayList<Sparrow>();
		List<Fly> flyList1= new ArrayList<Fly>();
		
		birds1=spList1;  
		birds1=flyList1;


		birds1.add(new Sparrow());  // can't instantiate instance of parameterized parameter read above link 
		birds1.add(new Bird()); 
		birds1.add(new Fly()); 
		
	
		
		
		
		List<?> list1 = new ArrayList<BB>(); 
		// Any generic type can be referenced from an unbounded wildcard  -- ? means T 
	
	List<? extends AA> list2 = new ArrayList<AA>(); // child classes of AA  are allowed to be referenced 
	
		
		List<? extends AA> list21 = new ArrayList<BB>();
		List<? extends AA> list213 = new ArrayList<CC>();
		List<? extends BB> list3 = new ArrayList<CC>();	
		List<? extends CC> list4 = new ArrayList<CC>();
		
		//lower bound 
		List<? super AA> list5 = new ArrayList<AA>();	
		//List<? super AA> list6 = new ArrayList<BB>();	
		//List<? super AA> list7 = new ArrayList<CC>();			
		
		
		List<? super BB> list9 = new ArrayList<AA>();	// super class instances allowed 	
	   	
	  	
		
		
		
		
		
			
		
	}
	

	

}
