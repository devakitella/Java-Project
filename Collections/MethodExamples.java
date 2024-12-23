package Collections;

import java.util.ArrayList;
import java.util.List;

public class MethodExamples {
    public static void main(String[] args) {
        List<String> l = new ArrayList<String>();
        l.add("A");
        l.add("B");
        l.add("C");
        l.add("A");
        System.out.println(l.indexOf("D"));
    }

}
