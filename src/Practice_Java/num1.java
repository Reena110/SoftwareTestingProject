package Practice_Java;

import java.util.Scanner;

public class num1
{
    public static void main(String args[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
         n = sc.nextInt();
        int rev =0;
                while(n!=0)
                {
                 int d = n%10;
                 rev = rev *10+d;
                 n =n/10;
                }
        System.out.println("Reverse of the number = " +rev);
                }

    }