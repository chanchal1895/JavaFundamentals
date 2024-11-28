package com.lti.demos4.pdfdemos;
/*
An anonymous inner class is a local inner class that does not have a name. It is declared 
and instantiated all in one statement using the new keyword. Anonymous inner classes are 
required to extend an existing class or implement an existing interface. They are useful when 
you have a short implementation that will not be used anywhere else. 
*/


public class AnonInner3 {

    interface SaleTodayOnly {

        int dollarsOff();
    }

    public int pay() {
        return admission(5, new SaleTodayOnly() {
            public static final int CONSTANT = 1;

            @Override
            public int dollarsOff() {
                return 3;
            }
        }
        );
    }

    public int admission(int basePrice, SaleTodayOnly sale) {
        return basePrice - sale.dollarsOff();
    }
    
 public static void main(String[] args) {
		
    	AnonInner3 a= new AnonInner3();
    	int result =a.pay();
    	System.out.println(result);
	}
}
