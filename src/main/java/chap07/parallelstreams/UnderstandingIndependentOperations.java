package chap07.parallelstreams;

import java.util.Arrays;

public class UnderstandingIndependentOperations {

    public static void main(String[] args) {
        Arrays.asList("jackal", "kangaroo", "lemur")
                .parallelStream()
                .map(s -> s.toUpperCase())
                .forEach(System.out::println);

        System.out.println();

        Arrays.asList("jackal", "kangaroo", "lemur")
                .parallelStream()
                .map(s -> {
                    System.out.println(s);
                    return s.toUpperCase();
                }).forEach(System.out::println);

    }
}
