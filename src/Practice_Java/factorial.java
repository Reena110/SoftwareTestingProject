package Practice_Java;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number");
            int n = sc.nextInt();
            int f = 1;
            for (int i = 1; i <= n; i++) {
                f = f * i;
                System.out.println("Factorial =" + f);

            }
        }
    }
}