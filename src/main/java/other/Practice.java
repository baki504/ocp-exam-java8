package other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Practice {

    class Inner {

    }

    static class StaticInner {
        static void innerMethod() {
        };
    }

    public static void main(String[] args) {

        IntStream.range(1, 5).forEach(System.out::print);
        System.out.println();
        IntStream.rangeClosed(1, 5).forEach(System.out::print);
        System.out.println();

        Stream.of(new String[] { "aaa", "bbb", "ccc" }).map(s -> {
            return s.length();
        });
        Stream.of(new String[] { "aaa", "bbb", "ccc" }).map(s -> s.length());
        Stream.of(new String[] { "aaa", "bbb", "ccc" }).map(String::length);

        List<String> list = Stream.of(new String[] { "AAA", "BBB", "CCC" })
                .collect(Collectors.toList());

        list.replaceAll(s -> s.toLowerCase());

        System.out.println(list);

        List<String> stringList = new ArrayList<>();
        stringList.add("A");
        stringList.addAll(Arrays.asList());

        IntStream.range(0, 9).forEach(System.out::print); // exclude 9
        System.out.println();
        IntStream.rangeClosed(0, 9).forEach(System.out::print); // include 9

        System.out.println();
        System.out.println("legacy loop");
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
        }

        // inner class
        Practice.Inner a = new Practice().new Inner();
        Practice.StaticInner.innerMethod();

    }

}
