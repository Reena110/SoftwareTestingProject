package Practice_Java;

import java.util.Scanner;

public class reverseStr
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter name");
        String str= sc.nextLine();
        for(int i=str.length()-1;i>=0;i--)
        {
            System.out.print(str.charAt(i));
        }

    }
}