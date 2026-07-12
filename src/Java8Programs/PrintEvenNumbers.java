package Java8Programs;

import java.util.Arrays;
import java.util.List;

public class PrintEvenNumbers {
    public static void main(String args[])
    {
        List<Integer> list = Arrays.asList(20,10,3,1,0,5,40);
        list.stream().filter(n-> n%2==0).forEach(System.out::println);
    }
}
