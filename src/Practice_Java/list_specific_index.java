package Practice_Java;

import java.util.ArrayList;

public class list_specific_index
{
    public static void main(String args[])
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("required");
        list.add(1, "Selenium");
        System.out.println(list);
    }
}
