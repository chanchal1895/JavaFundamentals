package com.lti.demos1.datatypes;

public class d4_JavaStatements {

	public static void main(String[] args) {
		
		/*int x=0; 
		if(x) 
		{ 
		System.out.println("hello"); 
		}else{ 
		System.out.println("hi"); 
		}}*/
	
	//Without curly braces we can take only one statement under if, but it should not be declarative statement
		
			if(true) 
			System.out.println(" inside true");
			int x=10; 
			
				/*if(true) 
				{
					int x=10; 
				}	*/
		
		
			if(true)
				System.out.println("first stmt");
				System.out.println("second stsmt");
				
				
			/*	int x = 4;
				 long y = x * 4 - x++;
				 if(y<10) System.out.println("Too Low");
				 else System.out.println("Just right");
				 else System.out.println("Too High"); */
				 
			
/*		int x = 5;

		if (x == 5) {
			System.out.println("if-then block");
		}

		if (x == 5)
			System.out.println("if-then single line");

		if (x == 5) {
			System.out.println("if-then-else true branch");
		} else {
			System.out.println("if-then-else false branch");
		}

		if (x != 5)
			System.out.println("if-then-else single line true branch");
		else
			System.out.println("if-then-else single line false branch");

		if (x != 5)
			System.out.println("if-then-else single line true branch");
		else {
			System.out.println("if-then-else single line false branch");
		}

		if (x > 5) {
			System.out.println("if-then-else-if-then first if true branch");
		} else if (x == 5) {
			System.out.println("if-then-else-if-then second if true branch");
		} else {
			System.out.println("if-then-else-if-then block false branch");
		}
*/
		
		
/*
		System.out.println("\n----------------------------------------\n");
		int y=10;
		switch (y) {
		case 0: // If the value is 0, it will print all the cases
			System.out.println("Monday..."); // until it finds a break statement or finishes the structure.
		default:
			System.out.println("Weekday."); // Prints only Friday because the value of y is 10, but if the default block
											// was called,
		case 10: // in case of no match, Weekday and Friday would be printed (no break on the
					// default).
			System.out.println("Friday!");
			break;
		}
*/
	/*
		System.out.println("\n----------------------------------------\n");

		int bitesOfCheese = 10;
		int roomInBelly = 5;

		while (bitesOfCheese > 0 && roomInBelly > 0) {
			--bitesOfCheese;
			--roomInBelly;
		}

		System.out.println(bitesOfCheese + " pieces of cheese left.");

		int chips = 10;
		int roomInPackage = 5;

		do {
			--chips;
			--roomInPackage;
		} while (chips > 0 && roomInPackage > 0);

		System.out.println(chips + " chips left.");

		System.out.println("\n----------------------------------------\n");

		int f = 0;

		for (long i = 0, p = 4; f < 5 && i < 10; f++, i++) {
			System.out.println(i + " ");
		}

		String[] names = new String[3];

		// Prints 3 null values
		for (String name : names) {
			System.out.println(name + " ");
		}

		java.util.List<String> values = new java.util.ArrayList<>();

		// Doesn't iterate over this empty ArrayList.
		for (String value : values) {
			System.out.println(value + " ");
		}

		System.out.println("\n----------------------------------------\n");
*/
			
	/*
		int[][] myComplexArray = new int[][] { { 5, 2, 1, 3 }, { 3, 9, 8, 9 }, { 5, 7, 12, 7 } };
		// int [][] myComplexArray = {{5,2,1,3}, {3,9,8,9}, {5,7,12,7}}; Both compile

		for (int[] mySimpleArray : myComplexArray) {
			for (int i = 0; i < mySimpleArray.length; i++) {
				System.out.println(mySimpleArray[i] + "\t");
			}
			System.out.println();
		}

		int x1 = 20;
		while (x > 0) {
			do {
				x1 -= 2;
			} while (x >5);
			x1--;
			System.out.print(x1 + "\t");
		}

			/*	 int x = 0;        

			        while(true)
			        {                        
			            System.out.println("hello");
			        }
				*/
				//https://www.geeksforgeeks.org/unreachable-code-error-in-java/
			    /*  int x = 0;        

			        while(false)
			        {                        
			            System.out.println("hello");
			        }
			        */
				
			/*	for(int i=0;true;i++){
					System.out.println("hello");
					}
					System.out.println("hi"); */
				
				
				for(int i=0;i<10;i++){
					System.out.println("hello");
					}
					System.out.println("hi"); 
			        
					int dayOfWeek=6;
					final byte saturday = 6;
					switch(dayOfWeek) {
					default:
					System.out.print("Another Weekday");
					break;
					case saturday:
					System.out.print("Weekend!");
					}

					
					
	}
}