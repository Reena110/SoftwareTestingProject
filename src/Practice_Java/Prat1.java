package Practice_Java;

import java.util.Scanner;

// WAP in java give an array {1,3,3,4,5,6,6,7,8,9,9} when user enters a search element, the program should display the index number
//where the element is found. If the element is repeated it should display all those indices. If it is not present in the given array program should display
//element not found

public class Prat1 {
    public static void main(String args[])
    {
        int arr[] = {1,3,3,4,5,6,6,7,8,9,9};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element to search : ");
        int search = sc.nextInt();
        boolean found = false;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==search)
            {
                System.out.println("Element found at index: " +i);
                found =true;
            }
        }
        if(!found)
        {
            System.out.println("Element not found");
        }
    }
}
