package JavaClass;

import java.util.Scanner;

public class ReverseStringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        System.out.println("Original String Length: " + s.length());
        String rev = "";
        for(int i = s.length() - 1; i >= 0; i--){
            rev += s.charAt(i);
        }
        System.out.println("Reversed String: " + rev);
        System.out.println("Reversed String Length: " + rev.length());
    }
}

