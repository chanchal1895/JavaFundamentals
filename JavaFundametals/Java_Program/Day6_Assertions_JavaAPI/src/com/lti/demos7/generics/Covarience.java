package com.lti.demos7.generics;
//A generic type is a generic class or interface that is parameterized over types.”

//Essentially, generic types allow you to write a general, generic class (or method) that works with different types, allowing for code re-use.

import java.util.ArrayList;
import java.util.List;

//Covariance and contravariance
//Variance refers to  subtyping behaviour
//Covariance: accept subtypes
//Contravariance: accept supertypes
//https://medium.com/free-code-camp/understanding-java-generic-types-covariance-and-contravariance-88f4c19763d2
public class Covarience {
	public static void main(String[] args) {

		// In Java, arrays are covariant, which has 2 implications.
		// Firstly, an array of type T[] may contain elements of type T and its  subtypes.
		Number[] nums = new Number[5];
		nums[0] = new Integer(1); // Ok
		nums[1] = new Double(2.0); // Ok
		// Secondly, an array of type S[] is a subtype of T[] if S is a subtype of T.
		Integer[] intArr = new Integer[5];
		Number[] numArr = intArr; // Ok

		// but will produce a runtime ArrayStoreException (because of heap pollution):
		numArr[0] = 1.23; // Not ok
		// It produces a runtime exception, because Java knows at runtime that the
		// “actual object” intArr is actually an array of Integer.

		// Generics
		// With generic types, Java has no way of knowing at runtime the type information of the type parameters, 
		//due to type erasure.
		//Therefore, it cannot protect against heap pollution at runtime.
		// As such, generics are invariant.
		
		//Although Integer is a subtype of Number, 
		//List<Integer> is not a subtype of List<Number> and, in fact, these two types are not related.
		
		// https://docs.oracle.com/javase/tutorial/java/generics/subtyping.html
		
		//wildcard and subtyping 
		

		ArrayList<Integer> intArrList = new ArrayList<>();
		// ArrayList<Number> numArrList = intArrList; // Not ok
		
		ArrayList<Integer> anotherIntArrList = intArrList; // Ok
		//ArrayList<Number> anotherIntArrList1 = intArrList; // not ok
		// The type parameters must match exactly, to protect against heap pollution.

		// Now wildcard bound unbound comes in picture 

		// With wildcards, it’s possible for generics to support covariance and	 contravariance.
		// above same example, see how it  works!
		ArrayList<Integer> intArrList1 = new ArrayList<>();
		ArrayList<? extends Integer> numArrList = intArrList1; // Ok

		// The question mark “?” refers to a wildcard which represents an unknown type.
		//lower bound wildcard 
		//  ? super Integer translates to “any type that is an  Integer type or its supertype”.
		//  upper-bound the wildcard, which restricts the unknown type to
		// be a specific type or its subtype,
		// by using ? extends Integer.

		// Read-only and write-only
		// Covariance and contravariance produce some interesting outcomes.
		// Covariant types are read-only, while contravariant types are write-only.

		// Remember that covariant types accept subtypes, so ArrayList<? extends Number>
		// can contain any object that is either of a Number type or its subtype.

		ArrayList<Integer> ints1 = new ArrayList<>();
		ArrayList<? extends Number> nums1 = ints1;

		ints1.add(new Integer(1)); // Ok
		Number n = nums1.get(0); // Ok
		// nums1.add(new Integer(2)); // Not ok

		// because we can be certain that whatever we get from the ArrayList can be
		// upcasted to a Number type (because if it extends Number, by definition, it is a Number).
		// But nums.add() doesn’t work, because we cannot be sure of the “actual type” of the object.
		// All we know is that it must be a Number or its subtypes (e.g. Integer, Double, Long, etc.).

		// With contravariance, the converse is true.

		ArrayList<Integer> ints2 = new ArrayList<>();
		ArrayList<? super Integer> nums2 = ints2;

		ints2.add(new Integer(1)); // Ok
		nums2.add(new Integer(2)); // Ok
		// Integer n = nums2.get(0); // Not ok

		// Line 9 works, because we can be certain that whatever the “actual type” of the object is,
		// it must be Integer or its supertype, and thus accept an Integer object.
		// But line 10 doesn’t work, because we cannot be sure that we will get an
		// Integer.
		// For instance, nums could be referencing an ArrayList of Objects.

		// Therefore, since covariant types are read-only and contravariant types are
		// write-only (loosely speaking), we can derive the following rule of thumb:
		// “Producer extends, consumer super”.
		// A producer-like object that produces objects of type T can be of type
		// parameter <? extends T>, while a consumer-like object that consumes objects
		// of type T can be of type parameter <? super T>.
		
		
		List<? super Number> list1 = new ArrayList<>();
		List<? super Integer> list2 = list1;
		
		
		//All that List<? super Integer> means is the List is capable of consuming an object of type Integer or some supertype of Integer.
		//A List<? super Number> meets those requirements.

	}

}
