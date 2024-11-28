package com.lti.inheritance;

//page 247 use of super.method()

//overriding rules : page 248 
//1. The method in the child class must have the same signature as the method in the parent class.
//2. The method in the child class must be at least as accessible or more accessible than the method in the parent class.
//3. The method in the child class may not throw a checked exception that is new or broader than the class of any exception thrown in the parent class method.
//4. If the method returns a value, it must be the same or a subclass of the method in the parent class, known as covariant return types.
//5.see example Panda.java The method defined in the child class must be marked as static if it is marked as 
//static in the parent class (method hiding). Likewise, the method must not be marked 
//as static in the child class if it is not marked as static in the parent class (method overriding).

class Canine {
	protected  double getAverageWeight() {  // even method is private , u can override in child class 
		return 50;
	}
}

public class Wolf extends Canine {
	
	public double getAverageWeight() { // make it private 
	//	return 20; // if u make parent method private 
		
		//return super.getAverageWeight() + 20;
	return getAverageWeight() + 20; 
	}

	public static void main(String[] args) {
		//System.out.println(new Canine().getAverageWeight());
		System.out.println(new Wolf().getAverageWeight());
		
	
		
	}
}