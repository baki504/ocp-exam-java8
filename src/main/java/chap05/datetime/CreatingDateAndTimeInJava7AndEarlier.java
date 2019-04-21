package chap05.datetime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CreatingDateAndTimeInJava7AndEarlier {

    public static void main(String[] args) {

        // Creating an object with the current date and time
        System.out.println(new Date());

        // Creating an object representing January 1, 2015
        Calendar c1 = Calendar.getInstance();
        c1.set(2015, Calendar.JANUARY, 1);
        Date jan_a = c1.getTime();
        System.out.println(jan_a);
        // another way
        Calendar c2 = new GregorianCalendar(2015, Calendar.JANUARY, 1);
        Date jan_b = c2.getTime();
        System.out.println(jan_b);

        // Creating January 1, 2015 without the constant
        Calendar c = Calendar.getInstance();
        c.set(2015, 0, 1);
        Date jan = c.getTime();
        System.out.println(jan);

        Calendar calendar = Calendar.getInstance();
        calendar.set(2017, Calendar.OCTOBER, 1);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:MM:ss.SSS");
        Date testDate = calendar.getTime();
        System.out.println(sdf.format(addDay(testDate)));
        System.out.println(sdf.format(subtractDay(testDate)));
        System.out.println(sdf.format(addYearMonthDate(testDate)));

    }

    // Adding a day
    public static Date addDay(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, 1);
        return cal.getTime();
    }

    // Subtracting a day
    public static Date subtractDay(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, -1);
        return cal.getTime();
    }

    // Adding a year, month, date
    public static Date addYearMonthDate(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.YEAR, 1);
        cal.add(Calendar.MONTH, 1);
        cal.add(Calendar.DATE, 1);
        return cal.getTime();
    }

}
