package com.lti.demos2.datetime808;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.UnsupportedTemporalTypeException;

//Period is a day or more of time.
//Duration, which is intended for smaller units of time.
public class DurationExample {

    public static void main(String[] args) {
    	 Period annually = Period.ofDays(1); // every 1 year
		 System.out.println(annually);
    	
        Duration daily = Duration.ofDays(1);                // PT24H
        Duration hourly = Duration.ofHours(1);              // PT1H
        Duration everyMinute = Duration.ofMinutes(1);       // PT1M
        Duration everyTenSeconds = Duration.ofSeconds(10);  // PT10S
        Duration everyMilli = Duration.ofMillis(1);         // PT0.001S
        Duration everyNano = Duration.ofNanos(1);           // PT0.000000001S

        System.out.println(daily);
        System.out.println(hourly);
        System.out.println(everyMinute);
        System.out.println(everyTenSeconds);
        System.out.println(everyMilli);
        System.out.println(everyNano);

       
        // Using a Duration works the same way as using a Period, for example:
        LocalDate date = LocalDate.of(2015, 1, 20);
        LocalTime time = LocalTime.of(6, 15);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        Duration duration = Duration.ofHours(6);

        System.out.println(dateTime.plus(duration));    // 2015-01-20T12:15
        System.out.println(time.plus(duration));        // 12:15
      
        /*try {
            System.out.println(date.plus(duration));    // UnsupportedTemporalTypeException
        } catch (UnsupportedTemporalTypeException e) {
            e.printStackTrace();
        }*/

        // Remember that Period and Duration are not equivalent.
        //This example shows a Period and Duration of the same length
        LocalDate dateEq = LocalDate.of(2015, 5, 25);
        Period period = Period.ofDays(1);
        Duration days = Duration.ofDays(1);

        System.out.println(dateEq.plus(period));    // 2015-05-26
        /*try {
            System.out.println(dateEq.plus(days));  // UnsupportedTemporalTypeException: Unsupported unit: Seconds
        } catch (UnsupportedTemporalTypeException e) {
            e.printStackTrace();
        }*/
    }

}
