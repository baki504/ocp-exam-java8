package other.shoeisha;

import java.time.LocalDate;
import java.time.Month;

// 7-3
public class ChrystmasDay {

    public static void main(String[] args) {
        LocalDate christmasDay = LocalDate.of(2016, Month.DECEMBER, 25);
        LocalDate nextDecade = christmasDay.plusYears(10);
        nextDecade.plusDays(15); // not update  nextDecade
        System.out.println(nextDecade);
    }

}
