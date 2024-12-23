package JavaClass;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FrequencyCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter list of numbers: ");
        ArrayList<Integer> nums = new ArrayList<>();
        while(sc.hasNextInt()){
            nums.add(sc.nextInt());
        }

        HashMap<Integer, Integer> freCountMap = new HashMap<>();
        for (int num : nums) {
            freCountMap.put(num, freCountMap.getOrDefault(num, 0) + 1);
        }
        System.out.println(freCountMap);

        int maxFrequency = 0;
        for (int freq : freCountMap.values()) {
            if (freq > maxFrequency) {
                maxFrequency = freq;
            }
        }

        int totalCount = 0;
        for (int num : nums) {
            if (freCountMap.get(num) == maxFrequency) {
                totalCount++;
            }
        }

        System.out.println("Total elements with maximum frequency: " + totalCount);
    }
}