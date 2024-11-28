package com.lti.demos4.Tree;

import java.util.Set;
import java.util.TreeSet;

class Magazine //implements Comparable<Magazine>{
{
	private String name;

	public Magazine(String name) {
		this.name = name;
	}


	public String toString() {
		return name;
	}

	/*@Override
	public int compareTo(Magazine m) {
		return name.compareTo(m.name);
	}*/
}

public class TreeEx {

	public static void main(String[] args) {

		Set<Magazine> set = new TreeSet<>();
		set.add(new Magazine("highlights"));
		set.add(new Magazine("Newsweek"));
		set.add(new Magazine("highlights"));
		System.out.println(set.iterator().next());

	}
}
