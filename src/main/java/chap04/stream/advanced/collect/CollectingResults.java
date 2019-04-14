package chap04.stream.advanced.collect;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectingResults {

    public static void main(String[] args) {
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        String result = ohMy.collect(Collectors.joining(", "));
        System.out.println(result); // lions, tigers, bears

        Stream<String> ohMy2 = Stream.of("lions", "tigers", "bears");
        Double result2 = ohMy2.collect(Collectors.averagingInt(String::length));
        System.out.println(result2); // 5.333333333333333

        Stream<String> ohMy3 = Stream.of("lions", "tigers", "bears");
        TreeSet<String> result3 = ohMy3.filter(s -> s.startsWith("t"))
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(result3);

        Stream<String> ohMy4 = Stream.of("lions", "tigers", "bears");
        Map<String, Integer> result4 = ohMy4.collect(Collectors.toMap(s -> s, String::length));
        System.out.println(result4);

        Stream<String> ohMy5 = Stream.of("lions", "tigers", "bears");
        // Map<Integer, String> result5 = ohMy5.collect(Collectors.toMap(String::length, s -> s)); // Duplicate key lions
        Stream<String> ohMy6 = Stream.of("lions", "tigers", "1234567");
        Map<Integer, String> result6 = ohMy6.collect(Collectors.toMap(String::length, s -> s)); // BAD
        System.out.println(result6);

        Stream<String> ohMy7 = Stream.of("lions", "tigers", "bears");
        Map<Integer, String> map = ohMy7.collect(Collectors.toMap(String::length, k -> k, (s1, s2) -> s1 + "," + s2));
        System.out.println(map); // {5=lions,bears, 6=tigers}
        System.out.println(map.getClass()); // class. java.util.HashMap

        Stream<String> ohMy8 = Stream.of("lions", "tigers", "bears");
        Map<Integer, String> map2 = ohMy8.collect(Collectors.toMap(String::length, k -> k, (s1, s2) -> s1 + "," + s2, TreeMap::new));
        System.out.println(map2); // {5=lions,bears, 6=tigers}
        System.out.println(map2.getClass()); // class. java.util.TreeMap

    }
}
