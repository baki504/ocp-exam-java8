package chap04.stream.terminal;

import java.util.stream.Stream;

public class ForEach {

    public static void main(String[] args) {
        Stream<String> s = Stream.of("Monkey", "Gorilla", "Bonobo");
        s.forEach(System.out::print);// MonkeyGorillaBonobo

        Stream stream = Stream.of(1);
        //for (Integer i : stream) {} // DOES NOT COMPILE because s isn't implement Iteratable
    }
}
