package other.shoeisha.concurrency;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParallelGroupingSample {

    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("belle", "akko", "ami", "bob", "nao").parallel();
        Map<String, List<String>> map1 = stream1.collect(
                Collectors.groupingByConcurrent(s -> s.substring(0, 1)));
        System.out.println(map1);
        System.out.println("map1's class name: " + map1.getClass());

        Stream<String> stream2 = Stream.of("nao", "akko", "ami").parallel();
        Map<Integer, String> map2 = stream2.collect(
                Collectors.toConcurrentMap(String::length, s -> s, (s1, s2) -> s1 + ": " + s2));
        System.out.println(map2);
        System.out.println("map2's class name: " + map2.getClass());

    }

}
