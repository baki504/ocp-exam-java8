package chap07.callable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class WaitingAllTasks {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService service = null;

        try {
            service = Executors.newSingleThreadExecutor();
            // Add tasks to the thread executor

            service.submit(() -> {
                Thread.sleep(1_200);
                return null;
            });

        } finally {
            if (service != null)
                service.shutdown();
        }

        if (service != null) {
            //service.awaitTermination(1, TimeUnit.SECONDS); // not enough time to wait finish the task
            service.awaitTermination(1, TimeUnit.MINUTES);

            // Check whether all tasks are finished
            if (service.isTerminated())
                System.out.println("All tasks finished");
            else
                System.out.println("At least one task is still running");
        }
    }
}
