package Assignment;

import java.util.Scanner;

public class ReverseNumber {
    public int Reverse(int n) {
        int reverse = 0;
        int rem = 0;
        int i = 0;
        while (i < n) {
            rem = n % 10;
            reverse = reverse * 10 + rem;
            n /= 10;
        }
        return reverse;
    }

    public void Reverse() {
        System.out.println("No return type, no arguments");
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reverse = 0;
        int rem = 0;
        int i = 0;
        while (i < num) {
            rem = num % 10;
            reverse = reverse * 10 + rem;
            num /= 10;
        }
        System.out.println("Reverse of a number: " + reverse);
    }

    public void ReverseNum(int num) {
        System.out.println("No return type, with arguments");
        int reverse = 0;
        int rem = 0;
        int i = 0;
        while (i < num) {
            rem = num % 10;
            reverse = reverse * 10 + rem;
            num /= 10;
        }
        System.out.println("Reverse of a number: " + reverse);
    }

    public int ReverseNum() {
        System.out.println("With return type, no arguments");
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reverse = 0;
        int rem = 0;
        int i = 0;
        while (i < num) {
            rem = num % 10;
            reverse = reverse * 10 + rem;
            num /= 10;
        }
        return reverse;
    }

}
