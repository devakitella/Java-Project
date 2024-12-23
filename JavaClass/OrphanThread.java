package JavaClass;

public class OrphanThread {
    public static void main(String[] args) {
        ChildThread childThread = new ChildThread();
        childThread.start();

        System.out.println("Parent thread is finishing...");
    }
}
