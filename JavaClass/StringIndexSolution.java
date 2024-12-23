package JavaClass;

public class StringIndexSolution {
    public static void main(String[] args) {
        String s = "Devaki";
        int index = 50;

        if (index >= 0 && index < s.length()) {
            System.out.println(s.charAt(index));
        } else {
            System.out.println("String index out of bounds");
        }
    }
}
