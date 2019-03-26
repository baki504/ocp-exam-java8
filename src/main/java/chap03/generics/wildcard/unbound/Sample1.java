package chap03.generics.wildcard.unbound;

import java.util.ArrayList;
import java.util.List;

public class Sample1 {

    public static void printList(List<Object> list) {
        for (Object object : list) {
            System.out.println(object);
        }
    }

    public static void main(String[] args) {
        List<String> keywords = new ArrayList<>();
        keywords.add("java");
        keywords.add("ruby");
        keywords.add("c");
        // printList(keywords);// DOES NOT COMPILE

        List<Integer> numbers = new ArrayList<>();
        numbers.add(new Integer(42));
        // List<Object> objects = numbers; DOES NOT COMPILE
        // objects.add("forty two");
    }

}
