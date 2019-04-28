package other.shoeisha;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// 5-9
public class AllMatchTerminalOperation {

    public static void main(String[] args) {
        List<String> shapes = Arrays.asList("circle", "square", "rectangle");
        Predicate<String> test = n -> {
            System.out.print("Checking... / ");
            return n.contains("cle");
        };
        shapes.stream()
                .filter(c -> c.length() > 5)
                .allMatch(test);
    }

}
