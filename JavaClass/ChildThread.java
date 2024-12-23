package JavaClass;

public class ChildThread extends Thread {
    public void run() {
        try {
            System.out.println("Child thread is running...");
                Thread.sleep(2000);
            System.out.println("Child thread has finished its task.");
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
