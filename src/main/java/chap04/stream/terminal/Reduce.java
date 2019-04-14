package chap04.stream.terminal;

import java.util.stream.Stream;

public class Reduce {

    public static void main(String[] args) {
        // traditional ways
        String[] array = new String[] { "w", "o", "l", "f" };
        String result = "";
        for (String s : array)
            result = result + s;
        System.out.println(result);

        // with lambda ways
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        String word = stream.reduce("", (s, c) -> s + c);
        System.out.println(word);// wolf

        System.out.println("---");

        // with lambda ways
        Stream<String> stream2 = Stream.of("w", "o", "l", "f");
        String word2 = stream2.reduce("", (s, c) -> {
            System.out.println(s + c);
            return s + c;
        });
        System.out.println(word2);// wolf

        Stream<Integer> stream356 = Stream.of(3, 5, 6);
        System.out.println(stream356.reduce(4, (a, b) -> a * b));

    }

}
