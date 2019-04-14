package chap04.stream.advanced;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class AdvancedStreamPipeline {

    public static void main(String[] args) {
        threeDigit(Optional.of(1));
        threeDigit(Optional.of(12));
        threeDigit(Optional.of(123)); // 123
        threeDigit(Optional.ofNullable(null));
        // threeDigit(Optional.of(null)); // NullPointerException

        threeDigitWithPipeline(Optional.of(1));
        threeDigitWithPipeline(Optional.of(12));
        threeDigitWithPipeline(Optional.of(123)); // 123
        threeDigitWithPipeline(Optional.ofNullable(null));
        // threeDigit(Optional.of(null)); // NullPointerException

        List<String> cats = new ArrayList<>();
        cats.add("Annie");
        cats.add("Ripley");
        Stream<String> stream = cats.stream(); // lazy evaluated
        cats.add("KC");
        System.out.println(stream.count()); // 3
    }

    private static void threeDigit(Optional<Integer> optional) {
        if (optional.isPresent()) {// outer if
            Integer num = optional.get();
            String string = "" + num;
            if (string.length() == 3) // inner if
                System.out.println(string);
        }
    }

    private static void threeDigitWithPipeline(Optional<Integer> optional) {
        optional.map(n -> "" + n) // part 1
                .filter(s -> s.length() == 3)// part 2
                .ifPresent(System.out::println); // part 3
    }

}
