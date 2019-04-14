package chap04.stream.advanced.collect;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingPartitioningMapping {

    public static void main(String[] args) {

        Stream<String> ohMy1 = Stream.of("lions", "tigers", "bears");
        Map<Integer, List<String>> map1 = ohMy1.collect(
                Collectors.groupingBy(String::length));
        System.out.println(map1); // {5=[lions, bears], 6=[tigers]}
        System.out.println(map1.getClass());

        Stream<String> ohMy2 = Stream.of("lions", "tigers", "bears");
        Map<Integer, Set<String>> map2 = ohMy2.collect(
                Collectors.groupingBy(String::length, Collectors.toSet()));
        System.out.println(map2);
        System.out.println(map2.getClass());

        Stream<String> ohMy3 = Stream.of("lions", "tigers", "bears");
        Map<Integer, Set<String>> map3 = ohMy3.collect(
                Collectors.groupingBy(String::length, TreeMap::new, Collectors.toSet()));
        System.out.println(map3);
        System.out.println(map3.getClass());

        Stream<String> ohMy4 = Stream.of("lions", "tigers", "bears");
        TreeMap<Integer, List<String>> map4 = ohMy4.collect(
                Collectors.groupingBy(String::length, TreeMap::new, Collectors.toList()));
        System.out.println(map4);
        System.out.println(map4.getClass());

        Stream<String> ohMy5 = Stream.of("lions", "tigers", "bears");
        TreeMap<Integer, List<String>> map5 = ohMy5.collect(
                Collectors.groupingBy(String::length, TreeMap::new, Collectors.toList()));
        System.out.println(map5);

        Stream<String> ohMy6 = Stream.of("lions", "tigers", "bears");
        Map<Boolean, List<String>> map6 = ohMy6.collect(
                Collectors.partitioningBy(s -> s.length() <= 5));
        System.out.println(map6); // {false=[tigers], true=[lions, bears]}

        Stream<String> ohMy7 = Stream.of("lions", "tigers", "bears");
        Map<Boolean, List<String>> map7 = ohMy7.collect(
                Collectors.partitioningBy(s -> s.length() <= 7));
        System.out.println(map7); // {false=[], true=[lions, tigers, bears]}

        Stream<String> ohMy8 = Stream.of("lions", "tigers", "bears");
        Map<Integer, Long> map8 = ohMy8.collect(Collectors.groupingBy(
                String::length, Collectors.counting()));
        System.out.println(map8); // {5=2, 6=1}

        Stream<String> ohMy9 = Stream.of("lions", "tigers", "bears");
        Map<Integer, Optional<Character>> map9 = ohMy9.collect(
                Collectors.groupingBy(
                        String::length,
                        Collectors.mapping(s -> s.charAt(0),
                                Collectors.minBy(Comparator.naturalOrder()))));
        System.out.println(map9); // {5=Optional[b], 6=Optional[t]}

        // doesn't compile ??
        //        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        //        Map<Integer, Optional<Character>> map = ohMy.collect(
        //                groupingBy(
        //                        String::length,
        //                        mapping(s -> s.charAt(0),
        //                                minBy(Comparator.naturalOrder()))));
        //        System.out.println(map); // {5=Optional[b], 6=Optional[t]}

    }
}
