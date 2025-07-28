package Practice_Java;

import java.util.Scanner;

public class pracPalindrome
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter palindrome number");
        int n = sc.nextInt();
        int org = n;
        int rev =0;
        while(n!=0)
        {
            int d = n%10;
            rev = rev *10+d;
            n = n/10;

        }
        if (org ==rev)
        {
            System.out.println("Number is Palindrome");
        }
        else
        {
            System.out.println("Number is not Palindrome");
        }

    }
}
