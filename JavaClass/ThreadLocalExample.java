package JavaClass;

public class ThreadLocalExample {
    // Create a ThreadLocal variable
    private static ThreadLocal<Integer> threadLocal = ThreadLocal.withInitial(() -> 0);

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            threadLocal.set(100);  // Thread t1 sets its value
            System.out.println("Thread 1 Value: " + threadLocal.get());
        });

        Thread t2 = new Thread(() -> {
            threadLocal.set(200);  // Thread t2 sets its value
            System.out.println("Thread 2 Value: " + threadLocal.get());
        });

        t1.start();
        t2.start();
        t2.start();
    }
}

