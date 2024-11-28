package com.lti.demos5.designpattern;

////https://howtodoinjava.com/design-patterns/creational/builder-pattern-in-java/
//User object does not have any setter method, 
//so its state can not be changed once it has been built.
//This provides the desired immutability.

public class Demo3_BuilderPattern {
	
	public static void main(String[] args) {
		
		 User user1 = new User.UserBuilder("Lokesh", "Gupta")
				    .age(30)
				    .phone("1234567")
				    .address("Fake address 1234")
				    .build();
				 
				    System.out.println(user1);
				    
				    //user1.age(50);
				    
				 
				    User user2 = new User.UserBuilder("Jack", "Reacher")
				    .age(40)
				    .phone("5655")
				    //no address
				    .build();
				 
				    System.out.println(user2);
				 
				    User user3 = new User.UserBuilder("Super", "Man")
				    //No age
				    //No phone
				    //no address
				    .build();
				 
				    System.out.println(user3);
		
	}

}

/*
 *  we can build immutable objects without much complex logic in the object building process.
 * 
 * Undoubtedly, the number of lines of code increase at least to double in the builder pattern,
 *  but the effort pays off in terms of design flexibility and much more readable code.

The parameters to the constructor are reduced and are provided in highly readable chained method calls. 
This way there is no need to pass in null for optional parameters to the constructor whicle creating the instance of a class.

Another advantage is that an instance is always instantiated in a complete state rather than sitting in an incomplete state until the developer calls (if ever calls) the appropriate “setter” method to set additional fields.

And finally, we can build immutable objects without much complex logic in the object building process.
*/
