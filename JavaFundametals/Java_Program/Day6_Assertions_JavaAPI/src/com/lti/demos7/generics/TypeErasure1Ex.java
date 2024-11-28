package com.lti.demos7.generics;

//Type erasure can be explained as the process of enforcing type constraints only at compile time
//and discarding the element type information at runtime.

// Types of Type Erasure : https://www.baeldung.com/java-type-erasure
//https://www.geeksforgeeks.org/type-erasure-java/
//https://stackoverflow.com/questions/339699/java-generics-type-erasure-when-and-what-happens
//1. class type erasure 
//public class Stack<E> { private E[] stackContent;
// replaced with public class Stack { private Object[] stackContent;

//2. Method Type Erasure
//public static <E> void printArray(E[] array) { for (E element : array) {
//public static void printArray(Object[] array) { for (Object element : array) {

//3.Edge Cases

public class TypeErasure1Ex {
	
	public static  <E> boolean containsElement(E [] elements, E element){
	    for (E e : elements){
	        if(e.equals(element)){
	            return true;
	        }
	    }
	    return false;
	}
	//The compiler replaces the unbound type E with an actual type of Object:

/*	public static  boolean containsElement(Object [] elements, Object element){
	    for (Object e : elements){
	        if(e.equals(element)){
	            return true;
	        }
	    }
	    return false;
	}*/
	public static void main(String[] args) {
		
		
		 
		
		
	}

}
