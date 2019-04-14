package chap04.stream.intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateSample {

    public static void main(String[] args) {

        // filter
        Stream<String> s1 = Stream.of("monkey", "gorilla", "bonobo");
        s1.filter(x -> x.startsWith("m")).forEach(System.out::print);// monkey
        System.out.println();

        // distinct
        Stream<String> s2 = Stream.of("duck", "duck", "duck", "goose");
        s2.distinct().forEach(System.out::print); // duckgoose
        System.out.println();

        // limit and skip
        Stream<Integer> s3 = Stream.iterate(1, n -> n + 1);
        s3.skip(5).limit(2).forEach(System.out::print);// 67
        System.out.println();

        Stream<Integer> s4 = Stream.iterate(2, n -> n + 1);
        s4.skip(5).limit(2).forEach(System.out::print);// 78
        System.out.println();

        Stream<Integer> s5 = Stream.iterate(0, n -> n + 1);
        s5.skip(5).limit(2).forEach(System.out::print);// 56
        System.out.println();

        // map
        Stream<String> s6 = Stream.of("monkey", "gorilla", "bonobo");
        s6.map(String::length).forEach(System.out::print);// 676
        System.out.println();

        // flatMap
        List<String> zero = Arrays.asList();
        List<String> one = Arrays.asList("Bonobo");
        List<String> two = Arrays.asList("Mama Gorilla", "Baby Gorilla");
        Stream<List<String>> animals = Stream.of(zero, one, two);
        animals.flatMap(l -> l.stream()).forEach(System.out::println);

        // sorted
        Stream<String> s7 = Stream.of("brown-", "bear-");
        s7.sorted().forEach(System.out::print); // bear-brown-
        System.out.println();

        Stream<String> s8 = Stream.of("brown bear-", "grizzly-");
        s8.sorted(Comparator.reverseOrder()).forEach(System.out::print); // grizzly-brown bear-
        //s8.sorted(Comparator::reverseOrder); // DOES NOT COMPILE
        System.out.println();

        // peek (It is useful for debugging)
        Stream<String> stream = Stream.of("black bear", "brown bear", "grizzly");
        long count = stream.filter(s -> s.startsWith("g")).peek(System.out::println).count();// grizzly
        System.out.println(count);// 1

    }
}
