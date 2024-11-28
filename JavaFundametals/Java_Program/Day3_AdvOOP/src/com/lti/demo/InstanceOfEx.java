package com.lti.demo;

//to test whether the object is an instance of the specified type (class or subclass or interface).

//The instanceof in java is also known as type comparison operator because it compares the instance with type.
//It returns either true or false. 
//If we apply the instanceof operator with any variable that has null value, it returns false.

class HeavyAnimal {  //parent 
}
class Hippo extends HeavyAnimal {  //child 1  of Heavy Animal 
}
class Elephant extends HeavyAnimal { //child 2 of HeavyAnimal 
}
interface Mother {
}
class MotherHippo extends Hippo implements Mother {  // G child 
}
public class InstanceOfEx {

    public static void main(String[] args) {
        HeavyAnimal hippo = new Hippo();
        
        boolean b1 = hippo instanceof Hippo;
        System.out.println(b1);  // true 
        boolean b2 = hippo instanceof HeavyAnimal;
        System.out.println(b2); // true   
        boolean b3 = hippo instanceof Elephant;
        System.out.println(b3);//false 
        boolean b4 = hippo instanceof Object;
        System.out.println(b4);// True 
        Hippo nullHippo = null;
        boolean b5 = nullHippo instanceof Object;
        System.out.println(b5);//false 

		
		  Hippo anotherHippo = new Hippo(); //child 3 
	  // boolean b6 = anotherHippo instanceof  Elephant;		  
		  
		  boolean b7 = hippo instanceof Mother;
		  System.out.println(b7);
		 
    }
}
