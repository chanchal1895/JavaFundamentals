package com.lti.demos2.arrayex;

import java.util.List;

class Student
{
	
}
public class ArrayEx {

	public static void main(String[] args) {
		
	// 1 valid and invalid declarations 
			int[] myAry;
			int myAry1[];
			int []myAry2;

			String[] s;
			Student s1[];
			char[] chAry[];


			//int[5] a; 
			  
			int[][]               [] a1;  
			int[] []   a2[];
			int[]   [][]a3;
			int []  []a4[];

			int[]  a5[][] ;
			int    [][] a6[];
			int      []a7[][];



			int []  []x,y;  // both i dim
			int [] x1[],y1; // a is 2 dim , 
			int [] [] x2, b2;  // both 2 dim 
			
			
			x=new int[3][4];
			y=new int[3][5];
			
			float[][] matrix = new float[5][3];
			
			
			//You can also declare and initialize elements of an array in one statement. For example:
			//int[]  numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
			//String[] columnNames = {“No”, “Name”, “Email”, “Address”};
			
			String[][] sampleData = {
			        {"a", "b", "c", "d"},
			        {"e", "f", "g", "h"},                  
			        {"i", "j", "k", "l"},
			        {"m", "n", "o", "p"},              
			    };
			
			//int[] p , []b;
			
			////All numbers are initialized to zeroes by default. 
			//	Boolean elements are initialized to false by default.
			//all elements of String type are initialized to null.
			//all elements of Object type are initialized to null.
			
			//25

//The toString method of Class invokes the getName method of Class which
			byte[] m= new byte[3];
			//byte[][] m= new byte[3][6];
			System.out.println(m.getClass().getName());//[B
			
			

			boolean[] m1= new boolean[3];
			System.out.println(m1.getClass().getName());//[B
			
			
			
			String[] m2= new String[3];
			System.out.println(m2.getClass().getName());//[B
			
			
			
			
			byte[] me = new byte[1];
			int[] me2 = new int[1];
			double[] me3 = new double[1];
			float[] me4 = new float[1];
			String[] me5 = new String[1];
			Integer[] me6 = new Integer[1];

			System.out.println(me.getClass());                  
			System.out.println(me2.getClass());                 
			System.out.println(me3.getClass());                 
			System.out.println(me4.getClass());                 
			System.out.println(me5.getClass());
			System.out.println(me6.getClass());
			
			Student st[] = new Student[2];
			System.out.println(st);
			
			
			/*"Every array has an associated Class object, shared with all other arrays with the same component type. The direct superclass of an array type is Object."
			 * 
			 * 
			 * If this class object represents a class of arrays, then the internal form of the name consists of the name of the element type preceded by one or more '[' characters representing the depth of the array nesting. The encoding of element type names is as follows:

 Element Type           Encoding
 boolean                Z
 byte                   B
 char                   C
 class or interface     Lclassname;
 double                 D
 float                  F
 int                    I
 long                   J
 short                  S 
			 */
			
			
			
			//int[] h = new int[];
			
			//int[] h = new int[4];
			
			
			int[] h = new int[0]; //valid 
			h[0]= 10;
			System.out.println(h[0]);
			
			
			byte b=10;
//			short b=10;
			//long b=10;
			int[] x10= new int[b]; // [char byr short int --allowed ]
			System.out.println(x10.length);
			
			//int nm[]= new int[214743847];
		//	int nm[]= new int[21644743847];
			
			
			//length vs length()
			
			
			System.out.println(x10.length);
			//System.out.println(x10.length());
			
			String str= "meenal";
			//System.out.println(str.length);
			System.out.println(str.length());
			
			
			
			
			int[] ary= new int[] {10,20,30};
		//	int [] ary1= new int[];
			
			int [] ary2= new int[3];
			//int [] ary3= new int[3] {10,20,30};
			
			
			float[] f= new float[10];
			f[0]=10;
			f[1]='a';
			f[2]=10l;
			f[3]=10.5f;
			//f[4]=10.5;
			
			
			
			Object [] a= new Object[10];
			a[0]=new Object();
			a[1]= new Integer(10);
			a[2]= new String("meenal");
			
			
			Number[] n= new Number[10];
			n[0]= new Integer(10);
			//n[1]= new String("meenal");
			//Number[] n= new Number();
			
			//interface type array
			
			
			Runnable[] r=  new Runnable[2];
			r[0]= new Thread();
			
			
			List[] myList= new List[2];
			
			//To get 3 consecutive x's which of the following declarations required 
			//to win the game 
			// 0 0 X
			// X X -
			// - 0 - 
			
			//A ) tictak[2][0]="X"
			//B ) tictak[2][1]="X"
			//C ) tictak[1][2]="X"
			//D ) tictak[2][2]="X"
			
			//which are valid ?
			//https://www.youtube.com/watch?v=_ClnzlhdKDI&list=PLd3UqWTnYXOnujVvl3wiZfrFKUEg9jBeA&index=12
			//int[] a= {10,20,30};
			char[] ch= {'a','b','c'};
			
			//s1:int[] b=a;
			//s2:int[] c=ch;
			
			//A)only s1 valid 
			//B)only s2 valid 
			//C)both are valid 
			//D)both are invalid 
			
			//char [] can't be conveted to int []type
			//int [] c= ch;
			
			
			// which of the following conversions will be performed automatically ?
			
			//char--> 
			//char[] -->int[]
			//int -->long
			//int[]-->long[]
			//double ---> float 
			//double []---> float 
			//String-->object
			//String[]---> Object[]
			
			//Element level promptions are not applicatble at array level
			//For eg, char can be propmoted to int type 
			//but char[] can't be promoted to int[] type 
			
			//But in case of Object type arrays, child type can be promoted to parent type arrays 
			
			
			
			
			
			String [] sary= {"A","B","C"};
			Object[] o=sary;
			
			
		/*	The Arrays is a utility class which can be found in the java.util package. Here are some noteworthy methods it provides:

				asList(): returns a fixed-size list backed by an array.
				binarySearch(): searches for a specific value in an array. Returns the index of the element if found, or -1 if not found. Note that the array must be sorted first.
				copyOf(): copies a portion of the specified array to a new one.
				copyOfRange(): copies a specified range of an array to a new one.
				equals(): compares two arrays to determine if they are equal or not.
				fill(): fills same values to all or some elements in an array.
				sort(): sorts an array into ascending order.
			*/
			
			
			
			
			
			
			
			
			
			
			
			
			
			

	}

}
