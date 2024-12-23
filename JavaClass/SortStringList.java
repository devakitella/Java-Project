package JavaClass;

import java.util.ArrayList;
import java.util.List;

public class SortStringList {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hema");
        stringList.add("Devaki");
        stringList.add("Swathi");
        stringList.add("Hemanth");
        stringList.add("Murali");
        System.out.println("Before Sorting: " + stringList);
        for (int i = 0; i < stringList.size() - 1; i++) {
            for (int j = 0; j < stringList.size() - i - 1; j++) {
                if (stringList.get(j).compareTo(stringList.get(j + 1)) > 0) {
                    String temp = stringList.get(j);
                    stringList.set(j, stringList.get(j + 1));
                    stringList.set(j + 1, temp);
                }
            }
        }
        System.out.println("After Sorting: " + stringList);
    }
}
