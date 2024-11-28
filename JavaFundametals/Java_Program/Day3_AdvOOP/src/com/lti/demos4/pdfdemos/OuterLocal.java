package com.lti.demos4.pdfdemos;
/*
 * A local inner class is a nested class defined within a method. Like local variables, a local 
inner class declaration does not exist until the method is invoked, and it goes out of scope 
when the method returns. This means that you can create instances only from within the 

method. Those instances can still be returned from the method. This is just how local variables work. L
 */


public class OuterLocal {

    private int length = 5;

    public void calculate() {
    	
    	//after java 8 , no need to write final keyword
    	int width = 20;
    //	width=100; will not act as final , and can't use within inner class 
    
    class Inner {
            public static final int CONSTANT = 1;           
       
            public void multiply() {
            	//width=100;  
                System.out.println(length * width);
                System.out.println(CONSTANT);
              
            }
        }
        
        Inner inner = new Inner();
        inner.multiply();
    }

    public static void main(String[] args) {
        OuterLocal outer = new OuterLocal();
        outer.calculate();
    }

   
}
