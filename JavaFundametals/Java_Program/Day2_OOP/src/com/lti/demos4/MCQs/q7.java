package com.lti.demos4.MCQs;

public class q7 {
	public static void main(String[] args) {
		/* Given the following my.school.ClassRoom and my.city.School class definitions, which 
		line numbers in main() generate a compiler error? (Choose all that apply)
		package my.school;
		 public class Classroom {
		private int roomNumber;
		 protected String teacherName;
		 static int globalKey = 54321;
		 public int floor = 3;
		 Classroom(int r, String t) {
	 		roomNumber = r;
		 teacherName = t; } }
		 package my.city;
		import my.school.*;
		
	public class School {
	 public static void main(String[] args) {
		 System.out.println(Classroom.globalKey);
		 Classroom room = new Classroom(101, ""Mrs. Anderson");
		
		7: System.out.println(room.roomNumber);
		8: System.out.println(room.floor);
		9: System.out.println(room.teacherName); } }
		A. None, the code compiles fine.
		B. Line 5
		C. Line 6
		D. Line 7
		E. Line 8
		F. Line 9 */
	}

}
