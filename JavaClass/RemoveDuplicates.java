package JavaClass;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Devaki");
        list.add("Hemanth");
        list.add("Devaki");
        list.add("Swathi");
        list.add("Swathi");
        list.add("Murali");
        list.add("Devaki");
        list.add("Vedha");
        list.add("Pradyumna");
        list.add("Satya");
        System.out.println("Before removing duplicates: " + list);
        Set<String> set = new HashSet<>();
        for(String s: list) {
            set.add(s);
        }
        System.out.println("After removing duplicates: " + set);
    }
}
