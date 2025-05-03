package Tasks;

import java.util.Scanner;

public class Task19_UserInput
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.nextLine();
        System.out.println("Enter Age");
        int age = sc.nextInt();
        System.out.println("Hello !" +name +"Your age is " +age);
        sc.close();
    }
}
