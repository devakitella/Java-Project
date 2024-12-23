package Prg1;

import java.util.Scanner;

public class HappyNumber {
    static int sum(int n){
        int sumSquares = 0;
        while(n != 0) {
            int rem = n % 10;
            sumSquares += Math.pow(rem, 2);
            n /= 10;
        }
        return sumSquares;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        while (n != 1 && n != 4) {
            n = sum(n);
        }
        if (n == 1) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
