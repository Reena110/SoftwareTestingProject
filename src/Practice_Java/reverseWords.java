package Practice_Java;

import java.util.Scanner;

public class reverseWords {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String words");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        for(String word :words)
        {
            for(int i=word.length()-1;i>=0;i--)
            {
                System.out.print(word.charAt(i));
            }
            System.out.print(" ");
        }
        sc.close();
    }
}



