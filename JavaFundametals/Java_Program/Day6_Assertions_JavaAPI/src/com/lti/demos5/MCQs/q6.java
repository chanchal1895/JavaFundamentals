package com.lti.demos5.MCQs;

public class q6 {
	public static void main(String[] args) {
		
/*
6. What is the output of the following code?
import java.io.*;
public class AutocloseableFlow {
 static class Door implements AutoCloseable {
 public void close() {
 System.out.print("D");
 throw new RuntimeException();
 } }
 static class Window implements Closeable {
 public void close() {
 System.out.print("W");
 throw new RuntimeException();
 } }
 public static void main(String[] args) {
 try {
 Door d = new Door(); Window w = new Window()
 }
 {
 System.out.print("T");
 } catch (Exception e) {
 System.out.print("E");
 } finally {
 System.out.print("F");
 } } }
A. TWF
B. TWDF
C. TWDEF
D. TWF followed by an exception
E. TWDF followed by an exception
F. TWEF followed by an exception
G. The code does not compile.*/
	}

}
