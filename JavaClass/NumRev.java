package JavaClass;

import Assignment.ReverseNumber;

import java.util.Scanner;

public class NumRev {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        NumRev rn = new NumRev();
        System.out.println("Reverse of a number: " + rn.Reverse(num));

    }
}
