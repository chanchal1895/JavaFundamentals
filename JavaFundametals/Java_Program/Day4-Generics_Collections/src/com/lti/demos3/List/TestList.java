package com.lti.demos3.List;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {

		List<String> arrList1 = new ArrayList<>();
		
		arrList1.add("20");
		arrList1.add("30");
		arrList1.add("40");
		
		
		for (Object ele : arrList1) {
			System.out.println(ele);
		}

		
		
		/*
		 * list.add("Jay"); list.add("Jay"); int id=10; list.add(id); list.add(100.50);
		 * // Double d= new Double(100.50) ; list.add(new Integer(100)); list.add(true);
		 * list.add(Boolean.TRUE); System.out.println(list);
		 */

	}
}
