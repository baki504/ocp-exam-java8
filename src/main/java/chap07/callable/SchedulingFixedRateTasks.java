package chap07.callable;

import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SchedulingFixedRateTasks {

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

        service.scheduleAtFixedRate(task1, 0, 1, TimeUnit.SECONDS);

    }

    //console output example
    //2019-04-21T16:24:37.684 task1 starts.
    //2019-04-21T16:24:38.685 Thread[pool-1-thread-1,5,main]: count = 0
    //2019-04-21T16:24:39.687 Thread[pool-1-thread-1,5,main]: count = 1
    //2019-04-21T16:24:40.687 Thread[pool-1-thread-1,5,main]: count = 2
    //2019-04-21T16:24:40.688 task2 ends.
    //2019-04-21T16:24:40.689 task1 starts.
    //2019-04-21T16:24:41.691 Thread[pool-1-thread-1,5,main]: count = 0
    //2019-04-21T16:24:42.691 Thread[pool-1-thread-1,5,main]: count = 1
    //2019-04-21T16:24:43.692 Thread[pool-1-thread-1,5,main]: count = 2
    //2019-04-21T16:24:43.692 task2 ends.
    //2019-04-21T16:24:43.693 task1 starts.
    //2019-04-21T16:24:44.693 Thread[pool-1-thread-1,5,main]: count = 0
    //2019-04-21T16:24:45.694 Thread[pool-1-thread-1,5,main]: count = 1
    //2019-04-21T16:24:46.694 Thread[pool-1-thread-1,5,main]: count = 2
    //2019-04-21T16:24:46.694 task2 ends.
    //2019-04-21T16:24:46.695 task1 starts.
    //2019-04-21T16:24:47.696 Thread[pool-1-thread-1,5,main]: count = 0
    //2019-04-21T16:24:48.696 Thread[pool-1-thread-1,5,main]: count = 1
    //2019-04-21T16:24:49.697 Thread[pool-1-thread-1,5,main]: count = 2
    //2019-04-21T16:24:49.698 task2 ends.
    //2019-04-21T16:24:49.700 task1 starts.
    //2019-04-21T16:24:50.700 Thread[pool-1-thread-1,5,main]: count = 0
    //  :

}
