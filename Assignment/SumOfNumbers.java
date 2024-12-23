package Assignment;

import java.util.Scanner;


public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = sum(num);
        System.out.println(sum);
    }

    public static int sum(int number) {
        int sum = 0;
        int rem;
        while(number != 0) {
            rem = number % 10;
            sum += rem;
            number /= 10;
        }
        return sum;
    }
}
