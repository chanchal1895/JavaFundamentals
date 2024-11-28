package com.lti.demos4.pdfdemos;

public class A {
    private int x = 10;
    private int y;

 class B {      	
    	B()
    	{       
    		A obj = new A();
    	    obj.y = 600; //can access private variable of outer class 
    	   
    	}    	
    	void show()
    	{
    		 A obj = new A();
	         obj.y = 100; //can access private
	         System.out.println(obj.y);
    	}
    	
    	private int x = 20;         
        class C {

            private int x = 30;

            public void allTheX() {            
            	
                System.out.println(x); 
                System.out.println(this.x); 
                System.out.println(B.this.x);
                System.out.println(A.this.x); 
            }
        }
    }

    public static void main(String[] args) {
        A a = new A();
       // A.B b= new A.B();
       A.B b = a.new B();  
        b.show();
        A.B.C c = b.new C();
        c.allTheX();
    }
}
