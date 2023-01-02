package min.research.future;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Calculator {
    private final ExecutorService executorService =
            //Executors.newSingleThreadExecutor();
            Executors.newFixedThreadPool(2);

    public Future<Integer> calculate(Integer integer) {
        return executorService.submit(() -> {
            Thread.sleep(1000);
            return integer * integer;
        });
    }

}
