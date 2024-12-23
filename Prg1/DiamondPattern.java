package Prg1;

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        sc.close();

        // Upper part of the diamond (including the middle row)
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) { // Print leading spaces
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) { // Print stars and spaces
                if (j == 1 || j == (2 * i - 1)) {  // Print stars only at the borders
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Lower part of the diamond (excluding the middle row)
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) { // Print leading spaces
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) { // Print stars and spaces
                if (j == 1 || j == (2 * i - 1)) {  // Print stars only at the borders
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
