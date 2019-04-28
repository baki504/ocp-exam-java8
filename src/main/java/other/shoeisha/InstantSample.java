package other.shoeisha;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

// 7-10
public class InstantSample {

    public static void main(String[] args) {
        LocalTime time = LocalTime.of(0, 00);
        LocalDate date = LocalDate.of(2017, 2, 1);
        LocalDateTime dt = LocalDateTime.of(date, time);

        // C
        ZonedDateTime zdt = dt.atZone(ZoneId.of("Asia/Tokyo"));
        Instant instant = zdt.toInstant();
        System.out.println(instant);

        // another API
        OffsetDateTime odt = dt.atOffset(ZoneOffset.of("+03:00"));
        System.out.println(odt);
        System.out.println(odt.toOffsetTime());
    }

}
