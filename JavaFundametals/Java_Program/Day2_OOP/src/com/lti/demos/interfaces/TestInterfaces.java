package com.lti.demos.interfaces;

public class TestInterfaces {
	
	public static void main(String[] args) {
		
		//Person p= new Person();
		
		PermEmp  pemp = new PermEmp(101, 40000, 500000);
		pemp.calc();
		pemp.show();
		
		// can call static method
		Person.showCompanyLocation();
		
		TempEmp temp= new TempEmp(102, 10,4000);
		temp.calc();	
		
		//why ?
		//page 281 see parentChild example 
		
		//1.The type of the object determines which properties exist within the object in memory.
		//2. The type of the reference to the object determines which methods and variables are accessible to the Java program.
		
		//pdf 809 - page 10 //virtual method invocation example , why to use virtual method invocation 
		//refer example PlayWithAnimal 
		
		Person p;  //null // super class ref 
		
		p= new PermEmp(101, 40000, 500000);		
		p.calc();
		
		p= new TempEmp(102, 10,4000);
		p.calc();
			
	}

}
