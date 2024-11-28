package com.lti.demos4.pdfdemos;

public class AnonInner2 {

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
		
    	AnonInner2 a= new AnonInner2();
    	int result =a.admission(100);
    	System.out.println(result);
	}
}
