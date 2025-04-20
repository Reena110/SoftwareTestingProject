package ex_08_If_Else_Condition;
import java.util.Scanner;

public class Lab57_else_if
{
    public static void main(String[] args) {

        //How to make user input
        // 1) CLI Option
        // 2) Scanner class
       // int age = 18;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if(age>18)
        {
            System.out.println("You can vote");
        }
        else {
            System.out.println("You can't vote");
        }

    }
}
