package chap04.stream.intermediate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//Danger
public class ChangingStateWithPeek {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        List<Character> letters = new ArrayList<>();
        numbers.add(1);
        letters.add('a');

        // straightforward stream pipeline that doesn't use peek().
        Stream<List<?>> stream = Stream.of(numbers, letters);
        stream.map(List::size).forEach(System.out::print); // 11
        System.out.println();

        // add peek() operation
        // The builder is updated in peek method. But it doesn't affect the result of the stream pipeline
        StringBuilder builder = new StringBuilder();
        Stream<List<?>> good = Stream.of(numbers, letters);
        // Danger: peek(l -> builder.append(l))
        good.peek(l -> builder.append(l)).map(List::size).forEach(System.out::print); // 11
        System.out.println(builder); // [1][a]

        // Java doesn't prevent us from writing bad peek code
        // It's causes the result of the stream pipeline
        Stream<List<?>> bad = Stream.of(numbers, letters);
        bad.peek(l -> l.remove(0)).map(List::size).forEach(System.out::print);// 00

    }

}
