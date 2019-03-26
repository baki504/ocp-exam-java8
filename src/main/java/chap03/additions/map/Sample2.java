package chap03.additions.map;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Sample2 {

    public static void main(String[] args) {
        BiFunction<String, String, String> mapper = (v1, v2) -> v1.length() > v2.length() ? v1 : v2;

        Map<String, String> favorites = new HashMap<>();
        favorites.put("Jenny", "Bus Tour");
        favorites.put("Tom", "Tram");

        String jenny = favorites.merge("Jenny", "Skyride", mapper);
        String tom = favorites.merge("Tom", "Skyride", mapper);

        System.out.println(favorites);
        System.out.println(jenny);
        System.out.println(tom);

        BiFunction<String, String, String> mapper2 = (v1, v2) -> v1.length() > v2.length() ? v1 : v2;
        Map<String, String> favorites2 = new HashMap<>();
        favorites2.put("Sam", null);
        favorites2.merge("Tom", "Skyride", mapper2);
        favorites2.merge("Sam", "Skyride", mapper2);
        System.out.println(favorites2); // {Tom = Skyride, Sam = Skyride}

        BiFunction<String, String, String> mapper3 = (v1, v2) -> null;
        Map<String, String> favorites3 = new HashMap<>();
        favorites3.put("Jenny", "Bus Tour");
        favorites3.put("Tom", "Bus Tour");
        favorites3.merge("Jenny", "Skyride", mapper3);
        favorites3.merge("Sam", "Skyride", mapper3);
        System.out.println(favorites3); // {Tom = Bus Tour, Sam = Skyride}

    }
}
