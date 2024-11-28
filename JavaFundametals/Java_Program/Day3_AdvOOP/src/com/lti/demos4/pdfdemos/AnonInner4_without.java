package com.lti.demos4.pdfdemos;
/*
An anonymous inner class is a local inner class that does not have a name. It is declared 
and instantiated all in one statement using the new keyword. Anonymous inner classes are 
required to extend an existing class or implement an existing interface. They are useful when 
you have a short implementation that will not be used anywhere else. 
*/
interface SaleTodayOnly {

    int dollarsOff();
}

class ImplSaleTodayOnly implements SaleTodayOnly
{

@Override
public int dollarsOff() {
	return 3; 
}
   
}
public class AnonInner4_without {

    public int pay(int no, SaleTodayOnly s) {
    	
        return admission(5, s);
      
    }

    public int admission(int basePrice, SaleTodayOnly sale) {
        return basePrice - sale.dollarsOff();
    }
    
 public static void main(String[] args) {
		
    	AnonInner4_without a= new AnonInner4_without();
    	
    	ImplSaleTodayOnly impl= new ImplSaleTodayOnly();
    	
    	int result =a.pay(5,impl);
    	System.out.println(result);
	}
}
