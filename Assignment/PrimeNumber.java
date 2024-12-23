package Assignment;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isPrime = primeOrNot(num);
        if(isPrime)
            System.out.println(num + " is Prime Number");
        else System.out.println(num + " is not Prime Number");
    }
    public static boolean primeOrNot(int number) {
        if(number <= 1)
            return false;
        for(int i = 2; i < number; i++) {
            if(number % i == 0)
                return false;
        }
        return true;
    }
}
