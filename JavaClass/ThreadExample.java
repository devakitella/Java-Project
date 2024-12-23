package JavaClass;

public class ThreadExample {
    public static void main(String[] args) throws InterruptedException {
        DaemonThreadExample t = new DaemonThreadExample();
        t.setDaemon(true);
        t.start();
        System.out.println("main() execution completed");
    }
}