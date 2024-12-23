package JavaClass;

public class ReplaceDuplicates {
    public static void main(String[] args) {
        String[] array = {"devaki", "hemanth", "devaki", "swathi", "murali", "hemanth"};

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] != null && array[i].equals(array[j])) {
                    array[j] = null;
                    array[i] = null;
                }
            }
        }

        for (String value : array) {
            System.out.print(value + " ");
        }
    }
}