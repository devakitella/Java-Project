package JavaClass;

public class VolatileExample {
    // volatile keyword ensures that changes to this variable are immediately visible to all threads
    public static volatile boolean running = true;
    public static int count = 0;

    public static void main(String[] args) {
        // Creating thread t1
        Thread t1 = new Thread() {
            public void run() {
                System.out.println("In thread t1");
                while (running) {
                    count++;
                }
                System.out.println(count + " out of loop");
            }
        };

        // Starting thread t1
        t1.start();

        try {
            // Let the loop run for a while
            t1.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // After 1 second, stop the loop
        System.out.println("After loop execution");
        running = false;  // Setting running to false stops the loop in t1
    }
}
