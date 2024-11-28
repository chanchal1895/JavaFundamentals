package com.lti.demos2.arrayex;

public class ArrayExMcqs {
	
	public static void main(String[] args) {
		
	/*	int[][] x= new int[6][3];
		System.out.println(x.length);
		
		String[] s= {"A","AA","AAA"};
		System.out.println(s.length);
	//	System.out.println(s.length());
		//System.out.println(s[0].length);  // s[0] is String "A" 
		System.out.println(s[0].length());
		
		*/
	//Annonymous Arrays :
		//auto :...one time usage /instant use 
		
		//new int[]{10,20,30};
		
	//	new int[3]{10,20,30};
		
		//int [] someAry= new int[3] {10,20,30};
		
		//int [] someAry= new int[] {10,20,30};
		
		//Q 
	/*	int[] a= {10,20,30,40,50};
		int [] b= {60,70};
		b=a;
		for(int i:b)
		{
			System.out.println(i);
		}*/
		
		
		//Q
		//int[][] a1= new int[3][];
		
		//which is valid assignment ? 
		
		// a1[0]=new int[4][5];
		// a1[0]=10;
		 //a1[0]= new int[4];
		// None
		
		//when we assign one array to other , dimentions must match
		
		
		//Q 
		
		/*String[] argh= {"A","B"};
		args=argh;
		for(int i=0;i<args.length;i++)
		{
			System.out.println(args[i]);
		}*/
		
		//what if we run > java ArrayEx1 X Y Z?
		
		/* 
		 * A. Compilation fails
		 * B.An exception is thrown at runtime 
		 * C.XYZ
		 * D.A B  
		 * 
		 * --> ArrayIndexOutOfBoundException 
		 */
		
		//LVIT - Local variable typeinterface 
		
		int[] x= new int[] {10,20,30,40};
	//java 11	
		
		//var x= new int[] {10,20,30,40}; //valid
		
		//var x= new Integer[] {10,20,30,40}; //valid
				
		/*var a1= {10,20,30}; //invalid
		var a2= [10,20,30];
		var a3= (10,20,30);*/
		
		
		
		
		/*
		 * q1 game[3][3] = 6;
		 * 
		 * Object[] obj = game; game[3][3] = "X"; System.out.println(game[3][3]);
		 */
		// q2

		String[] days = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		for (int i = 1; i <= days.length; i++)
			System.out.println(days[i]);

		// q3 find illegal declarations :

		int[][] scores = new int[5][];
		Object[][][] cubbies = new Object[3][0][5];
		// String beans[] = new beans[6];
		java.util.Date[] dates[] = new java.util.Date[2][];
		// int[][] types = new int[];
		// int[][] java = new int[][];

		// Which of these four array declarations produces a different array than the
		// others?
		int[][] nums = new int[2][1];
		int[] nums1[] = new int[2][1];
		int[] nums2[] = new int[][] { { 0 }, { 0 } };
		int[] nums3[] = new int[][] { { 0, 0 } };
		
		
		
	}

}
