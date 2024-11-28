package com.lti.demos5.designpattern;

//The factory pattern is also called “Factory Method pattern” or “Virtual Constructor” in Java.
//Advantages The factory pattern is a type of creational pattern 
//and is the most commonly used pattern in Java.
//By using a factory pattern we ensure that the actual creation logic is not exposed to the outside world.
//Geometric_shape interface

/* some way of encapsulating object creation to deal with the complexity of 
object creation, including selecting which subclass to use, as well as loosely coupling the 
underlying creation implementation.
Solution 

The factory pattern, sometimes referred to as the factory method pattern, is a 
creational pattern based on the idea of using a factory class 
to produce instances of objects  based on a set of input parameters. 

It is similar to the builder pattern, although it is focused on supporting class polymorphism.
*/




interface Geometric_shape {
	void draw_shape();
}

//Geometric shape classes implementing Geometric_shape interface
class Rectangle implements Geometric_shape {
	@Override
	public void draw_shape() {
		System.out.println("Rectangle class::draw_shape() method.");
	}
}

class Square implements Geometric_shape {
	@Override
	public void draw_shape() {
		System.out.println("Square class::draw_shape() method.");
	}
}

class Circle implements Geometric_shape {
	@Override
	public void draw_shape() {
		System.out.println("Circle class::draw_shape() method.");
	}
}

// star - 

//Factory class for Geometric_shape
class ShapeFactory {
	// shapeObject method gets particular shapeType (circle, Square or Rectangle)
	public Geometric_shape shapeObject(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		// retrieve Circle object
		if (shapeType.equalsIgnoreCase("Circle")) {
			return new Circle();

			// retrieve Rectangle object
		} else if (shapeType.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();

			//// retrieve Square object
		} else if (shapeType.equalsIgnoreCase("Square")) {
			return new Square();
		}
		return null;
	}
}

public class Demo2Factory {
	public static void main(String[] args) {
		// Create a ShapeFactory object to get different geometric shapes
		ShapeFactory shapeFactory = new ShapeFactory();

		//Geometric_shape shape_Circle  = new Rectangle();
		// circle
		Geometric_shape shape_Circle = shapeFactory.shapeObject("CIRCLE");

		// draw method of Circle
		shape_Circle.draw_shape();

		// Rectangle
		Geometric_shape shape_Rectangle = shapeFactory.shapeObject("RECTANGLE");

		// draw method of Rectangle
		shape_Rectangle.draw_shape();

		// Square
		Geometric_shape shape_Square = shapeFactory.shapeObject("SQUARE");

		// draw method of square
		shape_Square.draw_shape();
	}

}

/*
 * So if a class implementing a factory pattern has a method to calculate the
 * rate of interest, then the concrete classes will implement this class and
 * also implement the method to calculate the rate of interest.
 * 
 * Then there will be another class that is a factory class that will access
 * these concrete class instances so that we are not aware of how the logic to
 * calculate the rate of interest is implemented. We only call the method and
 * get the output.
 * 
 * So when exactly can we use the Factory Method pattern?
 * 
 * When the parent classes decide to delegate the creation of instances to their
 * subclasses, then we can go for a factory pattern (This is explained above).
 * We can also use the factory method when the class doesn’t know what
 * subclasses are to be created.
 * 
 
 */