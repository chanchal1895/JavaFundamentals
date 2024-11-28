package com.lti.demos5.MCQs;

public class q16_17 {
	public static void main(String[] args) {
/*
16. What is the output of the following?
public class SnowStorm {
 static class Walk implements AutoCloseable {
 public void close() {
 throw new RuntimeException("snow");
 }
}
public static void main(String[] args) {
 try (Walk walk1 = new Walk(); Walk walk2 = new Walk();) {
 throw new RuntimeException("rain");
 } catch(Exception e) {
 System.out.println(e.getMessage()
 + " " + e.getSuppressed().length);
 } } }
A. rain 0
B. rain 1
C. rain 2
D. show 0
E. snow 1
F. snow 2
G. The code does not compile.*/
		/*
17. Fill in the blank: A class that implements _________________ may be in a try-with-resource 
statement. (Choose all that apply.)
A. AutoCloseable
B. Closeable
C. Exception
D. RuntimeException
E. Serializable
18. Which pairs fill in the blanks? The close() method is not allowed to throw 
a(n) _________________ in a class that implements _________________. (Choose all that apply.)
A. Exception, AutoCloseable
B. Exception, Closeable
C. IllegalStateException, AutoCloseable
Review Questions 323
D. IllegalStateException, Closeable
E. IOException, AutoCloseable
F. IOException, Closeable */
		
		
	}

}
