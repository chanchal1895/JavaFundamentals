package com.lti.demos4.pdfdemos;

public class AnonInner1 {
    //Member Inner Class
    abstract class SaleTodayOnly {
    abstract int dollarsOff();
    }   

    public int admission(int basePrice) {
      
    	       	
        SaleTodayOnly sale = new SaleTodayOnly() {
            @Override
            int dollarsOff() {
                return 3;
            }
        };       
        
        return basePrice - sale.dollarsOff();
    }    
    public static void main(String[] args) {
		
    	AnonInner1 a= new AnonInner1();
    	int result =a.admission(100);
    	System.out.println(result);
	}
}
