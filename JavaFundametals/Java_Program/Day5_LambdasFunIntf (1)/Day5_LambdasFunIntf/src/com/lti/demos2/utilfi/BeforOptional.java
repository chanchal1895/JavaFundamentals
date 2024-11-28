package com.lti.demos2.utilfi;

public class BeforOptional {

	public static void main(String[] args) {
		/*
		 * Life After Optional 
		 *
		String result = Optional.ofNullable(user)
				  .flatMap(User::getAddress)
				  .flatMap(Address::getCountry)
				  .map(Country::getIsocode)
				  .orElse("default");
				  
				  *
				  */
		
	}
}


//Life before Optional 

/*
 * private void getIsoCode( User user){ if (user != null) { Address address =
 * user.getAddress(); if (address != null) { Country country =
 * address.getCountry(); if (country != null) { String isocode =
 * country.getIsocode(); if (isocode != null) { isocode = isocode.toUpperCase();
 * } } } } }
 */

//The optional class provides around 10 methods, 
//which we can use for creating and using the Optional class 

//https://dzone.com/articles/java-8-optional-usage-and-best-practices

//Creating an optional using of
//String name = "java";
//Optional<String> opt = Optional.of(name);



// Possible null value
/*
Optional<String> optional = Optional.ofNullable(getName());

private String getName(){
    String name = "Java";
    return (name.length() > 5) ? name :  null;
}*/
