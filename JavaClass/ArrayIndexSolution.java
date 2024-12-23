package JavaClass;

public class ArrayIndexSolution {
    public static void main(String[] args) {
        int[] array = {10, 20, 30};
        int index = 100;

        if (index >= 0 && index < array.length) {
            System.out.println(array[index]);
        } else {
            System.out.println("Array index out of bounds");
        }
    }
}