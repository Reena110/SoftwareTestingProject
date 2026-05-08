package Practice_Java;

import java.util.HashSet;
import java.util.Set;

public class findDuplicates {
    public static void main(String args[])
    {
        int arr[] ={1,2,3,2,4,5,1};
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            if(set.add(arr[i])==false)
            {
                System.out.println("Duplicates= "+arr[i]);
            }
        }
    }
}
