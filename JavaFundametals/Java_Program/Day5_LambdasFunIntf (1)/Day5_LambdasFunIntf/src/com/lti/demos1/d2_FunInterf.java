package com.lti.demos1;

interface MyInterface
{
	public String formatStr(String inputStr);
	
}



public class d2_FunInterf {
	
	public static void main(String[] args) {
		
		MyInterface mi= (s)-> s.replaceAll(".", "$0 ");
		
		String finalStr=mi.formatStr("Lti");
		
		System.out.println(finalStr);
		
		
		
		
		
	}

}
