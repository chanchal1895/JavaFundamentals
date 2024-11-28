package com.dateAndTime.Formatter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.function.Predicate;

public class DateTimeFormateEx {
	public static void main(String [] args) {
		LocalDate date = LocalDate.of(2022, 04, 21);
		System.out.println(date);
		System.out.println(date.now());;
		System.out.println(date.getDayOfMonth());;
		System.out.println(date.getDayOfYear());;
		System.out.println(date.getYear());;
		System.out.println(date.getDayOfWeek());;
		System.out.println(date.getMonth());;
		System.out.println(date.getMonthValue());;
		
		LocalDate date1 = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(11, 12, 34);
		String date2 = LocalDate.parse("2022-12-23").format(DateTimeFormatter.ISO_DATE);
		System.out.println(date2);
		LocalDateTime dateTime = LocalDateTime.of(date1, time);
		System.out.println(date1.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
		System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		
	}
	
}
