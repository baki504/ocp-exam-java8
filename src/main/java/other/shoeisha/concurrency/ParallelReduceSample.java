package other.shoeisha.concurrency;

import java.util.Arrays;

public class ParallelReduceSample {

    public static void main(String[] args) {
        doParallel1();
        System.out.println("---");
        doParallel2();
    }

    private static void doParallel1() {
        Integer total = Arrays.asList(10, 20, 30, 40, 50).parallelStream()
                .reduce(0, (sum, a) -> {
                    System.out.println("sum:" + sum + " a:" + a);
                    return sum += a;
                }, (b, c) -> {
                    System.out.println("b:" + b + " c:" + c);
                    return b + c;
                });
        System.out.println("total: " + total);
    }
    private static void doParallel2() {
        Integer total = Arrays.asList(10, 20, 30, 40, 50).parallelStream()
                .reduce(0, (sum, a) -> {
                    System.out.println("sum:" + sum + " a:" + a);
                    return sum += a;
                });
        System.out.println("total: " + total);
    }

}
