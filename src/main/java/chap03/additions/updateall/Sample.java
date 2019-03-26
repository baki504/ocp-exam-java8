package chap03.additions.updateall;

import java.util.Arrays;
import java.util.List;

public class Sample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);
        list.replaceAll(x -> x * 2);
        System.out.println(list); // [2, 4, 6]

        List<String> cats = Arrays.asList("Annie", "Ripley");

        // traditional
        for (String cat : cats)
            System.out.println(cat);

        // with lambda
        cats.forEach(c -> System.out.println(c));

        // method reference
        cats.forEach(System.out::println);

    }
}
