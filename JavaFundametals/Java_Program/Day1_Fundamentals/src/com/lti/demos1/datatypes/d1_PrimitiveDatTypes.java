package com.lti.demos1.datatypes;
/**
 * PrimitiveDatTypes 
*/
// //Javadoc comments are any multi-line comments (" /** ... */ ") 	//that are placed before class, field, or method declarations. */\r\n" */ 
public class d1_PrimitiveDatTypes {

    char instCh;
    long instLg;

    public static void main(String[] args) {
    	
    	 
    	 // 7.
        // Identifies:
        // - can include $ or _
        // - can have numbers but can't begin with them
        // - since Java9, underscore (_) is not a valid identifier
        // - can't have keywords
       
            
        int $ = 1;
        System.out.println($);
        int $_ = 2;
        System.out.println($_);

        //keywords can't be used for variable names
        //    int else =10;

        
      //1. variable declarations 
		
		int _helloworld$;
        int Public;
        int _2Q2_;
        
        int total_number; //-------valid
      //  int Total# ;//------------------invalid
        int  ABC123;//---------valid
      //  int  123ABC;//---------invalid

     
        int number=10;
        int Number=20;
        int NUMBER=20;// we can differentiate with case. 
        int NuMbEr=30;
      

       // There is no length limit but not recommended > 15 lengths. 
      //  int if=10; //--------------invalid
       // : All predefined java class names and interface names we use as identifiers. 
     

       /* 	int _$_;
			int cas$h;
			int Java2var;
			int all@names;
			int Int;
			int Integer;
			int int ; */
        
        
     // all System defined / predefined classes Or Interfaces can be used as variable name
		//not recommended but it works 
       
        int Exception = 0;
        long Error = 20; 
        
		//int String= 100;
		//System.out.println(String);
		
		int Runnable=100;
		System.out.println(Runnable);
		 // Its perfectly ok to have a variable name after the name of a class
		
        String String = "is this valid?";
//		Exception Exception=null;
    	
    		    	

		
		//int boolean=100;
		//int Boolean =100;
		
		  // 5.
        // You can add underscare anywhere except:
        // - beginning of the literal
        // - the end of literal
        // - right before the decimal point
        // - right after the decimal point
        // following are invalid
        // double notAtStart = _1000.00;
        // double notAtEnd = 1000.00_;
        // double notBeforeDec = 1000_.00;
        // double notAfterDec = 1000._00;

        // rest are valid
        int i1 = 100_00;
        short sh2 = 10_0;
        char ch2 = 1_0_0;
        long l1 = 2_00_000_000_000L;
        double ugly = 1___________________0; // prints 10.0

        System.out.println(i1);
        System.out.println(sh2);
        System.out.println(ch2);
        System.out.println(l1);
        System.out.println(ugly);

        
        //
		
		 int num = 999;
		 int num1 = 9_9_9;
	//	int num2 = _9_99;
		 
		
        
//    	int i=null;  // can't assign null to primitive datatypes		
		String s=null;  // allowed for objects types 
		
       
        
       
        // Java adoesn't allow declaring two different types in same statement
        // this is valid
        double d1 = 1, d2 = 2;
        System.out.println(d1);
        System.out.println(d2);
        
        //chapter 1 : que 15,16
       
        
        // this is not valid
        // int i3 = 4, short sh2 = 3;

        // this too is not valid
        //   int i4=4, int i5=5;

       
        // Uninitialized local variables will give compile time error only when we try to use them
        int uninitializedInt;
        // compile time in below statement
        // System.out.println(uninitializedInt);

     
        //can not be initialized with a different type
      /*   int v1 = 2; // v1 is pf type int now       
        v1 = "some";*/

     
        byte   apples = 5; 
        // this is not valid
        apples = 127; // 128
        
     
        
      
        // Below will give a compile error, beacuse the 
        // assigned value is a int and it is out of range
        // Compile time error here
     //  float fl = 32454322342f;
    	
        // Correct way
        float fl = 32454322342L;
        System.out.println(fl);

        // 2. 
        // valid short 
        short sh1 = 'a';
        System.out.println(sh1);
        
        // 3.
        // valid char
        char ch= 65;
        System.out.println(ch);
        
        char ch1 = (short) 65;
        System.out.println(ch1);        
       

        // 4.
       
        char c= 35;
        System.out.println(c);
        
        // invalid char ( compile time error )
      // char ch = -1;

        
      
        

       
                     
        // 14.
        // Can't assign float or double to int
        // (Type mismatch: cannot convert from double to int)
         //int i7 = 2.0;
      // (Type mismatch: cannot convert from long to int)
        // int i7 = 9L;

        // 15.
        // instance char defaults to blank
        System.out.println("instance default "+new d1_PrimitiveDatTypes().instCh);

        // instance long defaults to 0L
        System.out.println(new d1_PrimitiveDatTypes().instLg);

        // 16.
        // a number with a decimal is always of type double.
        // we we assign such a decimal number to float then we
        // need to suffix that number with 'f/F'.
        // (Type mismatch: cannot convert from double to float)
        // float f2 = 2.1;
        // valid statement
        float f2 = 2.1F;
        
        // i is not out of maximum int range yet
        int i = 1234567890;
        float f = i;
        System.out.println(i -(int) f);

       
        
       /* final int a1 = 1;
        final Integer b2 = 1;
        final String c1 = ":ONE";
        
        String str1 = a1 + c1;
        String str2 = b2 + c1;
        
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1 == "1:ONE");
        System.out.println(str2 == "1:ONE");
        System.out.println(str2.equals("1:ONE"));*/
        
       /* double d1 = 5f; // p1
		 double d2 = 5.0; // p2
		 float f1 = 5f; // p3
		// float f2 = 5.0; // p4 */
    }    
}

//Ariane 5 Disaster