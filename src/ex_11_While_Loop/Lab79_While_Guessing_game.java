package ex_11_While_Loop;

import java.util.Random;
import java.util.Scanner;

public class Lab79_While_Guessing_game
{
    public static void main(String[] args) {
        // Guess a number 1 to 100

        Random random  = new Random();
        int numberToGuess = random.nextInt(100)+1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int guess;
        int attempts =0;
        while (true)
        {
         guess = sc.nextInt();
         attempts++;
         if (guess < numberToGuess)
         {
             System.out.println("To Low, Try again");
         }
         else if (guess > numberToGuess)
         {
             System.out.println("To high Try again");
         }
         else
         {
             System.out.println("Correct ! you guessed it in" +attempts+ "attempts");
             break;
         }
        }

    }
}
