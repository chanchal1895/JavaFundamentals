package com.lti.inheritance;

class Animal {
	 private int age;
	 public Animal(int age) {
	 super();
	 // Java  compiler automatically inserts a call to the no-argument constructor super() 
	 //if the fi rst 	 statement is not a call to the parent constructor.
	 this.age = age;
	 }
	}
	 class Zebra extends Animal {
	 public Zebra(int age) {
	 super(age);
	 }
	 public Zebra() {
	//super(4);
	this(4);
	 }
	}

public class PermEmp extends Person {

	private double basicSal;

	public void calc() {
		double gSal = basicSal * 3;
		System.out.println("gSal " + gSal);
		
		//super.show();// can call method of parent class 
	}

	public void calc(double bonus) {
		double gSal = basicSal * bonus;
		System.out.println("gSal " + gSal);
	}

	//constructor rules 808 - page 243
	public PermEmp() {
		super();
	}

	public PermEmp(double basicSal) {
		super();
		this.basicSal = basicSal;
	}

	public PermEmp(int personId, String personName, double basicSal) {
		 super(personId, personName); //comment and see the output - 0 and null value
		this.basicSal = basicSal;
		// super(personId, personName); // should be first line
	}

	public double getBasicSal() {
		return basicSal;
	}

	public void setBasicSal(double basicSal) {
		this.basicSal = basicSal;
	}

	@Override
	public String toString() {
		return "PermEmp [basicSal=" + basicSal + " " + " personId  " + personId + " personName  " + personName + "]";
		//return "PermEmp [basicSal=" + this.basicSal + " " + " personId  " + this.personId + " personName  " + this.personName + "]";
		//return "PermEmp [basicSal=" + this.basicSal + " " + " personId  " + super.personId + " personName  " + super.personName + "]";
	
	
		//		try 	super.basicSal instead this.basicSal
		// explaination for //808 page 245   System.out.print(" with "+super.numberOfFins+" fins"); // why it DOES NOT COMPIL
		
		// 					// 808 page 246 super() vs super 
		
	}

}
