

package com.lti.inheritance;
abstract class Animals {
	 public abstract String getName();
	}
	class Walrus extends Animals { // DOES NOT COMPILE  if you don't override method 
		 public  String getName() {return "hello";} //comment and see
	}

	
	 //abstract classes can extend other abstract classes and are 
	 //not required to provide implementations for any of the abstract methods. 
	
	abstract class Walrus1 extends Animals { // no need to impl method
		
	}
//rules page no 265
	
	//pdf 809 - An abstract class may contain any number of methods including zero
	//Abstract methods may not appear in a class that is not abstract. 
	//The first concrete subclass of an abstract class is required to implement all abstract
	//methods that were not implemented by a superclass
	
public abstract class Person {

	protected int personId;
	protected String personName;

	 public abstract void calc();

	public void show1() // implemented methods
	{
		System.out.println(" show method ");
	}

	public void show() // implemented methods
	{
		System.out.println(" show method ");
	}

	
	  public Person()
	  {
		  super();
	   }
	 

	public Person(int personId, String personName) {
		super();
		this.personId = personId;
		this.personName = personName;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + "]";
	}

}
