package com.lti.demos1.datatypes;

public class d2_IncrDecrOperators {
	
	public static int m1(int i) {
		System.out.println(i);
		return i;
		}



	public static void main(String[] args) {

		/*
		 * int x = 40; int y = x++; System.out.println(y);
		 */

		/*
		 * int x1 = 40; int y1 = ++x1; System.out.println(y1);
		 */

		// int y1=++4; // not allowed 4 acts as a constant
		// final int f=10;
		// int y1=f++; //can't apply to final variable

		// can't perform nesting of increment or decrement operator,

		/*
		 * int x2= 4; int y2 = ++(++x2); System.out.println(y2);
		 */

		char ch = 'a';
		ch++;
		System.out.println(ch); // b

		// double d = 10.5;
		// d++;
		// System.out.println(d); // 11.5

		// can't apply to boolean

		// boolean b=true;
		// b++;
		// System.out.println(b);

		// diff bet b++ and b=b+1

		/*
		 * byte b1=20; // byte b2=b1+1; b2= byte+int int b2= b1+1;
		 * System.out.println(b2);
		 */
		/*
		 * 
		 * byte b=10; b++; System.out.println(b); //11
		 * 
		 * 
		 * byte b=10; b+=1; System.out.println(b); //11
		 * 
		 * 
		 * 
		 * byte b=127; b+=3; System.out.println(b); //-126
		 * 
		 * 
		 * byte b1 = 20; // byte b2=b1+1; int b2 = b1++; // b2= (type of b) (b1+1) i.e
		 * b2= byte(b1+1) System.out.println(b2);
		 */

		/*
		 * byte a = 10;
		 *  byte b = 20; 
		 *  // byte c=a+b; 
		 *  // byte c=byte(a+b); 
		 *  int c = a + b;
		 * System.out.println(c);
		 */

		// Arithmatic operrator rules :

		/*
		 * byte + byte=int 
		 * byte+short=int 
		 * short+short=int 
		 * short+long=long
		 * double+float=double 
		 * int+double=double
		 *  char+char=int char+int=int
		 * char+double=double
		 */

// u can't declare  		int a=b=c=d=30;

		int a, b, c, d;
		a = b = c = d = 20;
		a += b -= c *= d /= 2;
		System.out.println(a + "---" + b + "---" + c + "---" + d);// -160...-180---200---10

		System.out.println('a' + 'b'); // output : 195
		System.out.println('a' + 1); // output : 98
		System.out.println('a' + 1.2); // output : 98.2
		
		
		

		// In integral arithmetic (byte , int , short , long) there is no way to
		// represents infinity ,
		// if infinity is the result we will get the ArithmeticException / by zero
		// System.out.println(10/0); // output RE : ArithmeticException / by zero
		// But in floating point arithmetic(float , double) there is a way represents
		// infinity.

		// System.out.println(10/0);
		System.out.println(10 / 0.0); // output : infinity
		System.out.println(-10 / 0.0); // output : - infinity

		// . NaN(Not a Number) in integral arithmetic (byte , short , int , long) there
		// is no way to represent undefine the results.
		// Hence System.out.println(0/0); // output RE : ArithmeticException / by zero

		// But floating point arithmetic (float , double) there is a way to represents
		// undefined the results .
		// For the Float , Double classes contains a constant NaN ,
		System.out.println(0.0 / 0.0); // output : NaN
		System.out.println(-0.0 / 0.0); // output : NaN

		System.out.println(Float.NaN);

		System.out.println(10 < Float.NaN); // false
		System.out.println(10 <= Float.NaN); // false
		System.out.println(10 > Float.NaN); // false
		System.out.println(10 >= Float.NaN); // false
		System.out.println(10 == Float.NaN); // false
		System.out.println(Float.NaN == Float.NaN); // false
		System.out.println(10 != Float.NaN); // true
		System.out.println(Float.NaN != Float.NaN); // true

		/*
		 * ArithmeticException : 1. It is a RuntimeException but not compile time error
		 * 2. It occurs only in integral arithmetic but not in floating point
		 * arithmetic. 3. The only operations which cause ArithmeticException are : ' /
		 * ' and ' % '
		 */

		// The only overloaded operator in java is ' + ' operator

		// If one argument is String type , then '+' operator acts as concatenation

		/*
		 * String a="ashok"; int b=10 , c=20 , d=30 ; System.out.println(a+b+c+d);
		 * //output : ashok102030 System.out.println(b+c+d+a); //output : 60ashok
		 * System.out.println(b+c+a+d); //output : 30ashok30
		 * System.out.println(b+a+c+d); //output : 10ashok 2030
		 */

		// If both arguments are number type , then operator acts as arithmetic operator

		// String a="bhaskar";
		// int b=10,c=20,d=30;

		a = a + b + c;
//		 a=b+c+d;		

		System.out.println(a);
		System.out.println(c);
		b = b + c + d;
		System.out.println(b);

		// operator > can't be applied to boolean , boolean
		// operator > can't be applied to java.lang.String ,

		System.out.println(10 < 10.5); // true
		System.out.println('a' > 100.5); // false
		System.out.println('b' > 'a'); // true

		// System.out.println(true > false);

		// Nesting of relational operator is not allowed
		// System.out.println(10 > 20 > 30); operator > can't be applied to boolean ,
		// int

		// Conditional Operator

		// int x=(10>20)?30:40;
		// System.out.println(x); //40

		// int x=(10>20)?30:((40>50)?60:70);
		// System.out.println(x); //70
		
		//Operator precedence :
		
		//There is no precedence for operands before applying any operator all operands will be  	evaluated from left to right. 
		
		System.out.println(m1(1)+m1(2)*m1(3)/m1(4)*m1(5)+m1(6));
		
		int i=1;
		i+=++i + i++ + ++i + i++;
		System.out.println(i); //13
	
		//i=i + ++i + i++ + ++i + i++ ;
		//i=1+2+2+4+4;
		//i=13;

	/*	System.out.println("mcq1 \n ");

		int x = 10, y = 5;
		boolean w = true, z = false;
		x = w ? y++ : y--; //x==true? y++   y=6 , x=5 
		w = !z; // w=true
		System.out.print((x+y)+" "+(w ? 5 : 10)); // 5+ 5 " " 5 //11  " " 5 */
		
		
		System.out.println("mcq1 \n ");

		int x = 10, y = 5;
		boolean w = true, z = false;
		x = w ? ++y : --y; //x==true? y++   y=6 , x=6 
		w = !z; // w=true
		System.out.print((x+y)+" "+(w ? 5 : 10)); // 6+ 6 " " 5 //11  " " 5 
		
	System.out.println("\n mcq2");
	
	int pterodactyl = 6;
	long triceratops = 3;
	if(pterodactyl % 3 >= 1)  // 6%3 =0 //false 
	triceratops++;
	triceratops--; // 2 
	System.out.print(triceratops);


		
	}

}
