package com.lti.demos3.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
class Student
{
	int id;
	String name;
}

class Book
{
	int bId;
	double cost;
}


public class Ex3_ArrayListDemo {
	public static void main(String[] args) {
		/*
		 * List aList = new ArrayList(); // aList.add("test"); aList.add(123);//
		 * autoboxing feature aList.add(true); aList.add(Boolean.TRUE);
		 * 
		 * System.out.println(aList);
		 * 
		 * 
		 * 
		 * // aList.add(55.22);
		 * 
		 * for (Object i : aList) { System.out.println("Element is " + i);
		 * 
		 * }
		 * 
		 * Student s1= new Student(); Book b1= new Book();
		 * 
		 * List myList= new ArrayList();
		 * 
		 * myList.add(s1); myList.add(b1); System.out.println(myList);
		 */
		
		/*
		 * List aList1 = new ArrayList(); aList1.add("test");
		 * 
		 * for (String i : aList) { System.out.println("Element is " + i); }
		 */
		 
		 
		/*List<String> birds = new ArrayList<>();
		birds.add("hawk"); 
		birds.add(1, "robin"); 
		birds.add(0, "blue jay"); 
		birds.add(1, "cardinal"); 
		System.out.println(birds); */

		/*
		 * List<String> birds = new ArrayList<>(); birds.add("hawk"); birds.add("hawk");
		 * System.out.println(birds.remove("cardinal"));
		 * System.out.println(birds.remove("hawk"));
		 * 
		 * System.out.println(birds.remove(0)); System.out.println(birds);
		 */
		
		/*
		 * List<String> birds = new ArrayList<>(); System.out.println(birds.isEmpty());
		 * birds.add("hawk"); System.out.println(birds.size()); birds.set(0, "robin");
		 * // robin System.out.println(birds.size()); // birds.set(1, "robin"); //
		 * System.out.println(birds);
		 * 
		 * System.out.println(birds.contains("robin")); birds.clear();
		 */
		  //System.out.println(birds.containsIgnoreCase("Robin"));	  
		   
		
		
		  List<String> one = new ArrayList<>(); 
		  List<String> two = new ArrayList<>();
		  
		  System.out.println(one.equals(two));
		  one.add("a");
		  System.out.println(one.equals(two));
		  two.add("a");
		  System.out.println(one.equals(two)); 
		  one.add("b");
		  two.add(0, "b");
		  System.out.println(one.equals(two));
		 
	
		
	}

}

// Book b1= new Book(1111,"java","AUthor1","dsad");
// myList.add(b1);

/*
 * Iterator it1 = myList.iterator();
 * 
 * while(it1.hasNext()) { System.out.println( it1.next() ); }
 */

/*
 * List<Student> myList1 = new ArrayList<Student>(); Student s4= new
 * Student(103,"Dhananjay",20000); myList1.add(s4);
 * 
 * for (Student s:myList1) { System.out.println(s); }
 * 
 * Book b1= new Book(1111,"java","AUthor1","dsad"); myList1.add(b1);
 * 
 * /
 **/

//	}
//}*/

/*
 * System.out.println( myList );
 * 
 * String str = (String)myList.get( 0 );
 * 
 * System.out.println(str.toUpperCase());
 * 
 * Student stn = (Student)myList.get( 4 ); 
 * System.out.println(stn);
 */
//		stn.setFees( stn.getFees() + 1000 );
//		
//		System.out.println( myList.toString() );
//		
//		System.out.println( myList.contains( new Book(123441,null, null, null) ) );
//		
// System.out.println( myList.size());

/*
 * for (int index = 0; index < myList.size(); index++) { System.out.println(
 * (index+1) +")" + myList.get(index) ); }
 */
/*
 * for (Object object : myList) { System.out.println(object); }
 * 
 * Iterator it = myList.iterator();
 * 
 * while(it.hasNext()) { System.out.println( it.next() ); }
 */

// System.out.println("After removing book");

// myList.remove(3);
//		int index = myList.indexOf( new Book(123441,null, null, null) );
//		
//		if( index != -1 )
//		{
//			myList.remove( index );
//		}

/*
 * myList.remove( new Book(123441,null, null, null) );
 * 
 * it = myList.iterator();
 * 
 * while(it.hasNext()) { System.out.println( it.next() ); }
 */

/*
 * List<Integer> ages = new ArrayList<>(); ages.add(Integer.parseInt("5"));
 * 
 * ages.add(Integer.valueOf("6")); ages.add(7); ages.add(null); for (int age
 * :ages) System.out.print(age);
 */

/*
 * ArrayList<Integer> values = new ArrayList<>(); values.add(4); values.add(5);
 * values.set(1, 6); values.remove(0); for (Integer v : values)
 * System.out.print(v);
 */