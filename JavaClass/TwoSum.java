package JavaClass;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter list of numbers: ");
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        Map<Integer, Integer> twoSum = new HashMap<>();
        for(int i = 0; i < n; i++){
            int diff = target - nums[i];
            if (twoSum.containsKey(diff)) {
                System.out.println("Indices: [" + twoSum.get(diff) + ", " + i + "]");
                return;
            }
            twoSum.put(nums[i], i);
        }
        System.out.println("No solution found");
    }
}
