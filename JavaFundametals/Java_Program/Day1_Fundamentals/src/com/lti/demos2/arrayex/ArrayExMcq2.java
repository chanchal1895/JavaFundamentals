package com.lti.demos2.arrayex;

public class ArrayExMcq2 {
	 static int a3[];

     static int b3[] = {1,2,3};
    public static void main(String[] args) {
        
        // 1.
        // Without a dimension or array elements, a compiler erro is thrown
        // ( Variable must provide either dimension expressions or an array initializer )
       //int[] arr = new int[];
        // this is fine
    	
    	
        int[] arr = new int[0];
        System.out.println(arr.length); // 0

        // invalid
        // int[] arr2d[] = new int[][];
        
        // valid
        int[] arr2d[] = new int[5][];
        
        // invalid
        // int[] arr2d[] = new int[][5];
        
        
       //Arrays are Java objects. If you create an array of 5 Strings, there will be 6 objects created.

     //Arrays should be  Declared. 
        int[] a; String b[]; Object []c; //Size should not be specified now Allocated (constructed). 
        
         a = new int[10]; 
         int arraysize=5;
         c = new String[arraysize] ;  	 //  Initialized.     
       
        int a1[] = { 1, 2, 3 }; 

        int a2[] = new int[] { 1, 2, 3 }; //But never specify the size with the new statement.

        // Java arrays are static arrays. Size has to be specified at compile time. 
       // Array.length returns array's size. (Use Vectors for dynamic purposes).

        // Array size is never specified with the reference variable, 
        // it is always maintained with the array object. It is maintained in array.length, which is a final instance variable.

     

       // Arrays with zero elements can be created.
        //args array to the main method will be a zero element array if no command parameters are specified.
        //In this case args.length is 0.

      //Comma after the last initializer in array declaration is ignored.

       // int[] i = new int[2] { 5, 10}; // Wrong

       // int i[5] = { 1, 2, 3, 4, 5}; // Wrong  , can't declare size and intin at a time 

        int[] i[] = {{}, new int[] {} }; // Correct

        int i1[][] = { {1,2}, new int[2] }; // Correct

        int i2[] = { 1, 2, 3, 4, } ; // Correct

      // Array indexes start with 0. Index is an int data type.

       // Square brackets can come after datatype or before/after variable name.
        //White spaces are fine. Compiler just ignores them.
         
        // Arrays declared even as member variables also need to be allocated memory explicitly.

      // int a3[];

       // int b3[] = {1,2,3};  change to static and 

        System.out.println(a3[0]); // Throws a null pointer exception

        System.out.println(b3[0]); // This code runs fine

        System.out.println(a3); // Prints 'null'

        System.out.println(b3); // Prints a string which is returned by toString

    

       //Once declared and allocated (even for local arrays inside methods), 
        //array elements are automatically initialized to the default values.

       //If only declared (not constructed), member array variables default to null,
        //but local array variables will not default to null.

        // Java doesn't support multidimensional arrays formally, but it supports arrays of arrays. From the specification - "The number of bracket pairs indicates the depth of array nesting." So this can perform as a multidimensional array. (no limit to levels of array nesting)

       
    }
}
