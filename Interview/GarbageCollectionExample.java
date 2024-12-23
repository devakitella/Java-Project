package Interview;

public class GarbageCollectionExample {
    public static void main(String[] args) {
        GarbageCollectionExample obj = new GarbageCollectionExample();
        obj = null;
        System.gc();
        System.out.println("Garbage Collection triggered!");
        // Pausing the main thread to allow GC to complete
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Program completed.");
    }
}