package JavaClass;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        if(isPalindrome(str.toLowerCase()))
            System.out.println(str + " is Palindrome");
        else
            System.out.println(str + " is not Palindrome");
    }

    public static boolean isPalindrome(String str) {
        int firstIndex = 0;
        int lastIndex = str.length() - 1;

        while (firstIndex < lastIndex) {
            if (str.charAt(firstIndex) != str.charAt(lastIndex)) {
                return false;
            }
            firstIndex++;
            lastIndex--;
        }
        return true;
    }
}