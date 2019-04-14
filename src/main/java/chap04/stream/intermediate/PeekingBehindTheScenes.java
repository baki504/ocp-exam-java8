package chap04.stream.intermediate;

import java.util.stream.Stream;

public class PeekingBehindTheScenes {

    public static void main(String[] args) {
        Stream.iterate(1, x -> x + 1)
                .limit(5)
                .filter(x -> x % 2 == 1)
                .forEach(System.out::print);// 135
        System.out.println();

        Stream.iterate(1, x -> x + 1)
                .limit(5)
                .peek(System.out::print)
                .filter(x -> x % 2 == 1)
                .forEach(System.out::print);
        System.out.println();

        Stream.iterate(1, x -> x + 1)
                .filter(x -> x % 2 == 1)
                .limit(5)
                .forEach(System.out::print); // 13579
        System.out.println();

        Stream.iterate(1, x -> x + 1)
                .filter(x -> x % 2 == 1)
                .peek(System.out::print)
                .limit(5)
                .forEach(System.out::print); // 1133557799

    }
}
