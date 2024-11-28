package com.lti.demos2.utilfi;
//https://medium.com/swlh/exception-handling-in-java-streams-5947e48f671c
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


//This is because lambdas are after all anonymous class implementations.
//We need to handle the exception within the implementation of the interface the lambda is implementing.
@FunctionalInterface
interface HandlingConsumer<Target, ExObj extends Exception> {
    void accept(Target target) throws ExObj;
    static <Target> Consumer<Target> handlingConsumerBuilder(
            HandlingConsumer<Target, Exception> handlingConsumer) {
        return obj -> {
            try {
                handlingConsumer.accept(obj);
            } catch (Exception ex) {
                throw new RuntimeException(" error ");
            }
        };
    }
}


public class HandleExceptionChecked {
	/*
	 * public static void sleeper() { List<Integer> list = Arrays.asList(5, 4, 3, 2,
	 * 1); list.forEach(i -> Thread.sleep(i)); }
	 */
	
	/*
	 * public static void sleeper() throws InterruptedException { List<Integer> list
	 * = Arrays.asList(5, 4, 3, 2, 1); list.forEach(i -> Thread.sleep(i)); }
	 */
	public static void main(String[] args) {
		
		//way1 :
		List<Integer> list = Arrays.asList(5, 4, 3, 2, 1);
	    list.forEach(i -> {
	        try {
	            Thread.sleep(i);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    });
	    

	   
	
		
	}

}
