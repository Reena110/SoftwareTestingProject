package ex_32_Collections_Framework_DSA;

import java.util.ArrayList;
import java.util.List;

public class iteratateList
{
    public static void main(String args[])
    {
        List<String> list = new ArrayList<>();
        list.add("Reena");
        list.add("Singh");
        for(String name:list) {
            System.out.println(name);
            list.remove("Singh");
        }
    }
}
