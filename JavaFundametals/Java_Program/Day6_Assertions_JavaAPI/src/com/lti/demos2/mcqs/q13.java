package com.lti.demos2.mcqs;

public class q13 {
	public static void main(String[] args) {
/*
13. Note that March 13, 2016, is the weekend that clocks spring ahead for daylight savings 
time. What is the output of the following?
LocalDate date = LocalDate.of(2016, Month.MARCH, 13);
LocalTime time = LocalTime.of(1, 30);
ZoneId zone = ZoneId.of("US/Eastern");
ZonedDateTime dateTime1 = ZonedDateTime.of(date, time, zone);
ZonedDateTime dateTime2 = dateTime1.plus(1, ChronoUnit.HOURS);
long hours = ChronoUnit.HOURS.between(dateTime1, dateTime2);
int clock1 = dateTime1.getHour();
int clock2 = dateTime2.getHour();
System.out.println(hours + "," + clock1 + "," + clock2);
A. 1,1,2
B. 1,1,3
C. 2,1,2
D. 2,1,3
E. The code does not compile.
F. A runtime exception is thrown.*/
	}

}
