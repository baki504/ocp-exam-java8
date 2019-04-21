package chap07.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class AddData {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            Future<Integer> result = service.submit(() -> 30 + 11);
            System.out.println(result.get());

            // This expression can compile.
            // Because lambda expressino has a return type,
            // so the compiler treates this is a Callable expression that supports checked exeptions.
            service.submit(() -> {
                Thread.sleep(1000);
                return null;
            });

            // This expression can't compile.
            // service.submit(() -> {
            //     Thread.sleep(1000);
            // });

        } finally {
            if (service != null)
                service.shutdown();
        }
    }

}
