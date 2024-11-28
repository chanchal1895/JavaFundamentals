package com.lti.demos2.datetime808;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormatDateTime {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        System.out.println(date.getDayOfWeek()); 
        System.out.println(date.getMonth()); 
        System.out.println(date.getYear()); 
        System.out.println(date.getDayOfYear()); 

        //DateTimeFormatter can be used to format any type of 
        //date and/or time object. What changes is the format. DateTimeFormatter is in the package 
        //java.time.format
        date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
     
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
       
        DateTimeFormatter shortDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(shortDate.format(dateTime)); 
        System.out.println(shortDate.format(date)); 
        //System.out.println(shortDateTime.format(time));
        // UnsupportedTemporalTypeException:Time cant be formatted as date

        //or
        shortDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(dateTime.format(shortDate));//Jan 20, 2020
        System.out.println(date.format(shortDate));//Jan 20, 2020
        //System.out.println(time.format(shortDateTime));

        //SHORT, MEDIUM
        DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        DateTimeFormatter mediumF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println(shortF.format(dateTime)); // 1/20/20 11:12 AM
        System.out.println(mediumF.format(dateTime)); // Jan 20, 2020 11:12:34 AM

        //User Define Formats
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
        System.out.println(dateTime.format(f)); // January 20, 2020, 11:12

        f = DateTimeFormatter.ofPattern("hh:mm");
        f.format(dateTime); //  11:22
        //f.format(date);
        f.format(time);     //  11:22

        //Parsing String into Date and Times
        f = DateTimeFormatter.ofPattern("MM dd yyyy");
        date = LocalDate.parse("01 02 2015", f);
        time = LocalTime.parse("11:22");
        System.out.println(date); // 2015-01-02
        System.out.println(time); // 11:22
    }
}
