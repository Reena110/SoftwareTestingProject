package Practice_Java;

import java.util.Scanner;


public class Reverse_string2
{
    public static void main(String[] args) {
        String str = "Reena";
        for(int i = str.length()-1;i>=0;i--)
        {
            System.out.print(str.charAt(i));
        }

    }
}
