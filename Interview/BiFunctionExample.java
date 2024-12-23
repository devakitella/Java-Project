package Interview;

import java.util.Scanner;
import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> bifunction = (a, b) -> a + b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = bifunction.apply(a, b);
        System.out.println("Sum is: " + sum);
    }
}
