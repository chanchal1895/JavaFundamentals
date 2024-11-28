package com.lti.demos7.generics;

import com.lti.demos7.generics2.*;

public class GenericClasses {

	public static void main(String[] args) {
		
		Elephant elephant = new Elephant();
		Crate<Elephant> bigCrate = new Crate<>();
		bigCrate.packCreate(elephant);
		Elephant inNewCrate = bigCrate.emptyCrate();

		Crate<Zebra> mediumCrate = new Crate<>();

		Robot joeBot = new Robot();
		Crate<Robot> smallCrate = new Crate<>();
		smallCrate.packCreate(joeBot);
		Robot atDestination = smallCrate.emptyCrate();

		// --
		Integer numPounds = 15_000;
		SizeLimitedCrate<Elephant, Integer> c1 = new SizeLimitedCrate<Elephant, Integer>(elephant, numPounds);

	}

}
