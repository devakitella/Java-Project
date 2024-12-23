package Assignment;

import java.util.Scanner;

public class MethodsAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("With return type, with arguments");
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        ReverseNumber rn = new ReverseNumber();
        System.out.println("Reverse of a number: " + rn.Reverse(num));
        System.out.println();
        rn.ReverseNum(num);
        System.out.println();
        rn.Reverse();
        System.out.println();
        System.out.println("Reverse of a number: " + rn.ReverseNum());
    }
}
