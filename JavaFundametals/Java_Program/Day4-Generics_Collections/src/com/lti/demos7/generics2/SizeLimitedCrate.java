package com.lti.demos7.generics2;

	//Type Unit
public class SizeLimitedCrate<T, U> {

	private T contents;
	private U sizeLimit;

	public SizeLimitedCrate(T contents, U sizeLimit) {
		this.contents = contents;
		this.sizeLimit = sizeLimit;
	}

}
