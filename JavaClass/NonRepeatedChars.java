package JavaClass;

import java.util.Scanner;

public class NonRepeatedChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String name = sc.nextLine();
        for (int i = 0; i < name.length(); i++)
        {
            Boolean flag = false;
            for (int j = 0; j < name.length(); j++)
            {
                if (name.charAt(i) == name.charAt(j) && i != j)
                {
                    flag = true;
                    break;
                }
            }
            if (flag)
                System.out.print(name.charAt(i));
        }
    }
}
