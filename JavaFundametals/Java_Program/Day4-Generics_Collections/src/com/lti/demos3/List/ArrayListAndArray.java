package com.lti.demos3.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListAndArray {

    public static void main(String[] args) {
        //ArrayList
        List<String> list = new ArrayList<>();     
        list.add("Fluffy");                         
        list.add("Webby");                        
        System.out.println(list);
        
        // 
        
        //					new  mouse 
        //backed arrays 
        //array-backed lists that are generated when you convert arrays to lists using Arrays. asList(...) . The list and the array objects point to the same data stored in the heap. Changes to the existing contents through either the list or array result to changing the same data.20-Nov-2016
       
        String[] array2 = { "gerbil", "mouse" ,"cat"}; 
		  list = Arrays.asList(array2); 
		  System.out.println(list);
		  
		  list.set(1, "test"); // gerbil test 
		  array2[0] = "new";  //new test 
		  
		  System.out.println(array2); 		  
		  System.out.println(list);//new test 
		  
		  list.add("dog");
		  System.out.println(list);//new test 
		  	  
		
		  System.out.println(Arrays.asList(array2));
		  
		  String[] strAry=(String[]) list.toArray();
		  
		  System.out.println(strAry);
		 
        
        //array
		/*
		 * String[] array = new String[list.size()];
		 * 
		 * array[0] = list.get(1); array[1] = list.get(0);
		 * 
		 * for (int i = 0; i < array.length; i++) { System.out.print(array[i] + "-"); }
		 */
         // Converting Between array and List
		  
		
		 
		
		
		/*
		 * List<String> list1 = new ArrayList<>(); list1.add("hawk");
		 * list1.add("robin"); Object[] objectArray = list1.toArray();
		 * System.out.println(objectArray.length); String[] stringArray =
		 * list1.toArray(new String[0]); System.out.println(stringArray.length);
		 */

        
    }
}