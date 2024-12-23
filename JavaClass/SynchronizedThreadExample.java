package JavaClass;

public class SynchronizedThreadExample implements Runnable {
    public  void run() {
        disp();
    }
    public static synchronized void disp() {
        for(int i=1;i<=5;i++)
        {
            System.out.println(i);
        }
    }
}
