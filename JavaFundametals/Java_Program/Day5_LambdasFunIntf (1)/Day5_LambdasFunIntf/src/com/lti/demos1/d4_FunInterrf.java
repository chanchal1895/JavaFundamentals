package com.lti.demos1;



@FunctionalInterface
interface simple
{
	void show(String str);
}
public class d4_FunInterrf {
	public static void main(String[] args) {	
		
		
		
		simple s=(name)->System.out.println(name);				
		s.show("jay");
	
		simple s1= System.out::println;
		s1.show("vijay");	
	
	}

}

// Lmbdas -> implementation of Fun Interfaces 
// --> Annonymous Classes --call annonymous functions 
// FI, No Name, without return type, w/o modifier
