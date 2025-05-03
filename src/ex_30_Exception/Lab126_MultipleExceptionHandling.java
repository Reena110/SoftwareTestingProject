package ex_30_Exception;

import java.util.Scanner;

public class Lab126_MultipleExceptionHandling
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = {12,41,23};

        System.out.println("Enter the index of the number ");
        int index = sc.nextInt();
        System.out.println("Enter the divisor number");
        int divisor = sc.nextInt();
        try
        {
            int result = n[index]/divisor;
            System.out.println("Result" +result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error : Cannot divided by zero");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid Index ! Please enter the index between 0 to 2");
        }
    }
}
