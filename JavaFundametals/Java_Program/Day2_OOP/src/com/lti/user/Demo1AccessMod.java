package  com.lti.user;

/*private: Only accessible within the same class
default (package private) access: private and other classes in the same package
 protected: default access and child classes
public: protected and classes in the other packages*/

class FatherDuck {
	private String noise = "quack";

	private void quack() {
		System.out.println(noise); // private access is ok
	}

	private void makeNoise() {
		quack(); // private access is ok
	}
}

class BadDuckling {
	public void makeNoise() {
		FatherDuck duck = new FatherDuck();
		// duck.quack(); // DOES NOT COMPILE
		// System.out.println(duck.noise); // DOES NOT COMPILE
	}
}
// lets other classes in the  same package access members (due to being package private) 
 class MotherDuck {
	String noise = "quack";

	void quack() {
		System.out.println(noise); // default access is ok
	}

	private void makeNoise() {
		quack(); // default access is ok
	}
}

public class Demo1AccessMod {

	public static void main(String[] args) {

	}

}
