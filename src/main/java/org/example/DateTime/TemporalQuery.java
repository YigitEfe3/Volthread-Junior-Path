package org.example.DateTime;

import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalQueries;
import java.time.temporal.TemporalUnit;

public class TemporalQuery {
    public static void main(String[] args) {
        //predefinedQueries();
        customQueries(LocalDate.now());
    }

    private static Boolean customQueries(TemporalAccessor date) {
        int month = date.get(ChronoField.MONTH_OF_YEAR);
        int day   = date.get(ChronoField.DAY_OF_MONTH);

        // Disneyland over Spring Break
        if ((month == Month.APRIL.getValue()) && ((day >= 3) && (day <= 8)))
            //return Boolean.TRUE;
            System.out.println("true");


        // Smith family reunion on Lake Saugatuck
        if ((month == Month.OCTOBER.getValue()) && ((day >= 8) && (day <= 14)))
            //return Boolean.TRUE;
            System.out.println("true");

        return Boolean.FALSE;
    }

    public static void predefinedQueries(){
        java.time.temporal.TemporalQuery<TemporalUnit> query = TemporalQueries.precision();
        System.out.printf("LocalDate precision is %s%n",
                LocalDate.now().query(query));
        System.out.printf("LocalDateTime precision is %s%n",
                LocalDateTime.now().query(query));
        System.out.printf("Year precision is %s%n",
                Year.now().query(query));
        System.out.printf("YearMonth precision is %s%n",
                YearMonth.now().query(query));
        System.out.printf("Instant precision is %s%n",
                Instant.now().query(query));
    }
}
