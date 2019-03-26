package chap03.generics.wildcard.unbound;

import java.util.ArrayList;
import java.util.List;

public class Sample2 {

    public static void printList(List<?> list) {
        list.forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<String> keywords = new ArrayList<>();
        keywords.add("java");
        keywords.add("ruby");
        keywords.add("python");
        printList(keywords);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(new Integer(1));
        numbers.add(new Integer(100));
        numbers.add(new Integer(1000));
        printList(numbers);
    }
}
