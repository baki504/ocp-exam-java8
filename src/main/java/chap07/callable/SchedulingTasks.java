package chap07.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SchedulingTasks {

    public static void main(String[] args) throws InterruptedException {

        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        Runnable task1 = () -> System.out.println("Hello Zoo");
        Callable<String> task2 = () -> {
            System.out.println("Monkey");
            return "Monkey";
        };
        Future<?> result1 = service.schedule(task1, 2, TimeUnit.SECONDS);
        Future<?> result2 = service.schedule(task2, 1, TimeUnit.SECONDS);

        service.scheduleAtFixedRate(task1, 1, 1, TimeUnit.SECONDS);
        service.scheduleAtFixedRate(task1, 0, 30, TimeUnit.SECONDS);

    }
}
