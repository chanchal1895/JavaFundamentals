package com.lti.entity;

//Encapsulation means we set up the class so only methods in the class with the variables can refer to the instance variables.
//Callers are required to use these methods.

//mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit.

//Declare the variables of a class as private.

//Provide accessor methods ---> public setter and getter methods to modify and view the variables values.
// if( empSal>0) { this.empSal=empSal}  // with validation
// j2EE - java beans - properties  and other  naming conventions 

// imuutable class --> don't have setters  ( can have constructor - only don;t want to modify data) 

//compiler automatically inserts a call to the no-argument constructor super() if the first statement is not a call to the parent constructor. 

/*
// constructor rules : page 289

public class Mammal {
	 public Mammal(int age) {
	 }
	}
	public class Elephant extends Mammal { // DOES NOT COMPILE bec class deos not have default constructor 
	}
 no constructor is defined within the Elephant class, so the compiler tries to insert a default no-argument constructor with a super() call,

public class Elephant extends Mammal {
 public Elephant() { //still DOES NOT COMPILE  bec - super()  ? no def constr in Mammel class 
 }
*/
//each class extends java.lang.Object 
//  boolean getter setter is diff 

public class Employee {
	// test char c; // default value? 
	public int empId;
	public String empName;	
	private  double empSal;
	private String companyName="LTI infotech";
	
	
	
	//constructors same name as that of class
	// do not have return type 
	//used for initilizing object 
	
	public Employee() {		
		this(100,"XXX");
		//super();
		
	}

//constructor overloading 
	public Employee(int empId, String empName, double empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		companyName="LTI";
	}

	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
		companyName="LTI";
	}


	public double grossSal()
	{
		return empSal*2;
	}
	
	
	public int getEmpId() {			
		
		return empId;
	}


	public void setEmpId(int empId) {
		
		if(empId>0)
		{
		this.empId = empId;
		}
		
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}

	
	  public double getEmpSal() { return empSal; }
	  
	  
	  public void setEmpSal(double empSal) { this.empSal = empSal; }

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", companyName="
				+ companyName + "]";
	}
	 

	//string representation of object data 



	
	
}
