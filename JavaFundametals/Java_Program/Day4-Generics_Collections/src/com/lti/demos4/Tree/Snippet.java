package com.lti.demos4.Tree;

import java.util.HashSet;
import java.util.Set;

public class Snippet {
	public static void main(String[] args) {
		 Set<Integer> set = new HashSet<>();
	        
	        System.out.println("Added the value? " + set.add(21)); // true
	        System.out.println("Added the duplicated value? " + set.add(21)); // false
	        System.out.println("Size: " + set.size()); // 1
	        
	        set.remove(21);
	        System.out.println("isEmpty? " + set.isEmpty()); // true	
}
	}
	

