package com.lti.demos3.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class d4_ArraysEx1 {
    
    public static void main(String[] args) {
        
          // No type with a var refernece will set the arraylist type to Object
      
     /*     List arrList1 = new ArrayList<>();
          arrList1.add("20");
        // Invalid ( Type mismatch: cannot convert from element type Object to String )
      /*for( String ele: arrList1 ) {
            System.out.println( ele );
         }*/
        // Valid
       /*for( Object ele: arrList1 ) {
           System.out.println( ele );
       }*/

        // 3. 
        // If no generics are provided in the arraylist, then
        // we can add any type of object into it.
		/*
		 * ArrayList arrlst = new ArrayList(); arrlst.add("Value");
		 * arrlst.add(Boolean.TRUE); arrlst.add(200); System.out.println(arrlst);
		 */

        // 4.
        // we can't add to a list far into the index sequence
		/*
		 * List<String> birds = new ArrayList<String>(); birds.add("hawk");//h
		 * birds.add(1, "robin"); //h r birds.add(1, "blue jay"); //h bl r birds.add(3,
		 * "cardinal"); //h bl r c // throws runtime error birds.add(6, "cardinal");
		 * System.out.println(birds);
		 */
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

        // 5.
        // Array to List using Arrays.asList create a fixed size backed list
        // any changes made to array or list will be reflected at both the places
        // If we try to remove the element from the array or the List then 
        // UnsupportedOperationException will be thrown.
		
		/*
		 * String[] array = { "hawk", "robin" }; List<String> lst =
		 * Arrays.asList(array); lst.set(0, "blue jay"); System.out.println(lst);
		 * array[1] = "new"; System.out.println(lst);
		 */
		 
        //lst.remove(1); // UnsupportedOperationException

        // 6.
        // Creating immutable List using List.of(arr)
        // We cannot change the size or the elements in such alist
		/*
		 * List<String> stringList = Arrays.asList("a", "b", "c");
		 * 
		 * stringList = Collections.unmodifiableList(stringList);
		 * 
		 * System.out.println(stringList);
		 * 
		 * // java.lang.UnsupportedOperationException stringList.add("d");
		 * stringList.set(0, "Change"); System.out.println(stringList);
		 */
              
        //In JDK 9:

      /*  List stringList = List.of("a", "b", "c");
        List<String> immlst = List.of(array);*/
        
       
       //  30 3A  8  9 FF  
       //0  1  2 3  -4
       //-2 -1 // -3 
       
        // 7.
        // binarySearch
       List<String> hex = Arrays.asList("30", "8", "3A", "FF");
        Collections.sort(hex); 
        System.out.println(hex);  
       int x = Collections.binarySearch(hex, "8");
        int y = Collections.binarySearch(hex, "3A");
        int z = Collections.binarySearch(hex, "9F");    
        
        System.out.println(x + " " + y + " " + z); 

        // 8.
        // 
		/*
		 * List<String> list = new ArrayList<>(); list.add("P"); list.add("O");
		 * list.add("T");
		 * 
		 * List<String> subList = list.subList(1, 2); subList.set(0, "E");
		 * System.out.println(String.join("", list));
		 */
        
        
        // 9.
        // A null array reference is considered lexicographically
        // less than a non-null array reference.
     // System.out.println( java.util.Arrays.compare(new int [] {10}, null) ); // 1
     // System.out.println( java.util.Arrays.compare(new int [] {10}, 1) ); 
    

        // 10.
        // Compare and Mismatch
        // Two null array references are considered equal.
       /* int[] a1 = null;
        int[] a2 = null;*/
   //     System.out.println( java.util.Arrays.compare(a1, a2) ); // 0
        // null are not an array
        // ( The method compare(boolean[], boolean[]) is ambiguous for the type Arrays )
        // System.out.println( java.util.Arrays.compare(null, null) );

        // But we can compare with an array
       /* System.out.println( java.util.Arrays.compare(null, a1) ); // 0

        int[] a3 = {1};
        System.out.println( java.util.Arrays.compare(null, a3) ); // -1
        System.out.println( java.util.Arrays.compare(a3, a3) ); // 0
*/
        // Compare has following algo
        // int i = Arrays.mismatch(a, b);
        // if (i >= 0 && i < Math.min(a.length, b.length))
        //      return Character.compare(a[i], b[i]);
        //  return a.length - b.length;
        char [] arr1 = {'A', 'A'};
        char [] arr2 = {'A', 'A', 'A', 'A'};
     /*   System.out.println(Arrays.compare(arr1, arr2)); // -2
        System.out.println(Arrays.mismatch(arr1, arr2)); // 2
*/
        int [] array1 = {};
        int [] array2 = {100, 200};
    /*    System.out.println(Arrays.compare(array1, array2)); // -2
*/
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Array index out of range: 10
        // char [] carr1 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'i', 'j', 'k'};
        // char [] carr2 = {'f', 'g', 'a', 'i', 'k'};
        // System.out.println(Arrays.mismatch(arr1, 5, 10, arr2, 0, 5));

        String [] str1 = {"A", "AA", "ABCD"};
        String [] str2 = {"A", "AA", "ABCB"};
       /* System.out.println(Arrays.mismatch(str1, str2)); // 2
        System.out.println(Arrays.compare(str1, str2)); // 2
*/        System.out.println("ABCD".compareTo("ABCB")); // 2
        // System.out.println("ABCD".compareTo(null)); // NullPointerException

        // 11.
        // Unrelated array
       /* int elements = 0;
        Object [] objArr = {"A", "E", "I", new Object(), "O", "U"}; //Line n1
        for(var obj : objArr) { //Line n2
            
            elements++; //Line n3
            if(obj instanceof String) {
                continue;
            } else {
                break;
            }
        }
        System.out.println(elements); // 4

        String [] sarr = new String[7];
        System.out.println(sarr); // L....@....

        String[] s4 = { "Camel", null};
        System.out.println( Arrays.compare(s4, s4));*/
    }
}
