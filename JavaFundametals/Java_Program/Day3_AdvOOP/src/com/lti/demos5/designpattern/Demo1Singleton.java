package com.lti.demos5.designpattern;

/*
 * Singleton Pattern
Singleton pattern restricts the instantiation of a class and ensures that only one instance of the class exists in the java virtual machine.
The singleton class must provide a global access point to get the instance of the class.
Singleton pattern is used for logging, drivers objects, caching and thread pool.
Singleton design pattern is also used in other design patterns like Abstract Factory, Builder, Prototype, Facade etc.
Singleton design pattern is used in core java classes also, for example java.lang.Runtime, java.awt.Desktop.
o implement a Singleton pattern, we have different approaches but all of them have the following common concepts.

Private constructor to restrict instantiation of the class from other classes.
Private static variable of the same class that is the only instance of the class.
Public static method that returns the instance of the class,
// this is the global access point for outer world to get the instance of the singleton class.

 */

//https://www.softwaretestinghelp.com/design-patterns-in-java/

class SingletonObject {
	// create an object of SingletonObject
	private static SingletonObject instance = new SingletonObject();
	
	// private constructor so that we cannot instantiate the class
	private SingletonObject() {
		System.out.println("constructor called ");
		
	}
	// returns the only available object
	public static SingletonObject getInstance() {
		return instance;
	}
	public void printMessage() {
		System.out.println("Hello from Singleton object!!!");
	}
}
public class Demo1Singleton {
	public static void main(String[] args) {

		// illegal statement because constructor is private
		// Compile Time Error: The constructor SingletonObject() is not visible
		// SingletonObject object = new SingletonObject();

		// call getInstance to retrieve the object available from the class
		SingletonObject object = SingletonObject.getInstance();
		// show the message
		object.printMessage();

		SingletonObject object1 = SingletonObject.getInstance();
		// show the message
		object1.printMessage();

	}
}