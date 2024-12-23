package JavaClass;

public class Reentrant extends Thread {
    public void run() {
        disp();
    }
    public  synchronized void disp() {
        System.out.println("I am in disp() method");
        show();
    }
    public  synchronized void show() {
        System.out.println("I am in show() method");
    }
}
