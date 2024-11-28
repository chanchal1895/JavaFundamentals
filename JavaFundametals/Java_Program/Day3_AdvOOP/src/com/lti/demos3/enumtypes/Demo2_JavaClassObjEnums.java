package com.lti.demos3.enumtypes;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo2_JavaClassObjEnums {
	public static void main(String[] args) {

		// 1.
		// A runtime Exception will be raised if we try to merge
		// duplicate keys using Collectors.toMap
		try {
			Person p1 = new Person("Andrew", Gender.MALE);
			Person p2 = new Person("Beatrice", Gender.FEMALE);
			Stream<Person> persons = Stream.of(p1, p2);
			//Person p3 = new Person("Chris", Gender.MALE);
			//Person p4 = new Person("Diana", Gender.FEMALE);
			//Stream<Person> persons = Stream.of(p1, p2, p3, p4);
			
			System.out.println(persons.collect(Collectors.toMap(p -> p.gender, p -> p.name)));
			
			//System.out.println(persons.collect(Collectors.toMap(p -> p.gender, p -> p.name)));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

class Person {
	String name;
	Gender gender;

	Person(String name, Gender gender) {
		this.name = name;
		this.gender = gender;
	}
}

enum Gender {
	MALE, FEMALE
}
