package com.lti.demos0_Optional;

import java.util.Optional;

public class demo1 {
	public static void main(String[] args) {
		
		//Optional is a container type for a value which may be absent.
				//say example :
			//	User user = findUserById("667290");
			//	System.out.println("User's Name = " + user.getUserName());
				
				// if id does not exist user is null -NullPointerException is throws 
		
	/*
		String[] str = new String[10];         
        String str2 = str[9].substring(2, 5);   // u get java.lang.NullPointerException     
        System.out.print(str2);   
       */
       
        
        //Solution: Using Optional Classs
        
      //.ofNullable() method of the Optional class, returns a Non-empty Optional if the given object has a value,
       // otherwise it returns an empty Optional.
      //  We can check whether the returned Optional value is empty or non-empty using the isPresent() method.
        


		//Creating Optional object from a String
     Optional<String> GOT = Optional.of("Game of Thrones");    
     
        //Optional.empty() creates an empty Optional object        
        Optional<String> nothing = Optional.empty();
        /* isPresent() method: Checks whether the given Optional Object is empty or not.         
         */        
		/*
		 * if (GOT.isPresent()) { System.out.println("Watching Game of Thrones"); } else
		 * { System.out.println("I am getting Bored"); }
		 */
        /* ifPresent() method: It executes only if the given Optional object is non-empty.           */        
        //This will print as the GOT is non-empty        
       // GOT.ifPresent(s -> System.out.println("Watching GOT is fun!"));                
        //This will not print as the nothing is empty        
      //  nothing.ifPresent(s -> System.out.println("I prefer getting bored"));
        
		
		
        String[] str = new String[10];     
		/*
		 * Optional<String> myVar = Optional.ofNullable(str[9]);
		 * System.out.println(myVar); System.out.println(myVar.isPresent());
		 * 
		 * if(myVar.isPresent()){ String str2 = str[9].substring(2, 5);
		 * System.out.print("Substring is: "+ str2); } else{
		 * System.out.println("Cannot get the substring from an empty string"); }
		 */   
        
        
        
        
       // str[9] = "AgraIsCool";       
        str[9]=null;
        
        Optional<String> isNull2 = Optional.ofNullable(str[9]); 
        System.out.println(isNull2);
        if(isNull2.isPresent()){               
           String str2 = str[9].substring(2, 5);    
           System.out.print("Substring is: "+ str2);         
        }         
        else{         
           System.out.println("Cannot get the substring from an empty string");         
        }  
        
        
        
	}

}
