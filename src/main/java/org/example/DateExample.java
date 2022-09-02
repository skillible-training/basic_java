package org.example;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class DateExample {
    public static void main(String[] args) {
        usefulMethod();
    }

    public static void dateMethod() {
        System.out.println("Today's date: " + LocalDate.now());
        System.out.println("Current time: " + LocalTime.now());
        System.out.println("Today's date and time: " + LocalDateTime.now());

        // Different Time Zone
        ZoneId ukZone = ZoneId.of("Europe/London");
        System.out.println("UK Today's date and time: " + LocalDateTime.now(ukZone));

        // Get different info of date and time
        LocalDateTime curTime = LocalDateTime.now();
        System.out.println("Year: " + curTime.getYear() + " month: " + curTime.getMonth() + " day of year: " + curTime.getDayOfYear());

        // some date
        LocalDate iDate = LocalDate.of(1947, 8, 15);
        System.out.println("Day of the republic day on " + iDate.getYear() + " is " + iDate.getDayOfWeek());

        //Format
        DateTimeFormatter format =  DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        System.out.println("formatted date is " + iDate.format(format));

        //List out all zones
        System.out.println(ZoneId.getAvailableZoneIds());
        ZoneId usZone = ZoneId.of("America/Dominica");
        LocalDateTime usTime = LocalDateTime.now(usZone);
        System.out.println("Us time is " + usTime);
    }

    public static void periodMethod() {
        // Independence Day
        LocalDate iDate = LocalDate.of(1947, 8, 15);
        // Republic Day
        LocalDate rDate = LocalDate.of(1950, 1, 26);

        Period period = Period.between(iDate, rDate);
        System.out.println("Overall: " + period);
        System.out.println("Years: " + period.getYears());
        System.out.println("Months: " + period.getMonths());
        System.out.println("Days: " + period.getDays());

        long dayDiff = ChronoUnit.DAYS.between(iDate, rDate);
        System.out.println("day difference: " + dayDiff);
    }

    public static void usefulMethod(){
        LocalDate today = LocalDate.now();
        System.out.println("Today's date: " + today);
        // Next week Day
        LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
        System.out.println("Next Week by simple plus method: " + nextWeek);
        nextWeek = today.plusWeeks(1);
        System.out.println("Next Week by plusWeeks method: " + nextWeek);
        nextWeek = today.plusDays(7);
        System.out.println("Next Week by plusDays: " + nextWeek);

        // Get the n
        LocalDate nextYear1stJan = today.with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println("First Jan of next year: " + nextYear1stJan);

        LocalDate weekend = today.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
        System.out.println("Next weekend starts on: " + weekend);


    }
}
