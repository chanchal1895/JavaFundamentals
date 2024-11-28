package com.lti.demos5.exceptions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class RecapExcep {

    // 3.
    // ExceptionInInitializerError
    // An ArrayIndexOutOfBoundsException in intializer block will
    // throw this exception
    static {
        int[] counts = new int[3];
        // UNCOMMENT BELOW CODE
        // System.out.println(counts[-1]);
    }
    
    public static void main(String[] args) throws IOException {
        
        // 1.
        // Nothing like negative index for Java Arrays
        // Following code throws a ArrayOutOfBoundsException
        int[] counts = new int[3];
        // UNCOMMENT BELOW CODE
        // System.out.println(counts[-1]);

        // 2.
        // Here ClassCastException occurs when we try to cast objects from different types
        String type = "moose";
        Object obj = type;
        // UNCOMMENT BELOW CODE
        Integer num = (Integer)obj;
        System.out.println(num);

        // 4.
        // Subtype excetion should not be after the parent exception
        // here second catch causes compiletime error
        try {
            throw new NumberFormatException();    
        } catch (IllegalArgumentException e) {} 
        // UNCOMMENET BELOW CODE
        // catch (NumberFormatException e){}

        // 5.
        // multi-catch block
        try{

        } catch( ArithmeticException | NullPointerException e) {

        }

        // 6.
        // multi-catch is for unrelated types related types will result in compile time error
        // (The exception FileNotFoundException is already caught by the alternative IOException)
        // UNCOMMENT BELOW CODE
      /* try{

        } catch( FileNotFoundException | IOException e) {}*/
        
        //At a time only one exception occurs and at a time only one catch block is executed.
      //  All catch blocks must be ordered from most specific to most general,
        //i.e. catch for ArithmeticException must come before catch for Exception.
        
       // Single catch block can handle more than one type of exception. 
        //However, the base (or ancestor) class and subclass (or descendant) exceptions can not be caught in one statement. 
//       /Also note that you cannot catch both ExceptionA and ExceptionB in the same block if ExceptionB is inherited,
        //either directly or indirectly,          from ExceptionA. 
        
        //The fix for this is to only include the ancestor exception in the exception list,
        //as it will also catch exceptions of the descendant type.
      // Not Valid as Exception is an ancestor of   // NumberFormatException
      /*  try{

        }
           catch(NumberFormatException | Exception ex) 
        */
        

        // 7.
        // with finally block there can be return statements, but finally will always be called
        System.out.println(new RecapExcep().gotHome());

        // 8.
        // try with resources can replace finally.
        // they help to close the resources that were declared in try
        try ( FileInputStream fi = new FileInputStream("Exceptions.txt") ) {

        } catch ( IOException e ) {
            e.printStackTrace();
        }

        // 9.
        // Catch block is optional with try with resources
        try( FileInputStream is = new FileInputStream("file") ) {

        }

        // 10.
        // finally is optional with try with resources
        try( FileInputStream is = new FileInputStream("file")) {

        } finally {
            System.out.println("Finally is called");
        }

        // 11. 
        // Scope of variable declared in try with resources is inside 
        // the try block only
        //
        try( Scanner sc = new Scanner(System.in)) {
        } catch ( Exception e ) {
            // UNCOMMENT BELOW CODE
            // sc.nextInt();
        } finally {
            // UNCOMMENT BELOW CODE
            // sc.nextInt();
        }

        // 12.
        // If we place try-catch around methods that won't throw checked exception, a compile time error will be thrown
        // (Unreachable catch block for IOException. This exception is never thrown from the try statement body)
//         try{
//      new Exceptions2().gotHome();
//        } catch ( IOException e ) {
//
//       }


    }

    public int gotHome() {
        try {
            System.out.print("1");
            // return -1;
            throw new Exception();
        } catch ( Exception e ) {
            System.out.print("2");
            return -2;
        } finally {
            System.out.println("3");
            return -3;
        }
    }

}
/*

## RuntimeException classes
- ArithmeticExcpetion : Divide by zero
- ArrayIndexOutOfBoundsException
- ClassCastException
- NullPointerException
- IllegalArgumentException : Thrown by programmer to indicate invalid argument
- NumberFormatException : Subclass of IllegalArgumentException

## Checked Exception Classes
- IOException
- FileNotFoundException: Subclass of IOException

## Errors
- ExceptionInInitializerError: When static initializer throws an exception and doesn't handles it.
- StackOverflowError: Infinite recursion
- NoClassDefFoundError: When class that the code uses is available in compile time but not in runtime. */
