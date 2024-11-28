package com.lti.demos.interfaces;
class Snoopy
{
	
}

interface Comic<C> {
	void draw(C c);
}

class ComicClass<C> implements Comic<C> {
	public void draw(C c) {
		System.out.println(c);
	}
}

class SnoopyClass implements Comic<Snoopy> {
	public void draw(Snoopy c) {
		System.out.println(c);
	}
}
/*
class SnoopyComic implements Comic<Snoopy> {
	public void draw(C c) {
		System.out.println(c);
	}
}*/
public class InterfaceEx {

	public static void main(String[] args) {

//Comic<Snoopy> c1 = c ‐> System.out.println(c);
Comic<Snoopy> c2 = new ComicClass<>();
Comic<Snoopy> c3 = new SnoopyClass();
//Comic<Snoopy> c4 = new SnoopyComic();

	}
}
