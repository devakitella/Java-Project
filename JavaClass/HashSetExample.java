package JavaClass;
import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet and add names
        HashSet<String> names = new HashSet<>();
        names.add("Devaki");
        names.add("Shivani");
        names.add("VJ");
        names.add("Avinash");
        names.add("Apurupa");

        Iterator<String> iter = names.iterator();
        System.out.println("Iterating through HashSet:");
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        if (names.contains("VJ")) {
            names.remove("VJ");
        }

        System.out.println("After removing VJ:");
        Iterator<String> i = names.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
