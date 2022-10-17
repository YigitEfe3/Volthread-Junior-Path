package org.example.CoveringTheBasics.DateTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjusters;

/*
* 
* provides a set of predefined adjusters for finding the;
*       - the first or the last day of the month
*       - the first or the last day of the year
*       - the last Wednesday of the month
*       - the first tuesday after a specific date, to name a few examples
* 
* 
* 
* */


public class TemporalAdjuster {
    public static void main(String[] args) {
        temporalAdjuster();
    }

    public static void temporalAdjuster(){
        LocalDate date = LocalDate.of(2000, Month.OCTOBER, 15);
        DayOfWeek dotw = date.getDayOfWeek();
        System.out.printf("%s is on a %s%n", date, dotw);

        System.out.printf("first day of Month: %s%n",
                date.with(TemporalAdjusters.firstDayOfMonth()));
        System.out.printf("first Monday of Month: %s%n",
                date.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)));
        System.out.printf("last day of Month: %s%n",
                date.with(TemporalAdjusters.lastDayOfMonth()));
        System.out.printf("first day of next Month: %s%n",
                date.with(TemporalAdjusters.firstDayOfNextMonth()));
        System.out.printf("first day of next Year: %s%n",
                date.with(TemporalAdjusters.firstDayOfNextYear()));
        System.out.printf("first day of Year: %s%n",
                date.with(TemporalAdjusters.firstDayOfYear()));
    }
}
