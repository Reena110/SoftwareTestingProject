package Practice_Java;

import java.util.ArrayList;
import java.util.List;

public class searchElementExistingOrNot {
    public static void main(String args[])
    {
        List<String> list = new ArrayList<>();
        list.add("Selenium");
        list.add("java");
        list.add("Program");
        if(list.contains("Selenium"))
        {
            System.out.println("Element Found");
        }
        else
        {
            System.out.println("Element not found");
        }

    }
}
