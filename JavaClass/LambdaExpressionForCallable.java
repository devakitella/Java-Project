package JavaClass;

import java.util.concurrent.*;

public class LambdaExpressionForCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Integer> c = () -> {
            {
                int a = 10;
                int b = 20;
                int sum = a + b;
                return sum;
            }
        };
        ExecutorService es= Executors.newFixedThreadPool(10);
        Future<Integer> f = es.submit(c);
        System.out.println(f.get());

    }
}
