package ex_11_While_Loop;

import java.util.Scanner;

public class Lab78_While_Factorial
{
    public static void main(String[] args) {
        // Facorial Program
        Scanner sc= new Scanner(System.in);
        System.out.println("Welcome to Factorial \n Enter the number you want for factorial");
        int n = sc.nextInt();
        int factorial =1;
        if(n<=0)
        {
            System.out.println(factorial);
        }
        else {
            for(int i = 1;i<=n;i++)
            {
                factorial = factorial *i;
            }
        }
        System.out.println("Factorial is -> "+ factorial);
    }
}
