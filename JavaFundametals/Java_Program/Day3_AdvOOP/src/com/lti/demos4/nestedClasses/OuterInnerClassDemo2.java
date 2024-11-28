package com.lti.demos4.nestedClasses;

//inner classes  // why ? use of inner classe 

//

class PayTax {
	
	int empId = 101;
	double amount=5000.00;

	 class PanCard {  // inner class 
		int PanNo = 12345;	
		

	}
}
	public class OuterInnerClassDemo2 {
			
		  public static void main(String[] args) 
		  {
			  
			 
			 
	    PayTax e = new PayTax();
		    
		    PayTax.PanCard p = e.new PanCard(); 		    
		    
		    System.out.println(e.empId + " " +e.amount +" "+ p.PanNo);
		 
		  }
		}
