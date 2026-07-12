package Java8Programs;

import java.util.Arrays;
import java.util.List;

public class sortEmployeeName {
    public static void main(String args[])
    {
        List<String> list = Arrays.asList("Reena", "Rohit","Suman", "HareRam");
        list.stream().sorted().forEach(System.out::println);
        }
    }

