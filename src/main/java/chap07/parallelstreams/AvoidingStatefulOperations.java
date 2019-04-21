package chap07.parallelstreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AvoidingStatefulOperations {
    public static void main(String[] args) {
        List<Integer> data = Collections.synchronizedList(new ArrayList<>());
        //List<Integer> data = new ArrayList<>();

        Arrays.asList(1, 2, 3, 4, 5, 6)
                .parallelStream()
                .map(i -> {
                    data.add(i);
                    return i;
                }) // AVOID STATEFUL LAMBDA EXPRESSIONS!
                .forEachOrdered(System.out::print);

        System.out.println();

        data.stream().forEach(System.out::print);

    }
}
