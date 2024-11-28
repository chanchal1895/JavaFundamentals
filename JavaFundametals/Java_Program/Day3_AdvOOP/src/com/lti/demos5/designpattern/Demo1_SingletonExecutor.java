package com.lti.demos5.designpattern;

class MyClass {

	static MyClass obj=new MyClass();	
	
   static int countobj;
	
   
	private MyClass()
	{
		System.out.println("MyClass object created");
		countobj++;
	}
	
	public static void count()
	{
		System.out.println("Total objects are :"+ countobj);
	}
	
	public static MyClass getObject()
	{
		return obj;
	}
}

public class Demo1_SingletonExecutor {

	public static void main(String[] args) {
		
		
		//Following statement will not work as constructor is private
	//	MyClass obj=new MyClass();
		 			
		MyClass obj=MyClass.getObject();
		MyClass.count();
		
		System.out.println("Creating one more reference ....");
		MyClass obj1=MyClass.getObject();
		MyClass.count();
		
	}

}
