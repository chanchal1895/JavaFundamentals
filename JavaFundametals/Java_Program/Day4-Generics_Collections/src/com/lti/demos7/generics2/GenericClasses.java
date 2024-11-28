package com.lti.demos7.generics2;

//Generic classes become useful when the classes used as the type parameter can have absolutely 
//nothing to do with each other.

public class GenericClasses {

	public static void main(String[] args) {

		Elephant elephant = new Elephant();

		Crate<Elephant> bigCrate = new Crate<>();

		bigCrate.packCreate(elephant);

		Elephant inNewCrate = bigCrate.emptyCrate();

		Crate<Zebra> mediumCrate = new Crate<>();
		
		Zebra z= new Zebra();

		Robot joeBot = new Robot();
		Crate<Robot> smallCrate = new Crate<>();

		smallCrate.packCreate(joeBot);

		Robot atDestination = smallCrate.emptyCrate();

		// --
		Integer numPounds = 15_000;
		SizeLimitedCrate<Elephant, Integer> c1 = new SizeLimitedCrate<Elephant, Integer>(elephant, numPounds);

		SizeLimitedCrate<Zebra, Integer> c2 = new SizeLimitedCrate<Zebra, Integer>(z, numPounds);

		
		
	}

}
