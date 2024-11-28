package com.lti.demos1.datatypes;



//In order to be run by JVM, a class should have a main method with the following signature.

//public static void main(String args[])

//static public void main(String[] s)

// args array's name is not important. args[0] is the first argument. args.length gives no. of arguments.

// main method can be overloaded.
/*
public static void main(String[] args) {

	System.out.println("void main");		
}
public static int main(int[] args) {

	System.out.println("int main");
	
	return 0;
}
*/


// main method can be final.
/*public static final void main(String[] args) {

	System.out.println("void main");		
}
*/
// A class with a different main signature or w/o main method will compile.
//But throws a runtime error.

//A class without a main method can be run by JVM, 
//if its ancestor class has a main method. (main is just a method and is inherited)
	/*	
static  void main(String[] args)
public final void main(String[] args)
static public  void main()
static public  void main(String[] xyz)
static public  main(String[] args)
*/




public class d5_psvm {


	static public void  main(String[] theInput){
		System.out.println("welcome");		

	}
}





