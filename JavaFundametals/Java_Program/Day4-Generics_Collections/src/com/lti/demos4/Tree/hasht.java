package com.lti.demos4.Tree;

import java.util.*;

class hasht {
	public static void main(String args[]) {
		Hashtable<String, Double> balance = new Hashtable<>();

		String str;
		double bal;

		balance.put("John Doe", new Double(3434.34));
		balance.put("Tom Smith", new Double(123.22));
		balance.put("jane Baker ", new Double(1378.00));
		balance.put("Tod Hall", new Double(99.22));
		balance.put("Ralph Smith", new Double(-19.08));
		balance.put("Ralph Smith", new Double(23.89));// replace old one
		Enumeration names;
		names = balance.keys();

		while (names.hasMoreElements()) 
		{
			str = (String) names.nextElement();
			System.out.println(str + " : " + balance.get(str));
		}

		bal = ((Double) balance.get("John Doe")).doubleValue();
		balance.put(" John Doe", new Double(bal + 1000));
		System.out.println(" John Doe's new balance : " + balance.get(" John Doe"));
	}
}




