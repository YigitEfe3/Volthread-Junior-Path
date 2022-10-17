package org.example.CoveringTheBasics.DateTime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

//These calculations do not account for time zone differences.

public class PeriodExample {
    public static void main(String[] args) {
        howOld();
        whenIsMyNextBirthday();
    }

    private static void whenIsMyNextBirthday() {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1999, Month.MARCH, 3);

        LocalDate nextBDay = birthday.withYear(today.getYear());

        //If your birthday has occurred this year already, add 1 to the year.
        if (nextBDay.isBefore(today) || nextBDay.isEqual(today)) {
            nextBDay = nextBDay.plusYears(1);
        }

        Period p = Period.between(today, nextBDay);
        long p2 = ChronoUnit.DAYS.between(today, nextBDay);
        System.out.println("There are " + p.getMonths() + " months, and " +
                p.getDays() + " days until your next birthday. (" +
                p2 + " total)");
    }

    private static void howOld() {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1999, Month.MARCH, 3);

        Period p = Period.between(birthday, today);
        long p2 = ChronoUnit.DAYS.between(birthday, today);
        System.out.println("You are " + p.getYears() + " years, " + p.getMonths() +
                " months, and " + p.getDays() +
                " days old. (" + p2 + " days total)");
    }
}
