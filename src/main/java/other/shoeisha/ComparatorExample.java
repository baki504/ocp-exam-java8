package other.shoeisha;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

    // 5-14
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(100, 50, 200);

        // A
        System.out.println("A: " +
                nums.stream()
                        .min(Comparator.comparing(a -> a))
                        .get());

        // B
        System.out.println("B: " +
                nums.stream()
                        .min(Integer::min)
                        .get());

        System.out.println("---");
        System.out.println("B(not omitted): " +
                nums.stream()
                        .min(new Comparator<Integer>() {
                            @Override
                            public int compare(Integer o1, Integer o2) {
                                int min = Integer.min(o1, o2);
                                System.out.println("min: " + min);
                                return min;
                            }
                        })
                        .get());
        System.out.println("---");

        // C
        // System.out.println(nums.stream().min()); // compilation error

        // D
        // System.out.println(nums.stream().map(p -> p).min()); // compilation error

        // other
        System.out.println("other: " +
                nums.stream()
                        .map(p -> p)
                        .min(Comparator.comparing(a -> a))
                        .get());

    }

}
