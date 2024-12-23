package JavaClass;

import java.util.Scanner;

public class UniqueChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String name = sc.nextLine();
        for (int i = 0; i < name.length(); i++)
        {
            int count = 0;
            for (int j = 0; j < name.length(); j++)
            {
                if (name.charAt(i) == name.charAt(j) && i != j)
                {
                    count = 1;
                    break;
                }
            }
            if (count == 0)
                System.out.print(name.charAt(i));
        }
    }
}
