package JavaClass;

public class DoubleExists {
    public static boolean checkIfDoubleExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == 2 * arr[j])
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr1 = {10, 2, 5, 3};
        System.out.println("Array-1: " + checkIfDoubleExist(arr1));
        int[] arr2 = {3, 1, 7, 11};
        System.out.println("Array-2:: " + checkIfDoubleExist(arr2));
    }
}
