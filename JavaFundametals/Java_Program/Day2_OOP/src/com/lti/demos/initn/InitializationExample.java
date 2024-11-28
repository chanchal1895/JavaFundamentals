package  com.lti.demos.initn;

public class InitializationExample {

	//constructor 
    public InitializationExample() {
        super();
        System.out.println("constrctor " +test1 + test2); // Will print Test X, since the static members are initialized before the instance is.
    }    
    //init block 
    {       
    	test2 = "X";
    	System.out.println("simple init block 2  field "+ test2);
    }

    private static String test1 = "Test ";

    private static String test2 = "this one too";

    //static block 
    static { 
    	System.out.println("static block 1  " +test1);
    	System.out.println("static block 1  " +test2);
        test2 = "Y";
        System.out.println("static block 1 " +test2);
    }

    public static void main(String[] args) {

        new InitializationExample();
    }
}
