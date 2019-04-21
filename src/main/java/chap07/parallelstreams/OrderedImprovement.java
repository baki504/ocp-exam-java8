package chap07.parallelstreams;

import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class OrderedImprovement {

    IntConsumer intConsumer = i -> {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    };

    public static void main(String[] args) {

        OrderedImprovement oi = new OrderedImprovement();

        // serial stream process
        long start1 = System.currentTimeMillis();
        oi.processSerial();
        double time1 = (System.currentTimeMillis() - start1) / 1000.0; // Report results

        System.out.println("Serial Stream             / Tasks completed in: " + time1 + " seconds");

        // parallel stream process
        long start2 = System.currentTimeMillis();
        oi.processParallel();
        double time2 = (System.currentTimeMillis() - start2) / 1000.0; // Report results

        System.out.println("Parallel Stream           / Tasks completed in: " + time2 + " seconds");

        // unordered parallel stream process
        long start3 = System.currentTimeMillis();
        oi.processUnorderedParallel();
        double time3 = (System.currentTimeMillis() - start3) / 1000.0; // Report results

        System.out.println("Unordered Parallel Stream / Tasks completed in: " + time3 + " seconds");

        //        console output:
        //        Serial Stream             / Tasks completed in: 94.805 seconds
        //        Parallel Stream           / Tasks completed in: 94.676 seconds
        //        Unordered Parallel Stream / Tasks completed in: 23.86 seconds

    }

    void processSerial() {
        IntStream.range(1, 5000)
                .forEach(intConsumer);
    }

    void processParallel() {
        IntStream.range(1, 5000)
                .parallel()
                .forEachOrdered(intConsumer);

    }

    void processUnorderedParallel() {
        IntStream.range(1, 5000)
                .unordered()
                .parallel()
                .forEach(intConsumer);

    }
}
