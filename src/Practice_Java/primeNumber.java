package Practice_Java;

import java.util.Scanner;

public class primeNumber {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        n = sc.nextInt();
        int count =0;
        for (int i = 1; i <= n ; i++) {
            if (n % i == 0)
            {
                count++;

            }
        }
        if(count ==2)
        {
            System.out.println(n + "is a prime number ");
        }
        else
        {
            System.out.println(n + "is not a Prime number");
        }
        sc.close();
    }
}