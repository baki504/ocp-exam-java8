package chap04.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamSample {

    public static void main(String[] args) {
        Stream<String> empty = Stream.empty();
        System.out.println(empty.count());

        Stream<Integer> singleElement = Stream.of(1);
        System.out.println(singleElement.count());

        List<String> list = Arrays.asList("a", "b", "c");
        list.stream();

        Stream<String> fromListParallel = list.parallelStream();

        // infinite stream
        // Stream<Double> randoms = Stream.generate(Math::random);
        // randoms.forEach(System.out::println);

        // infinite stream
        Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);
        // Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);
        // oddNumbers.forEach(System.out::println);

        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        System.out.println(s.count());

    }
}
