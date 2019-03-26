package chap03.generics.wildcard.upperbound;

import java.util.Arrays;
import java.util.List;

public class Sample1 {

    public static long total(List<? extends Number> list) {
        long count = 0;
        for (Number number : list) {
            count += number.longValue();
        }
        return count;
    }

    public static void main(String[] args) {
        List<Number> numbers = Arrays.asList(new Number[] { new Long(100l), new Long(1000l), new Long(1l) });
        System.out.println(Sample1.total(numbers));
        System.out.println(numbers.stream().mapToLong(n -> n.longValue()).sum());
    }

}
