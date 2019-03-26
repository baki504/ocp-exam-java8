package chap03.generics.autoboxing;

import java.util.ArrayList;
import java.util.List;

public class LegacyAutoboxing {

    public static void main(String[] args) {
        List numbers = new ArrayList<>();
        numbers.add(5); // This works because Java automatically autoboxes to an Integer.
        System.out.println(numbers.get(0));

        // Since we aren't using generics, Java doesn't know that the list contains an Integer.
        // It just knows that we have an Object. And an Object can't be unboxed into an int.
        // int result = numbers.get(0); // does not compile
    }
}
