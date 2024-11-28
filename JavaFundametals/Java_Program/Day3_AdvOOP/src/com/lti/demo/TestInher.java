package com.lti.demo;


class Shape { 
    public Shape() { 
      System.out.print("Shape"); 
    } 
    public Shape(int edge) { 
      System.out.print("ShapeEdge"); 
    } 
    private boolean hasEdges() { 
      return false; 
    } 
} 
class Rectangle extends Shape { 
 public Rectangle(int age) { 
   System.out.print("Rectangle"); 
 } 
 public boolean hasEdges() { // C
   return true; 
 } 
}  

public class TestInher {
	
	public static void main(String[] args) {
		 Shape rectangle = new Rectangle(5);  // A
	    //  System.out.println(","+rectangle.hasEdges()); // B
	}

}
