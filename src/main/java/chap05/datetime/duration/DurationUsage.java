package chap05.datetime.duration;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class DurationUsage {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2015, 1, 20);
        LocalTime time = LocalTime.of(6, 15);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        Duration duration6h = Duration.ofHours(6);
        System.out.println(dateTime.plus(duration6h)); // 2015–01–20T12:15
        System.out.println(time.plus(duration6h)); // 12:15
        // System.out.println(date.plus(duration)); // UnsupportedTemporalException

        Duration duration23h = Duration.ofHours(23);
        System.out.println(dateTime.plus(duration23h)); // 2015–01–21T05:15
        System.out.println(time.plus(duration23h)); // 05:15
        // System.out.println(date.plus(duration23h)); // UnsupportedTemporalException

        LocalDate localdate = LocalDate.of(2015, 5, 25);
        Period period = Period.ofDays(1);
        Duration days = Duration.ofDays(1);
        System.out.println(localdate.plus(period)); // 2015–05–26
        System.out.println(localdate.plus(days)); // Unsupported unit: Seconds

    }

}
