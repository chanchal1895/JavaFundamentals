package com.lti.user;


 public abstract  class mcq {
	
	private void fly() { System.out.println("Bird is flying"); }
	 public static void main(String[] args) {
	mcq bird = new Pelican();
	 bird.fly();
	 }
}

class Pelican extends mcq {
protected void fly() { System.out.println("Pelican is flying"); }
}
