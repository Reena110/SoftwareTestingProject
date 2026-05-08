package Practice_Java;

import java.util.Arrays;
import java.util.List;

public class reverseArrayList {
    public static void main(String args[])
    {
        int arr[]={10,20,30,40};
        int rev=0;
        List<Integer> list = Arrays.asList(10,20,30,40);
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print("Reverse of the ArrayList ="+arr[i]);
        }


    }
}
