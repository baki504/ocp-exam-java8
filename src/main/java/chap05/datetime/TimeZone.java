package chap05.datetime;

import java.time.ZoneId;

public class TimeZone {

    public static void main(String[] args) {
        System.out.println("-- Finding a Time Zone! --");
        ZoneId.getAvailableZoneIds().stream()
                .filter(z -> z.contains("US") || z.contains("America"))
                .sorted()
                .forEach(System.out::println);
    }

}
