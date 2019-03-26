package chap03.additions.map;

import java.util.HashMap;
import java.util.Map;

public class Sample1 {

    public static void main(String[] args) {
        Map<String, String> favorites = new HashMap<>();
        favorites.put("Jenny", "Bus Tour");
        favorites.put("Jenny", "Tram"); // overwrite
        System.out.println(favorites);

        favorites.remove("Jenny");
        System.out.println(favorites);

        favorites.put("Jenny", "Bus Tour");
        favorites.put("Tom", null);
        favorites.putIfAbsent("Jenny", "Tram"); // not overwrite
        favorites.putIfAbsent("Sam", "Tram");
        favorites.putIfAbsent("Tom", "Tram");
        System.out.println(favorites);

    }
}
