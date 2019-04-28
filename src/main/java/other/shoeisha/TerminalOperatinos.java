package other.shoeisha;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

// 5-8
public class TerminalOperatinos {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java ", "Duke ", "Gold ");
        Function<String, String> f = s -> "Hello : ".concat(s);
        list.stream()
                .map(f)
                .peek(System.out::print); // because terminal operation not exists, this line print nothing

        System.out.println("-- another stream --");

        list.stream()
        .map(f)
        .peek(System.out::print) // this line can print
        .count(); // terminal operation
    }

}
