package Practice_Java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class removeDuplicatesCollection {
    public static void main(String args[])
    {
        List<Integer> list = Arrays.asList(1,2,1,4,5,4,5);
        Set<Integer> set = new HashSet<>(list);
        System.out.println("After removing duplicates =" +set);
    }
}
