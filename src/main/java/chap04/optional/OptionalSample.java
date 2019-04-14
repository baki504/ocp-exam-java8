package chap04.optional;

import java.util.Optional;

public class OptionalSample {

    public static Optional<Double> average(int... scores) {
        if (scores.length == 0) {
            return Optional.empty();
        }

        int sum = 0;
        for (int score : scores) {
            sum += score;
        }

        return Optional.of((double) sum / scores.length);
    }

    public static void main(String[] args) {
        System.out.println(average(90, 100)); // Optional[95.0]
        System.out.println(average()); // Optional.empty

        Optional<Double> opt = average(90, 100);
        if (opt.isPresent()) {
            System.out.println(opt.get());
        }

        Optional<Double> opt2 = average();
        // System.out.println(opt2.get()); // java.util.NoSuchElementException: No value present

        // Optional<Double> opt3 = Optional.of(null); // NullPointerException
        Optional<Double> opt3 = Optional.ofNullable(null);
        System.out.println(opt3);

        Optional<Double> opt4 = average(90, 100);
        opt4.ifPresent(System.out::println);

        Optional<Double> opt5 = average();
        System.out.println(opt5.orElse(Double.NaN)); // NaN
        System.out.println(opt5.orElseGet(() -> Math.random())); // random value
        System.out.println(opt5.orElseThrow(() -> new IllegalStateException()));

    }

}
