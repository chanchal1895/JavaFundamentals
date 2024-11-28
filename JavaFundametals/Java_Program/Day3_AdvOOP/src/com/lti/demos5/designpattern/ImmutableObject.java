package com.lti.demos5.designpattern;

/*
 * An immutable object is an object that will not change its internal state after creation.

Immutable objects are very useful in multithreaded applications because they can be shared between threads without 
synchronization. 

Immutable objects are always thread safe.

Lists, arrays, maps, sets and other non-immutable objects can be surprising.
 A private final object with no setter is fixed to the object it was initially assigned, 
 but the values inside that object aren't fixed (unless the object is immutable).
 */
//https://dzone.com/articles/immutable-objects-in-java
//https://dev.to/monknomo/make-an-immutable-object---in-java-480n

/*
 * mmutable class in java means that once an object is created, we cannot change its content. 
 * In Java, all the wrapper classes (like Integer, Boolean, Byte, Short) and String class is immutable.
 *  We can create our own immutable class as well. Prior to going ahead do go through characteristics of
 *   immutability in order to have a good understanding while implementing the same. Following are the requirements: 

The class must be declared as final so that child classes can’t be created.
Data members in the class must be declared private so that direct access is not allowed.
Data members in the class must be declared as final so that we can’t change the value of it after object creation.
A parameterized constructor should initialize all the fields performing
 a deep copy so that data members can’t be modified with an object reference.
Deep Copy of objects should be performed in the getter methods to return a copy rather than returning the 
actual object reference)
 */
//Note: There should be no setters or in simpler terms, there should be no option to change the value of
//the instance variable.


//1. Make a class final , fields final , fileds private  , no setters 
//perfect building block to create software.
//eg Wrapper classes 
//Boolean class reuses its existing instances TRUE and FALSE 


import java.util.HashMap;
import java.util.Map;
 
// Class 1
// An immutable class
final class Student {
 
    // Member attributes of final class
    private final String name;
    private final int regNo;
    private final Map<String, String> metadata;
 
    // Constructor of immutable class
    // Parameterized constructor
    public Student(String name, int regNo,
                   Map<String, String> metadata)
    {
 
        // This keyword refers to current instance itself
        this.name = name;
        this.regNo = regNo;
 
        // Creating Map object with reference to HashMap Declaring object of string type
        Map<String, String> tempMap = new HashMap<>();
 
        // Iterating using for-each loop
        for (Map.Entry<String, String> entry : metadata.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }
 
        this.metadata = tempMap;
    }
 
    // Method 1
    public String getName() { return name; }
 
    // Method 2
    public int getRegNo() { return regNo; }
   
    // Note that there should not be any setters
 
    // Method 3
    // User -defiened type
    // To get meta data
    public Map<String, String> getMetadata()
    {
 
        // Creating Map with HashMap reference
        Map<String, String> tempMap = new HashMap<>();
 
        for (Map.Entry<String, String> entry :
             this.metadata.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }
        return tempMap;
    }
}
 
public class ImmutableObject {
	// Main driver method
    public static void main(String[] args)
    {
 
        // Creating Map object with reference to HashMap
        Map<String, String> map = new HashMap<>();
 
        // Adding elements to Map object
        // using put() method
        map.put("1", "first");
        map.put("2", "second");
 
        Student s = new Student("ABC", 101, map);
 
        System.out.println(s.getName());
        System.out.println(s.getRegNo());
        System.out.println(s.getMetadata());
 
        // Uncommenting below line causes error
        	//s.regNo = 102;
 
        map.put("3", "third");
        // Remains unchanged due to deep copy in constructor
        System.out.println(s.getMetadata());
        s.getMetadata().put("4", "fourth");
        // Remains unchanged due to deep copy in getter
        System.out.println(s.getMetadata());
    }

}
