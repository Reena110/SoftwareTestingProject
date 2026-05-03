package Practice_Java;

import java.util.Scanner;

public class reverseWordsInString
{
    public static void main(String args[]) {
        String str = "Reena is a Software Engineer";
        String words[] =str.split(" ");
        for(int j=0;j<words.length;j++)
        {
            String word = words[j];
            for(int i =word.length()-1;i>=0;i--)
            {
                System.out.print(word.charAt(i));
            }
            System.out.print(" ");
        }
    }
    }