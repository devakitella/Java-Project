package JavaClass;

public class DaemonThreadExample extends Thread {
    public void run()
    {
        System.out.println("thread execution starts");
        if(Thread.currentThread().isDaemon())
            System.out.println("daemon thread");
        else
            System.out.println("user-defined thread");
    }
}
