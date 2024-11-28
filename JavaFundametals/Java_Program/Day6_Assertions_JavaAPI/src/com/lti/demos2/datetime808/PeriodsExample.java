package com.lti.demos2.datetime808;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodsExample {
	
	private static void performAnimalEnrichment(LocalDate start, LocalDate end, Period period) 
	{ // uses the generic period
			 LocalDate upTo = start;
			 while (upTo.isBefore(end)) {
			 System.out.println("give new toy: " + upTo);
			 upTo = upTo.plus(period); 
			 }
	}	
	private static void performAnimalEnrichment(LocalDate start, LocalDate end) {
		 LocalDate upTo = start;
		 while (upTo.isBefore(end)) { // check if still before end
		 System.out.println("give new toy: " + upTo);
		 upTo = upTo.plusMonths(1); // add a month
		 }
		 }
	
	public static void main(String[] args) {
		
		 LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
		 LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
		 Period period = Period.ofMonths(1); 
		 
		// performAnimalEnrichment(start, end);
		 performAnimalEnrichment(start, end,period);
		 
		
		 Period annually = Period.ofYears(1); // every 1 year
		 System.out.println(annually);
		 Period quarterly = Period.ofMonths(3); // every 3 months
		 System.out.println(quarterly);
		 Period everyThreeWeeks = Period.ofWeeks(3); // every 3 weeks
		 System.out.println(everyThreeWeeks);
		 Period everyOtherDay = Period.ofDays(2); // every 2 days
		 System.out.println(everyOtherDay);
		 Period everyYearAndAWeek = Period.of(1, 0, 7); // every year and 7 day
		 System.out.println(everyYearAndAWeek);
		 
		 //everyYearAndAWeek
		 
		 //this is not a method chaining 

			//n other words: the object returned by ofYears() does not affect the result of ofWeeks() 
			//and it's year value will be discarded. You are invoking the static method ofWeeks().
			//What you are doing there is not a fluent call chain.
		 //The of methods are static factory methods. Factory methods create a new object, they are static so have no previous state
		 
		 Period wrong = Period.ofYears(1).ofWeeks(1); // every week
		 
		 System.out.println(wrong);
		// This tricky code is really like writing the following:
		 Period wrong1 = Period.ofYears(1);
		 wrong1 = Period.ofWeeks(7);
		 System.out.println(wrong1);
		 
		 
		 // Period wrong = Period.ofYears(1).ofWeeks(1); 
		 //is same as 
		Period wrong2 = Period.ofWeeks(1); 
		System.out.println(wrong2);
		 
		//chaining is like:
		

		//Period.ofYears(1).plus(Period.ofWeeks(1));
		
		 
	}

}
