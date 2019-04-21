package chap05.localization;

import java.util.Locale;

public class LocaleSample {

    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        System.out.println(locale);

        System.out.println(Locale.GERMAN);// de
        System.out.println(Locale.GERMANY);// de_DE

        System.out.println(new Locale("fr"));// fr
        System.out.println(new Locale("hi", "IN"));// hi_IN
        System.out.println(new Locale("aa", "US"));// aa_US

        Locale l1 = new Locale.Builder()
                .setLanguage("en")
                .setRegion("US")
                .build();

        Locale l2 = new Locale.Builder()
                .setRegion("US")
                .setLanguage("en")
                .build();

        System.out.println(l1);
        System.out.println(l2);

        Locale l2_2 = new Locale.Builder()// bad but legal
                .setRegion("us")
                .setLanguage("EN")
                .build();
        System.out.println(l2_2);

        System.out.println("---");

        System.out.println(Locale.getDefault()); // en_US
        Locale locale2 = new Locale("fr");
        Locale.setDefault(locale2); // change the default
        System.out.println(Locale.getDefault()); // fr

        Locale us = new Locale("en", "US");
        Locale france = new Locale("fr", "FR");
        Locale englishCanada = new Locale("en", "CA");
        Locale frenchCanada = new Locale("fr", "CA");

        System.out.println(us);
        System.out.println(france);
        System.out.println(englishCanada);
        System.out.println(frenchCanada);

    }
}
