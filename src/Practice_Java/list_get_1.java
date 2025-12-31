package Practice_Java;

import java.util.ArrayList;

public class list_get_1
{
    public static void main(String args[])
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("Reena");
        list.add("is");
        list.add("Software Engineer");
        System.out.println(list.get(1));
        System.out.println(list);
    }
}
