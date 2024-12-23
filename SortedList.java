import java.util.ArrayList;
import java.util.List;

public class SortedList {

    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(28);
        num.add(7);
        num.add(96);
        num.add(39);
        num.add(15);
        num.add(54);
        num.add(85);
        num.add(72);
        num.add(67);
        num.add(41);
        System.out.println("Original List: " + num);
        num.sort((a, b) -> a.compareTo(b));
        System.out.println("Sorted List: " + num);
    }
}