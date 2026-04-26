package Practice_Java;

import java.util.Scanner;

public class searchElement
{
    public static void main(String args[])
    {
        int arr[]={1,2,4,5,6,2,7,8,5,};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to search :");
        int search = sc.nextInt();
        int count =0;
        System.out.print("Indexes: ");
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==search)
            {
                System.out.println("Element found at index: " +i);
                count++;
            }
        }
        System.out.println();
        if(count>0)
        {
            System.out.println("Element found" +count +   "times");
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}
