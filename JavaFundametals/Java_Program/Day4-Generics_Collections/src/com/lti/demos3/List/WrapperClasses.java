package com.lti.demos3.List;
import java.util.ArrayList;
import java.util.List;

/**
 * WrapperClasses
 */
public class WrapperClasses {

    public static void main(String[] args) {
        
        // 1.
        // parseInt is to get primitive
        // valueOf is to get the wrapper class object
    	
        int primitiveInt = Integer.parseInt("123");
        Integer wrapperInt = Integer.valueOf("232");
        System.out.println(primitiveInt);
        System.out.println(wrapperInt);

        // 2.
        // No issues here
        float fl = Float.valueOf("22");
        System.out.println(fl);

        // 3.
        // Unboxing a null will give null pointer
        List<Integer> heights = new ArrayList<Integer>();
        heights.add(null);
        // NUllPointerException in below code
        // int ht = heights.get(0);

        // 4.
        // Autoboxing integer issue
        List<Integer> widths = new ArrayList<Integer>();
        widths.add(1);
        widths.add(2);
        widths.remove(1); // this will not remove 1 but the element on index 1 i.e 2
        System.out.println(widths);
        
        
        List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(new Integer(3));
		numbers.add(new Integer(5));
		System.out.println(numbers); // [1, 3, 5]

		// The remove() method is overloaded. One signature takes an int as the index of
		// the element to remove. The other takes an Object that should be removed.

		// Java sees a matching signature for int, so it doesn’t need to autobox the
		// call to the method
		numbers.remove(1);
		System.out.println(numbers); // [1, 5]

		// calls the other remove() method, and it removes the matching object, which
		// leaves us with just [1].
		numbers.remove(new Integer(5));
		System.out.println(numbers); // [1]
		
		
		 List<Integer> heightAry = new ArrayList<>();
		 heightAry.add(null);
		 int h = heights.get(0);
        
        
    }
}