package JavaClass;

public class Double {
    public static void main(String[] args)
    {
        Single s1=SingletonExample.getInstance();
        Single s2=SingletonExample.getInstance();
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }

}
