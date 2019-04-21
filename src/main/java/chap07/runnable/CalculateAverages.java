package chap07.runnable;

import java.util.stream.DoubleStream;

public class CalculateAverages implements Runnable {
    private double[] scores;

    public CalculateAverages(double[] scores) {
        this.scores = scores;
    }

    public void run() {
        System.out.println(DoubleStream.of(scores).average().getAsDouble());
    }

    public static void main(String[] args) {
        double[] doubles = { 0.3, 0.5, 0.8, 0.2 };
        new Thread(new CalculateAverages(doubles)).start();
    }

}
