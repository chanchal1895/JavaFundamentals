package com.lti.demos2.datetime808;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneOffset;

public class ManipulateDateTime {

    public static void main(String[] args) {
        //Future
        LocalDate date = LocalDate.of(2019, Month.JANUARY, 20);
        System.out.println(date); 
        date = date.plusDays(2);
        System.out.println(date); 
        date = date.plusWeeks(1);
        System.out.println(date); 
        date = date.plusMonths(1);
        System.out.println(date); 
        date = date.plusYears(5);
        System.out.println(date); 

      
        date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(5, 15);
        
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        
        System.out.println(dateTime); // 2020-01-20T05:15
        System.out.println(" go backward in time ");
        //nice easy methods to go backward in time.
        dateTime = dateTime.minusDays(1);
        System.out.println(dateTime);
        dateTime = dateTime.minusHours(10);
        System.out.println(dateTime); 
        dateTime = dateTime.minusSeconds(30);
        System.out.println(dateTime);
        //or
        System.out.println("");
        date = LocalDate.of(2020, Month.JANUARY, 20);
        time = LocalTime.of(5, 15);
        dateTime = LocalDateTime.of(date, time)
                .minusDays(1)
                .minusHours(10)
                .minusSeconds(30);
        System.out.println("Exam tricks ");
        //exam tricks 
        date = LocalDate.of(2020, Month.JANUARY, 20);
        date.plusDays(10);
        System.out.println(date);

        date = LocalDate.of(2020, Month.JANUARY, 20);
        //date = date.plusMinutes(1);

       System.out.println(LocalDateTime.now().toEpochSecond(ZoneOffset.UTC));
    }
}
