package com.lti.inheritance;
//test super class constructor 

//What is the output of the following code?What is the output of the following code?
class Mammal {
	
	public Mammal(int age) {
		System.out.print("Mammal");
	}	
}
public class Platypus extends Mammal {

	
	public Platypus() {
	super(10);
		
		System.out.print("Platypus");
	}
	
	public static void main(String[] args) {
		//new Mammal(10);
		new Platypus();
	}
}
/*
 * A. Platypus B. Mammal C. PlatypusMammal D. MammalPlatypus E. The code will
 * not compile because of line 8. F. The code will not compile because of line
 * 11.
 */