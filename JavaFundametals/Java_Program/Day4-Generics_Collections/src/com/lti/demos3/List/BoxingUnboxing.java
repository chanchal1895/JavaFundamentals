
package com.lti.demos3.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoxingUnboxing {
	public static void main(String[] args) {
		
		
		  int no=50; // premitive
		  
		  Integer I=new Integer(no);//Boxing //warrper classes
		  
		  System.out.println("Integer I:"+I);
		  
			  
		  int i=I.intValue(); //unboxing
		  
		  System.out.println("int i"+ i);
		    
		  
		  Scanner sc= new Scanner(System.in);
		  
		  ArrayList myList= new ArrayList();
		  
		  int age = Integer.parseInt( sc.next() ); //int age=100;
		  
		  myList.add(age);// AutoBoxing(Primitive => Object)
		  
		  myList.add( new Double(23.23) ); //Boxing (primitive => Object manually)
		  
		 
		  
		  
		  
		  
		  
			boolean bool = new Boolean(true);
			System.out.println(bool);
			
			
	        byte by = new Byte((byte) 1);
	        short sh = new Short((short) 1);
	        int n = new Integer(1);
	        long l = new Long(1);
	        float fl = new Float(1.0);
	        double db = new Double(1.0);
	        char c = new Character('c');
	        
	        
	        

	        List<Integer> numbers = new ArrayList<>();
	        numbers.add(1);  // 1
	        numbers.add(new Integer(3)); // 1 3 
	        numbers.add(new Integer(5)); // 1 3 5 
	        numbers.remove(1); //   1 5 
	        
	        numbers.remove(new Integer(5)); // 1 
	        System.out.println(numbers);
         
           
        
        
	}

}
