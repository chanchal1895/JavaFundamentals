package com.lti.demos1.strings;


public class Demo9_TestSubString {
	
	public static void main(String[] args) {
		
		String Str = new String(" Aelxander");   
       //first way of implementation
        System.out.print("The extracted substring: "); 
        System.out.println(Str.substring(3)); 
                
        //2nd way of implementation 
//        System.out.println(Str.substring(3,5));//xa //start from 3rd index and  ends till 5 th index 
//        System.out.println(Str.substring(3,8));//xande
//        System.out.println(Str.substring(3,9));//xander
//       
        System.out.println(Str.substring(2,6));//exan
        
        //System.out.println(Str.substring(3,10));index out of bound 
        
        //start index is inclusive and end index is exclusive.
        //In other words, 
        //start index starts from 0 whereas end index starts from 1.
        
        //eg use to remove Mr. Mrs. Rs etc 
        
        
	}

}
/*
Internal implementation
public String substring(int beginIndex) {  
       if (beginIndex < 0) {  
           throw new StringIndexOutOfBoundsException(beginIndex);  
       }  
       int subLen = value.length - beginIndex;  
       if (subLen < 0) {  
           throw new StringIndexOutOfBoundsException(subLen);  
       }  
       return (beginIndex == 0) ? this : new String(value, beginIndex, subLen);  
   } */