package ex_32_Collections_Framework_DSA;
import java.util.List;
import java.util.ArrayList;

public class Lab04_Arraylist
{
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("3");
        list.add("5");
        list.add(true);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("1"));
        System.out.println(list.indexOf("3"));
        System.out.println(list.lastIndexOf("3"));
        System.out.println(list);

        System.out.println("__________");
        for(int i =0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }

list.clear();
        System.out.println(list);
    }
}
