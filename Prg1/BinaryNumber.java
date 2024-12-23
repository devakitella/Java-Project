package Prg1;

import java.util.Scanner;

public class BinaryNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int a = n;
        String binaryNumber = "";
        if(n == 0)
            System.out.println("Number should be greater than '0'");
        while(n > 0){
            binaryNumber = (n % 2) + binaryNumber;
            n /= 2;
        }
        System.out.println("Binary Representation of " + a + " is: " + binaryNumber);
    }
}
