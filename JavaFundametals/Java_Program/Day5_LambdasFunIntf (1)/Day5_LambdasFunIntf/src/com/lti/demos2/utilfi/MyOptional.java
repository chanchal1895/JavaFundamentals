package com.lti.demos2.utilfi;

import java.util.Optional;

public class MyOptional {

	public static Optional<Double> average(int... scores) {
	
		if (scores.length == 0) {
			
			return Optional.empty();
		}
		
		int sum = 0;
		for (int score : scores) {
			sum += score;
		}
		
		return Optional.of((double) sum / scores.length);
	}

	public static void main(String[] args) {
		
		/*
		 * System.out.println(average()); // Optional.empty
		 * 
		 * System.out.println(average(90, 100)); // Optional[95.0]
		 * 
		 * 
		 * System.out.println("ifPresent");
		 * 
		 * 
		 * Optional<Double> opt = average(90, 100); if (opt.isPresent()) {
		 * System.out.println(opt.get()); // 95.0 } // or
		 * opt.ifPresent(System.out::println);
		 * 
		 * opt = average(40, 60); //50 System.out.println(opt.get());
		 */
		//opt = average(); //50
	//	System.out.println(opt.get()); // NoSuchElementException
		

		/*
		 * System.out.println("// Optional.empty() ex : => ");
		 * 
		 * String value = "Hello"; // try value=null;
		 * 
		 * Optional o = (value == null) ? Optional.empty() : Optional.of(value);
		 * 
		 * System.out.println(o);
		 */
		// or
		
		String value = ""; // try value=null;

		System.out.println(" // Optional.ofNullable() Ex : => ");
		Optional o = Optional.ofNullable(value);				
		System.out.println(o);

		Optional opt = average(); 
		System.out.println(" //orElse() Ex:  => ");		
		
		System.out.println(opt.orElse("avg not 150"));
		
		
		System.out.println(opt.orElseGet(() -> Math.random()));
       //System.out.println(opt.orElseThrow());//NoSuchElementException: No value present
//        System.out.println(opt.orElseThrow(() -> new IllegalStateException()));//IllegalStateException
//        System.out.println(opt.orElseGet(() -> new IllegalStateException())); // DOES NOT COMPILE

		//opt is an Optional<Double>.
		//This means the Supplier must return a Double. 
		//Since this supplier returns an exception, the type does not match
		
		
		
		opt = average(90, 100);
		System.out.println(opt.orElse(Double.NaN));
		System.out.println(opt.orElseGet(() -> Math.random()));
		// System.out.println(opt.orElseThrow());
	}
}
