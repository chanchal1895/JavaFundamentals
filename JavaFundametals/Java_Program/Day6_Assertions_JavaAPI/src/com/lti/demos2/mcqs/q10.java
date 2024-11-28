package com.lti.demos2.mcqs;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class q10 {
	public static void main(String[] args) {
		
		// LocalDate date =LocalDate.of(2014, Month.JUNE, 21);
		// new LocalDate(2014, 6, 21);
			
	
		//LocalDate date = LocalDate.of(2021, Month.NOVEMBER, 32);
		  // System.out.println(date.getYear() + " " + date.getMonth() + " "+ date.getDayOfMonth());
		
		
		LocalTime time = LocalTime.of(1, 11);  
		System.out.println(time.getHour());
	    while (time.getHour()== 1) {     
	    	
	     time.plusHours(1);
	         System.out.println("in loop");
	      }
		
	   // LocalTime time = LocalTime.of(1,2,3,4); 
	   // System.out.println(time);

	  /*  LocalDate hatDay = LocalDate.of(2017, Month.JANUARY, 15);
	    DateFormatter f = DateFormatter.ISO_DATE;
	    System.out.println(______________________________);
*/
	   /* String b = "12";
	     b += "3";
	     b.reverse();
	     System.out.println(b.toString());*/
	    
	    String teams = new String("694"); 
	    teams.concat(" 1155"); 
	    teams.concat(" 2265"); 
	    teams.concat(" 2869"); 
	    System.out.println(teams);



/*
10. What is the output of the following code?
LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
Period p = Period.of(1, 2, 3);
d = d.minus(p);
DateTimeFormatter f = DateTimeFormatter.
 ofLocalizedTime(FormatStyle.SHORT);
System.out.println(d.format(f));
A. 3/7/14 11:22 AM
B. 5/10/15 11:22 AM
C. 3/7/14
D. 5/10/15
E. 11:22 AM
F. The code does not compile.
G. A runtime exception is thrown.*/
	}

}
