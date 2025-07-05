package Practice_Java;

// WAP in java to print the reverse of the String

import java.util.Scanner;

public class Reverse_String {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to reverse");
        String str = sc.nextLine();
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }

        sc.close();

    }
}