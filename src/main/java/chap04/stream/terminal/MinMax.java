package chap04.stream.terminal;

import java.util.Optional;
import java.util.stream.Stream;

public class MinMax {

    public static void main(String[] args) {

        Stream<String> strm = Stream.of("monkey", "ape", "bonobo", "bonobono");
        Optional<String> min = strm.min((s1, s2) -> s1.length() - s2.length());
        min.ifPresent(System.out::println);

        Optional<?> minEmpty = Stream.empty().min((s1, s2) -> 0);
        System.out.println(minEmpty.isPresent());// false

    }

}
