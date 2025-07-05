package Practice_Java;

import java.util.Scanner;

public class reverse_buffer_string
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to reverse ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(); // Create an empty StringBuilder object
        sb.append(str); // Add your input string to it
        sb.reverse();  // Directly reverse it using built-in method
        System.out.println(sb); // Print the reversed result
        sc.close();
    }
}
