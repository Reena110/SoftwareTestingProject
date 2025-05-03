package ex_30_Exception;

import java.util.Scanner;

public class Lab125_number_format_exception
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String value");
        String name = sc.nextLine();
        try
        {
            int n = Integer.parseInt(name);
            System.out.println(" you entered the number" +n);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Invalid number format, Please enter digit only");
        }
    }
}
