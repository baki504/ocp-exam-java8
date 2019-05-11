package other.review;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Samples {

    public static void main(String[] args) {

        // 1
        // Stream.iterate
        Stream<String> stream = Stream.iterate("", (s) -> s + "1");
        stream.limit(20)
                .map(x -> x + "2")
                .forEach(System.out::println);

        // 3
        // IllegalStateException
        // stream.forEach(System.out::println);

        Stream.generate(() -> 1)
                .skip(10)
                .limit(5)
                .forEach(System.out::print);
        System.out.println();

        // practice
        System.out.println("-- practice1 --");
        Stream<Integer> s2 = Stream.iterate(11, x -> x + 10);
        s2.limit(20)
                .map(x -> x)
                .forEach(s -> {
                    System.out.print(s + " ");
                });
        System.out.println();

        System.out.println("-- practice2 --");
        Stream<Integer> s3 = Stream.iterate(10, x -> x++);
        s3.limit(20)
        .map(x -> x)
        .forEach(s -> {
            System.out.print(s + " ");
        });
        System.out.println();



        // 6
        Stream<String> stream6 = Stream.generate(() -> "meow");
        // stream6.forEach(System.out::println); infinite
        boolean match = stream6.allMatch(String::isEmpty);
        System.out.println("[" + match + "]");

        System.out.println(Stream.empty().allMatch(s -> false)); // true

        // 8
        Optional<String> str = Stream.of("aaa", "bbb", "ccc")
                .filter(s -> s.contains("b"))
                .findAny(); // returns Optional
        int sum = IntStream.of(1, 2, 3)
                .sum(); // returns int

        // 9
        // isPresent -> return boolean. method name starts with "is"
        if (str.isPresent()) {
            System.out.println("find!");
        }
        // ifPresent -> void(method attribute is Consumer)
        str.ifPresent(System.out::println);

        // 11
        String s = Stream.iterate(1, x -> ++x)
                .limit(5)
                .map(x -> "" + x)
                .collect(Collectors.joining(""));
        System.out.println(s);

        // 14
        IntStream intStream = Stream.of(1).mapToInt(x -> x + 3);
        // Stream<Integer> si = intStream.mapToDouble(i -> i); compilation error




    }

}
