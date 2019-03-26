package chap03.additions.compute;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Sample2 {

    public static void main(String[] args) {
        Map<String, Integer> counts = new HashMap<>();
        counts.put("Jenny", 15);
        counts.put("Tom", null);
        Function<String, Integer> mapper = (k) -> 1;
        Integer jenny = counts.computeIfAbsent("Jenny", mapper); // 15
        Integer sam = counts.computeIfAbsent("Sam", mapper); // 1
        Integer tom = counts.computeIfAbsent("Tom", mapper); // 1
        System.out.println(jenny);
        System.out.println(sam);
        System.out.println(tom);
        System.out.println(counts); // {Tom = 1, Jenny = 15, Sam = 1}

        Map<String, Integer> counts2 = new HashMap<>();
        counts2.put("Jenny", 1);
        Integer jenny2 = counts2.computeIfPresent("Jenny", (k, v) -> null); // null
        Integer sam2 = counts2.computeIfAbsent("Sam", k -> null); // null
        System.out.println(jenny2);
        System.out.println(sam2);
        System.out.println(counts2); // {}
    }
}
