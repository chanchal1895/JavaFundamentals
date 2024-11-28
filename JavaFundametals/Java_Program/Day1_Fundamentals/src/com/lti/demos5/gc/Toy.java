package com.lti.demos5.gc;

class Toy {
	void play() {
		System.out.print("play- \n ");
	}
	//The finalize() method is called the finalizer.
	//finalize() is never run more than once on any object
	//	void finalize()
	public void finalize() {
		System.out.print("clean -- finalize()-");
	}

	void finalizer() {
		System.out.print("finalizer()--");
	}

	public static void main(String[] fun) {
		Toy car = new Toy();
		car.play();
		
		System.gc();
		
		
		car.finalize();
		
		Toy doll = new Toy();
		
		doll.play();
		
		
		
	}
}
//finalizers come with many drawbacks. //https://www.baeldung.com/java-finalize
//inalize has been deprecated starting with Java 9 – and will eventually be removed.
