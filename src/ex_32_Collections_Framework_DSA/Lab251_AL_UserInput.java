package ex_32_Collections_Framework_DSA;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab251_AL_UserInput
{
    public static void main(String[] args) {


        // Multiple input from  the users and store them in separate
        // names, ages - store them
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();

        String continueInput = "Y"; // Continue variable for input loop
        while (continueInput.equalsIgnoreCase("Y"))
        {
            System.out.println("Enter the name");
            String name= sc.next();
            names.add(name);

            System.out.println("Enter age ");
            Integer age = sc.nextInt();
            ages.add(age);

            sc.nextLine();
            System.out.println("Do you want to enter another record (Y/N)");
            continueInput= sc.nextLine();
        }
        for(Object o1 :names)
        {
            System.out.println(o1);
        }
        for(Object o2:ages)
        {
            System.out.println(o2);
        }
        sc.close();

    }
}
