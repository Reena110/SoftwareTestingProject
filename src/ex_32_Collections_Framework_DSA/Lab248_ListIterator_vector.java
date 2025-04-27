package ex_32_Collections_Framework_DSA;

import java.util.ListIterator;
import java.util.Vector;

public class Lab248_ListIterator_vector
{
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Item 1");
        vector.add("Item 2");
        vector.add("Item 3");
        vector.add("Item 4");
        vector.add("Item 5");
        ListIterator listIterator = vector.listIterator();
        while (listIterator.hasNext())
        {
            System.out.println(listIterator.next());
        }
        System.out.println("________");
        while (listIterator.hasPrevious())
        {
            System.out.println(listIterator.previous());
        }
    }
}
