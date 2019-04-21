package chap07.callable;

import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SchedulingFixedDurationTasks {

    public static void main(String[] args) throws InterruptedException {

        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        Runnable task1 = () -> {
            System.out.println(LocalDateTime.now() + " task1 starts.");
            try {
                int count = 0;
                while (count != 3) {
                    Thread.sleep(1000);
                    System.out.println(LocalDateTime.now() + " " + Thread.currentThread() + ": count = " + count);
                    count++;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(LocalDateTime.now() + " task2 ends.");
        };

        service.scheduleWithFixedDelay(task1, 2, 1, TimeUnit.SECONDS);

    }

    //console output example
    //2019-04-21T16:26:40.204 task1 starts.
    //2019-04-21T16:26:41.205 Thread[pool-1-thread-1,5,main]: count = 0
    //2019-04-21T16:26:42.205 Thread[pool-1-thread-1,5,main]: count = 1
    //2019-04-21T16:26:43.205 Thread[pool-1-thread-1,5,main]: count = 2
    //2019-04-21T16:26:43.205 task2 ends.
    //2019-04-21T16:26:44.206 task1 starts.
    //2019-04-21T16:26:45.207 Thread[pool-1-thread-1,5,main]: count = 0
    //2019-04-21T16:26:46.207 Thread[pool-1-thread-1,5,main]: count = 1
    //2019-04-21T16:26:47.207 Thread[pool-1-thread-1,5,main]: count = 2
    //2019-04-21T16:26:47.207 task2 ends.
    //2019-04-21T16:26:48.210 task1 starts.
    //2019-04-21T16:26:49.210 Thread[pool-1-thread-1,5,main]: count = 0
    //2019-04-21T16:26:50.211 Thread[pool-1-thread-1,5,main]: count = 1
    //2019-04-21T16:26:51.212 Thread[pool-1-thread-1,5,main]: count = 2
    //2019-04-21T16:26:51.214 task2 ends.
    //2019-04-21T16:26:52.224 task1 starts.
    //2019-04-21T16:26:53.225 Thread[pool-1-thread-1,5,main]: count = 0
    //  :

}
