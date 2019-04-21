package chap07.parallelstreams;

import java.util.Arrays;

public class CombiningResultsWithReduce {

    public static void main(String[] args) {
        System.out.println(
                Arrays.asList('w', 'o', 'l', 'f').stream()
                        .peek(System.out::println)
                        .reduce("", (c, s1) -> c + s1, (s2, s3) -> s2 + s3));

        System.out.println();

        System.out.println(
                Arrays.asList(1, 2, 3, 4, 5, 6).stream()
                        .peek(System.out::println)
                        .reduce(0, (a, b) -> (a - b))); // NOT AN ASSOCIATIVE ACCUMULATOR

        System.out.println();

        System.out.println(
                Arrays.asList(1, 2, 3, 4, 5, 6).parallelStream()
                        .peek(System.out::println)
                        .reduce(0, (a, b) -> (a - b))); // NOT AN ASSOCIATIVE ACCUMULATOR

        System.out.println();

        System.out.println(
                Arrays.asList("w", "o", "l", "f").parallelStream()
                        .peek(System.out::println)
                        .reduce("X", String::concat));

    }

}
