package chap05.datetime.period;

import java.time.Period;

public class WrongDefenition {

    public static void main(String[] args) {
        Period wrong1 = Period.ofYears(1).ofWeeks(1);// every week
        System.out.println(wrong1);

        Period wrong2 = Period.ofYears(1);
        wrong2 = Period.ofWeeks(1);
        System.out.println(wrong2);// every week
    }

}
