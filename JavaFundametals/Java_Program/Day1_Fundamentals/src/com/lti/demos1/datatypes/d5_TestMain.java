package com.lti.demos1.datatypes;



/*class Message {
    public static void main(String [] args) {
        System.out.println("Welcome! " );
    }
}
 
public class Main {
    public static void main(String [] args) {
        Message.main(args);
    }
}
*/

// Public classes should be in seprate files

/*
public class Main {
     public static void main(String [] args) {
        System.out.print("A");
    }
}
 
class B {
    public static void main(String... args) {
        System.out.print("B");
    }
}
 
 class C {
    public static void main(Object... args) {
        System.out.print("C");
    }
}
 */


// This works fine and will print "Parent"
class d5_TestMain {
    public static void main(String [] args) {
        System.out.println("Parent");
        
       // Child c= new Child();
        Child.main(null);
    }
}
 
class Child extends d5_TestMain {
    public static void main(String [] args) {
        System.out.println("Child");
    }
} 

