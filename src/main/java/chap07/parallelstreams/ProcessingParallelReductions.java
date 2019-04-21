package chap07.parallelstreams;

import java.util.Arrays;

public class ProcessingParallelReductions {

    public static void main(String[] args) {
        System.out.println(
                Arrays.asList(1, 2, 3, 4, 5, 6)
                        .stream()
                        .findAny()
                        .get()); //1

        System.out.println(
                Arrays.asList(1, 2, 3, 4, 5, 6)
                        .parallelStream()
                        .findAny()
                        .get()); //?

        System.out.println(
                Arrays.asList(1, 2, 3, 4, 5, 6)
                        .parallelStream()
                        .skip(5)
                        .limit(2)
                        .findFirst()
                        .get()); //6

    }
}
