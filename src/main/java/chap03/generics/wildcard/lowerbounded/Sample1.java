package chap03.generics.wildcard.lowerbounded;

import java.util.ArrayList;
import java.util.List;

public class Sample1 {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("tweet");

        List<Object> objects = new ArrayList<>(strings);
        addSound(strings);
        addSound(objects);
        addSound4(objects);

        objects.forEach(System.out::println);
    }

    public static void addSound(List<? super String> list) {
        // lower bound
        list.add("quack");
    }

    public static void addSound2(List<?> list) {
        // list.add("quack"); // does not compile(unbounded generics are immutable)
    }

    public static void addSound3(List<? extends Object> list) {
        // list.add("quack"); // does not compile(upper-bounded generics are immutable)
    }

    public static void addSound4(List<Object> list) {
        list.add(new Object());
        list.add("quack"); // (with generics, must pass exact match)
    }

}

