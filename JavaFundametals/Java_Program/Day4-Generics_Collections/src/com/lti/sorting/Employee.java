package com.lti.sorting;

import java.util.Comparator;

//Comparable interface has  compareTo(T obj) method -it returns a negative integer, zero, or a positive integer 
//Comparator interface has compare(Object o1, Object o2) method

public class Employee //implements Comparable<Employee> ,Comparator<Employee>
{
    private int id;
    private String name;
    private int age;
    private int salary;
 
     public Employee() {
        this.id = 0;
        this.name = "";
        this.age = 0;
        this.salary = 0;
    }

    public Employee(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public int getAge() {
        return age;
    }
 
    public void setAge(int age) {
        this.age = age;
    }
 
    public int getSalary() {
        return salary;
    }
 
    public void setSalary(int salary) {
        this.salary = salary;
    }
/*
 public int compareTo(Employee o) 
       {
   	  
           if (o.getId() == this.id)
           {
               return 0;
           } 
           else if (o.getId() > this.id) 
           {
               return -1;
           }
           else 
           {
               return 1;
           }
       } */

    /*
     public int compare(Employee o1, Employee o2) 
       {
           if (o1.getSalary() > o2.getSalary()  ) 
           {
               return 1;
           } 
           if (o1.getSalary() < o2.getSalary()) {
           	
               return -1;
           }
           if (o1.getSalary() == o2.getSalary()) 
           { 
        	   return 0;  
        	   
           }
           return 0;             
*/
    @Override
    public String toString() {
        return "[Employee ID:" + this.getId() + " Name:" + this.getName()
                + " Age:" + this.getAge() + " Salary:" + this.getSalary() + "]";
    }
 
}