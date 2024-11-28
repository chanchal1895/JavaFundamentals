
package com.lti.inheritance;

class Primate {
	public Primate() {
		System.out.println("Primate");
	}
}

class Ape extends Primate {
	public Ape() {
		System.out.println("Ape");
	}
}

public class Chimpanzee extends Ape {
	public static void main(String[] args) {
		new Chimpanzee();
	}
}
/*
The compiler fi rst inserts the super() command as the fi rst statement of both the 
Primate and Ape constructors. Next, the compiler inserts a default no-argument constructor in the Chimpanzee class with super() as the fi rst statement of the constructor. The code 
will execute with the parent constructors called fi rst and yields the following output:
Primate
Ape
*/