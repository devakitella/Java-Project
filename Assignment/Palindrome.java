package Assignment;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int rev = Reverse(num);
        if (rev == num)
            System.out.println(num + " is Palindrome number");
        else
            System.out.println(num + " is not Palindrome number");
    }
    public static int Reverse(int n) {
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
}
