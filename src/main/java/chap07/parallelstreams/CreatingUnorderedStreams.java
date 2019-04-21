package chap07.parallelstreams;

import java.util.Arrays;

// unordered streams will not be on the exam
public class CreatingUnorderedStreams {

    public static void main(String[] args) {
        Arrays.asList(1, 2, 3, 4, 5, 6).stream()
                .unordered()
                .forEach(System.out::print); // unordered stream has no effect

        System.out.println();

        Arrays.asList(1, 2, 3, 4, 5, 6).stream()
                .unordered()
                .parallel()
                .forEach(System.out::print); // unordered stream has greatly improve performance

    }
}
