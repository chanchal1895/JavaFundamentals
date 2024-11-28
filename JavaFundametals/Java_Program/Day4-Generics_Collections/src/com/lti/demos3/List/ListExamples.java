package com.lti.demos3.List;
	
import java.util.*;

public class ListExamples {

    public static void main(String... args) {
    	
   // 	 List names = new ArrayList();//Java 4 and Prior
      //   List<String> names1 = new ArrayList<String>();//Java 5
      //   List<String> names2 = new ArrayList<>(); //Java 7
         
        /* ArrayList list1 = new ArrayList(); 
         ArrayList list2 = new ArrayList(10);
         ArrayList list3 = new ArrayList(list2);
         System.out.println(list3.size());  */
         

      /*  List<String> slist = new ArrayList<>();
        slist.add("SD"); // SD 
        slist.add(0, "NY");// NY 
        System.out.println(slist.get(2)); 
        slist.set(1, "FL"); // NY FL 
        
        System.out.println(slist);   // NY FL              
                
        slist.remove("NY"); // FL 
        slist.remove(0); // 
        System.out.println(slist);  */
        

      /*  List<Integer> numbers = Arrays.asList(1, 2, 3);
        numbers.replaceAll(x -> x * 3);
        System.out.println(numbers);*/
        
        
      /*  
        List<String> list = new ArrayList<>();
		list.add("Fluffy");
		list.add("Webby");

		String[] array = new String[list.size()];

		array[0] = list.get(1);
		array[1] = list.get(0);

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + "-");
		}
		*/
		

		String[] array2 = { "gerbil", "mouse" }; //new  mouse //// backed array
		
		// fixed size list is created 
		
		
		List<String> myLsit = Arrays.asList(array2); // myList // gerbil  test  
		
		myLsit.set(1, "test"); 
		array2[0] = "new";
		
		for(String s:array2)
		{
		System.out.println(s); 
		}
		
		 
		System.out.println(myLsit.get(2));
		
		
		//System.out.println(Arrays.asList(array2));
		//String[] strAry=(String[]) myLsit.toArray();
		//System.out.println(strAry);
		
		
		//String[] array3 = (String[]) list.toArray(); // [new, test]
		//System.out.println(array3);
      
	}
}