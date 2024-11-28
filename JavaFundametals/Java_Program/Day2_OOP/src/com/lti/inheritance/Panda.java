package com.lti.inheritance;

//rule 5 The method defined in the child class must be marked as static if it is marked as 
//static in the parent class (method hiding). Likewise, the method must not be marked 
//as static in the child class if it is not marked as static in the parent class (method overriding).

// overriding vs Hiding - see example Kangaroo page 254

class Bear {
	public static void eat() {
		System.out.println("Bear is eating");
	}


}

public class Panda extends Bear {
	public static void eat() {
		System.out.println("Panda bear is chewing");
	}
	/*public  void eat() {  // DOES NOT COMPILE  not static 
		System.out.println("Panda bear is chewing");
	}*/ 
	//same way if Bear class method eat is not static , u cant't make Panda method static
	
		

	public static void main(String[] args) {
		Panda.eat();
	}
}