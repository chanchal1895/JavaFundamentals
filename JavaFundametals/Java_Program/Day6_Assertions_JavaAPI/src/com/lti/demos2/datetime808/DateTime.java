package com.lti.demos2.datetime808;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/*
 * LocalDate Contains just a date—no time and no time zone. eg your birthday this year. 
 * It is your birthday for a full day regardless of what time it is.


LocalTime ----Just  a time—no date and no time zone. eg - midnight. It is midnight at the same time every day.

LocalDateTime ------Contains both a date and time but no time zone. - 
*/


public class DateTime {

    public static void main(String[] args) {
        //Current Date and Time
    	//Each of the three classes has a static method called now() that gives the current date and     	time. 
        System.out.println(LocalDate.now());//only a date and no time. 
        System.out.println(LocalTime.now()); //only a time and no date.
        System.out.println(LocalDateTime.now());//both date and time.
        
      //Java uses T to separate the date and time when converting LocalDateTime to a String

        //Create Date //Month is a special type of class called an enum. 
        
        
        LocalDate date1 = LocalDate.of(2022, Month.JANUARY, 26);
        System.out.println(date1);
        LocalDate date2 = LocalDate.of(2015, 1, 20);
        System.out.println(date1);

        //Create Time
        LocalTime time1 = LocalTime.of(6, 15); // hour and minute
        System.out.println(time1);
        LocalTime time2 = LocalTime.of(6, 15, 30); // + seconds
        System.out.println(time2);
        LocalTime time3 = LocalTime.of(6, 15, 30, 200); // + nanoseconds
        System.out.println(time3);
        
        //Create Date and Time
        LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
        System.out.println(dateTime1);
        LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);
        System.out.println(dateTime2);

        // The date and  time classes have private constructors to force you to use the static methods. 
     //   LocalDate d = new LocalDate(); // DOES NOT COMPILE
        LocalDate date3 = LocalDate.of(2015, Month.JANUARY, 32); // throws DateTimeException       
   
    
    
    }
}
