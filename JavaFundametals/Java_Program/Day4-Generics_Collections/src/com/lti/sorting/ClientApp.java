package com.lti.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ClientApp {
	public static void main(String[] args) {
		List<Employee> myList = new ArrayList<Employee>();

		Employee emp_Jay = new Employee(101, "Jay", 27, 95000);
		myList.add(emp_Jay);

		Employee emp_Vijay = new Employee(100, "Vijay", 27, 85000);
		myList.add(emp_Vijay);

		Employee emp_Sanjiv = new Employee(305, "Sanjay", 23, 85000);
		myList.add(emp_Sanjiv);

		Employee emp_Ajay = new Employee(111, "Ajay", 25, 50000);
		myList.add(emp_Ajay);

		System.out.println("=======Before Sorting=====");

		for (Employee e : myList) {
			System.out.println(e);
		}

		//Collections.sort(myList);

		System.out.println("=======After Sorting=====");

		for (Employee e : myList) {
			System.out.println(e);
			}
		
		/* Employee temp = new Employee();
		  
		  Collections.sort(myList, temp);
		  
		  System.out.println("=======After Sorting By Salary====="); for (Employee emp1
		  : myList) { System.out.println(emp1.toString()); }
		  
		*/
	}
}
/*
 * List list = new ArrayList(); list.add("hello"); String s = (String)
 * list.get(0);//typecasting
 */