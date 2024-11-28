package com.lti.demos2.arrayex;

import java.util.*;

public class d3_ArraysExtra {

    static int[] classIntArray;

    public static void main(String... args) {

        String [] bugs = new String[] { "cricket", "beetle", "ladybug" };
        System.out.println(bugs);
        //means this is an array ( [ ) of class java.lang.String ( Ljava.lang.String; ).
        //And @33909752 is the address where the String object is stored in memory.
        
       // [ stands for single dimension array
        
       // Class.forName("[D") -> Array of primitive double
       // Class.forName("[[Ljava.lang.String") -> Two dimensional array of strings.
        
       /* List of notations:
        	Element Type : Notation
        	boolean : Z
        	byte : B
        	char : C
        	class or interface : Lclassname
        	double : D
        	float : F
        	int : I
        	long : J
        	short : S*/
        	
        System.out.println(Arrays.toString(bugs));       

        classIntArray = new int[] {1, 2, 3}; // Need to instantiate a new object to change the default values of the array

        System.out.println(Arrays.toString(classIntArray));

        System.out.println("\n----------------------------------------\n");

        int numbers[] = new int[] {6, 9, 1};

        Arrays.sort(numbers);

        for(Integer i : numbers) // Autoboxing with the sorted int array
            System.out.println(i + " "); // 1 6 9 

        System.out.println("\n");

        String[] strings = {"123", "9", "112", "0300"};

        Arrays.sort(strings);      
        

        for(String s : strings)
            System.out.println(s + " "); // "0300", "112", "123", "9" - alphabetic order - sorts from 0 to 9, then from A to Z and finally from a to z.

        ArrayList<String> emptyList = new ArrayList<>();
        String[] emptyArray = emptyList.toArray(new String[0]);

        System.out.println(emptyList);
        System.out.println(emptyArray);

        String[] oneArray = {"123","hawk","9", "112", "0300",  "robin"};
        Arrays.sort(oneArray);  

        List<String> oneAsList = Arrays.asList(oneArray);
  

        System.out.println(oneAsList);
      
        
       
    }
}
