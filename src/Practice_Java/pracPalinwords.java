package Practice_Java;

import java.util.Scanner;

public class pracPalinwords
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Palindrome word");
        String str = sc.nextLine();
        String rev = "";
        for(int i =str.length()-1;i>=0;i--)
        {
            rev += str.charAt(i);
        }
        if(str.equals(rev))
        {
            System.out.println("Word is palindrome");
        }
        else
        {
            System.out.println("Word is not palindrome");
        }
    }
}
