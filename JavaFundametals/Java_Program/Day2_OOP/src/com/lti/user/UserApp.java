package com.lti.user;

import com.lti.entity.Employee;

public class UserApp {
	
	public static void main(String[] args) {
		
		
		//int i=10; // initn
		
		Employee e1= new Employee(101,"Jay",5000);		
		System.out.println(e1);		
		
		int i; // declaring 
		i=10;  // assignment
		
		Employee e2= new Employee(); // default constructor with no-argument constructor 
		/*
		 * e2.setEmpId(102); e2.setEmpName("Vijay"); e2.setEmpSal(3000);
		 */
		System.out.println(e2);		
		
		
		
		
		
		
		
	}

}
