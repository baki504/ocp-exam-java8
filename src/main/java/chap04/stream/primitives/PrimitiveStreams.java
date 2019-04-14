package chap04.stream.primitives;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveStreams {

    public static void main(String[] args) {
        System.out.println(
                Stream.of(1, 2, 3)
                        .reduce(0, (s, n) -> s + n * 2));

        System.out.println(
                Stream.of(1, 2, 3)
                        .mapToInt(x -> x).sum());

        IntStream intStream = IntStream.of(1, 2, 3);
        OptionalDouble avg = intStream.average();
        System.out.println(avg.getAsDouble());

        DoubleStream empty = DoubleStream.empty();
        empty.forEach(x -> {
            // doesn't run
            System.out.println("[" + x + "]");
        });

        DoubleStream oneValue = DoubleStream.of(3.14);
        oneValue.forEach(System.out::println);

        DoubleStream varargs = DoubleStream.of(1.0, 1.1, 1.2);
        varargs.forEach(System.out::println);

        DoubleStream random = DoubleStream.generate(Math::random);
        random.limit(3).forEach(System.out::println);

        DoubleStream fractions = DoubleStream.iterate(.5, d -> d / 2);
        fractions.limit(3).forEach(System.out::println);

        IntStream count = IntStream.iterate(1, n -> n + 1).limit(5);
        count.forEach(System.out::print); // 12345
        System.out.println();

        IntStream range = IntStream.range(1, 6);
        range.forEach(System.out::print); // 12345
        System.out.println();

        IntStream rangeClosed = IntStream.rangeClosed(1, 5);
        rangeClosed.forEach(System.out::print); // 12345
        System.out.println();

    }
}
