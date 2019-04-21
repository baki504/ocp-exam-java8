package chap05.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class ManipulatingDateAndTimes {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
        System.out.println(date); // 2014–01–20
        date = date.plusDays(2);
        System.out.println(date); // 2014–01–22
        date = date.plusWeeks(1);
        System.out.println(date); // 2014–01–29
        date = date.plusMonths(1);
        System.out.println(date); // 2014–02–28
        date = date.plusYears(5);
        System.out.println(date); // 2019–02–28

        LocalDate date_md = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(5, 15);
        LocalDateTime dateTime = LocalDateTime.of(date_md, time);
        System.out.println(dateTime);// 2020–01–20T05:15
        dateTime = dateTime.minusDays(1);
        System.out.println(dateTime);// 2020–01–19T05:15
        dateTime = dateTime.minusHours(10);
        System.out.println(dateTime);// 2020–01–18T19:15
        dateTime = dateTime.minusSeconds(30);
        System.out.println(dateTime);// 2020–01–18T19:14:30

        LocalDate date1_20 = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time5_15 = LocalTime.of(5, 15);
        System.out.println(
                LocalDateTime.of(date1_20, time5_15)
                        .minusDays(1)
                        .minusHours(10)
                        .minusSeconds(30));

        System.out.println(LocalDate.of(2020, Month.JANUARY, 20).plusDays(10));

        LocalDate date1_20_ = LocalDate.of(2020, Month.JANUARY, 20);
        // date1_20_ = date1_20_.plusMinutes(1); // DOES NOT COMPILE

    }
}
