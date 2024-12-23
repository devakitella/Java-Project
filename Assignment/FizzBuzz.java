package Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int n = sc.nextInt();
        fizzBuzz(n);
    }

    public static void fizzBuzz(int n) {
        List<String> arrList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                arrList.add("FizzBuzz");
            } else if (i % 3 == 0) {
                arrList.add("Fizz");
            } else if (i % 5 == 0) {
                arrList.add("Buzz");
            } else {
                arrList.add(Integer.toString(i));
            }
        }
        System.out.println(arrList);
    }
}
