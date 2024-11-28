package com.lti.demos4.pdfdemos;

public class AnonInner4 {

    interface SaleTodayOnly {

        int dollarsOff();
    }
    

    public int admission(int basePrice) {
        SaleTodayOnly sale = new SaleTodayOnly() /*extends Object*/ {
            @Override
            public int dollarsOff() {
                return 3;
            }
            
            @Override
            public String toString()
            {
            	return "Hello";
            }
          
        };
        return basePrice - sale.dollarsOff();
    }
    
 public static void main(String[] args) {
		
    	AnonInner4 a= new AnonInner4();
    	int result =a.admission(100);
    	System.out.println(result);
	}
}
