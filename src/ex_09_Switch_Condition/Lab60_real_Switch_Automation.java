package ex_09_Switch_Condition;

import java.util.Scanner;

public class Lab60_real_Switch_Automation
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser = sc.next();

        switch (browser)
        {
            case "chrome":
                System.out.println("Starting the chrome");
                System.out.println("______");
                System.out.println("TC1");
                System.out.println("TC2");
                break;

            case "Firefox":
                System.out.println("Starting the firefox browser");
                break;
            case "edge" :
                System.out.println("Execute the edge code");
            default:
                System.out.println("I have no idea which browser is this");
                break;

        }
    }
}
