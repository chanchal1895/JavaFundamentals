package com.lti.user;

import com.lti.inheritance.PermEmp;
import com.lti.inheritance.Person;
import com.lti.inheritance.TempEmp;

public class TestInheri {
	public static void main(String[] args) {
		
		/*
		 * Person p= new Person(1111,"Jay"); 
		 * System.out.println(p);
		 *  p.calc();
		 */
		//PermEmp e1= new PermEmp();
		//System.out.println();
		
		
		PermEmp pemp = new PermEmp(101,"Vijay",5000);		
		System.out.println(pemp);
		
		pemp.setBasicSal(5500);  // public setters and getter methods 
		System.out.println(pemp);
		//pemp.personId=111;  // if vaiable is public in parent class -it's accessible 
	
		pemp.calc();
		pemp.show();
		pemp.show1();
		
		
		TempEmp temp= new TempEmp(10002,"Sanjay",10,5000);
		System.out.println(temp);
		temp.calc();
		pemp.show();
		
		
		//Person p;
		//p=pemp;
		//p.calc();
							
		
	}

}
