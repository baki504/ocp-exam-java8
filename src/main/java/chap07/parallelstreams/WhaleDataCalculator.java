package chap07.parallelstreams;

import java.util.ArrayList;
import java.util.List;

public class WhaleDataCalculator {
    public int processRecord(int input) {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) { // Handle interrupted exception
        }
        return input + 1;
    }

    public void processAllData(List<Integer> data) {
        // serial stream
        //        data.stream()
        //                .peek(System.out::println)
        //                .map(a -> processRecord(a))
        //                .count();
        // output: Tasks completed in: 9.375 seconds

        // parallel stream
        data.parallelStream()
                .peek(System.out::println)
                .map(a -> processRecord(a))
                .count();
        // output: Tasks completed in: 2.36 seconds

    }

    public static void main(String[] args) {
        WhaleDataCalculator calculator = new WhaleDataCalculator(); // Define the data
        List<Integer> data = new ArrayList<Integer>();

        for (int i = 0; i < 500; i++)
            data.add(i); // Process the data

        long start = System.currentTimeMillis();
        calculator.processAllData(data);
        double time = (System.currentTimeMillis() - start) / 1000.0; // Report results

        System.out.println("Tasks completed in: " + time + " seconds");
    }
}
