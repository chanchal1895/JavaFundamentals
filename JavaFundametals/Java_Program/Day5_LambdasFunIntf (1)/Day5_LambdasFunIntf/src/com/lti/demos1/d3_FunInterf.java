package com.lti.demos1;

interface SomeInterface
{
	public boolean IsValid(String uname, String psw);
	
}

public class d3_FunInterf {
	
	public static void main(String[] args) {
		
		SomeInterface si=(s1,s2)-> (s1!=null && s2!=null) ?true : false ;
		
		boolean result=si.IsValid("jay","vijay");
		System.out.println(result);
		
	}

}


