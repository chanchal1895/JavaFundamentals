package com.lti.demos7.generics2;

/**
 * Just like a class, an interface can declare a formal type parameter.
 */
public interface Shippable<T> {

	void ship(T t);

}
