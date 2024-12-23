package JavaClass;

public class MySingleton {
    public static void main(String[] args) {
        Single s = SingletonExample.getInstance();
        System.out.println(s.hashCode());
        s.display();
    }
}
