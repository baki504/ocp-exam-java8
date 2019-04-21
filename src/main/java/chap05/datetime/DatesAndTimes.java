package chap05.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DatesAndTimes {

    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());

        LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
        LocalDate date2 = LocalDate.of(2015, 1, 20);
        System.out.println(date1);
        System.out.println(date2);

        Month month = Month.JANUARY;
        System.out.println(month);
        //boolean b1 = month == 1;// DOES NOT COMPILE
        boolean b2 = month == Month.APRIL;// false
        System.out.println(b2);

        LocalTime time1 = LocalTime.of(6, 15); // hour and minute
        System.out.println(time1);
        LocalTime time2 = LocalTime.of(6, 15, 30);// + seconds
        System.out.println(time2);
        LocalTime time3 = LocalTime.of(6, 15, 30, 200); // + nanoseconds
        System.out.println(time3);

        LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
        System.out.println(dateTime1);
        LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);
        System.out.println(dateTime2);

        ZoneId zone = ZoneId.of("US/Eastern");
        System.out.println(zone);
        ZonedDateTime zoned1 = ZonedDateTime.of(2015, 1, 20, 6, 15, 30, 200, zone);
        System.out.println(zoned1);
        ZonedDateTime zoned2 = ZonedDateTime.of(date1, time1, zone);
        System.out.println(zoned2);
        ZonedDateTime zoned3 = ZonedDateTime.of(dateTime1, zone);
        System.out.println(zoned3);

        // LocalDate d = new LocalDate(); // DOES NOT COMPILE

        // LocalDate.of(2015, Month.JANUARY, 32); // throws DateTimeException
        // Exception in thread "main" java.time.DateTimeException: Invalid value for DayOfMonth (valid values 1 - 28/31): 32

        // It is not an exam objectives
        System.out.println("-- DateTimeFormatt --");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:MM:ss.SSS <VV>");
        System.out.println(zoned3.format(dtf));

    }

}
