package Interview;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> predicate = x -> x % 2 == 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(predicate.test(n)) {
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number");
        }
    }
}
