package com.lti.demos4.nestedClasses;

class OuterClass {
	int x = 10;

	class InnerClass {
		int x = 5;
	}
}
	public class OuterInnerClassDemo {
			
		  public static void main(String[] args) 
		  {
		    OuterClass myOuter = new OuterClass();
		    OuterClass.InnerClass myInner = myOuter.new InnerClass();
		    System.out.println(myInner.x + " " + myOuter.x);
		  }
		}
