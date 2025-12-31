package Practice_Java;

import java.util.ArrayList;

public class list_removeValue
{
    public static void main(String args[])
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("its");
        list.add("My");
        list.add("ArrayList Programs");
        list.remove("its");
        System.out.println(list);
    }
}
