package Interview;

import java.util.concurrent.*;

public class FutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(() -> {
            Thread.sleep(1000);
            return 50;
        });
        Integer result = future.get();  // Blocks until the result is available
        System.out.println(result);  // Output: 42
        executor.shutdown();
    }
}
