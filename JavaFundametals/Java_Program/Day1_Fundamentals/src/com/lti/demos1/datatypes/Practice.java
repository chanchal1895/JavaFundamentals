package com.lti.demos1.datatypes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class Practice 
{
	
	public void fly(Integer i) {
		 System.out.print("Integer ");
		 }

	/*
	 * public void fly(int i) { System.out.print("int "); }
	 */
	private String color;
	 private int height;
	 private int length;
	 public Practice(int length, int theHeight) {
	 length = this.length; // backwards – no good!
	 height = theHeight; // fine because a different name
	 this.color = "white"; // fine, but redundant
	 }
	 public static void main(String[] args) {
		 Practice b = new Practice(1, 2);
	 System.out.println(b.length + " " + b.height + " " + b.color);
	 }
}
