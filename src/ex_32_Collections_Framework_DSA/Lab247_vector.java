package ex_32_Collections_Framework_DSA;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Lab247_vector
{
    public static void main(String[] args) {
        Vector v = new Vector();
        Vector v1 = new Vector(10);
        v.add(10);
        v.add("Reena");
        v.add("Ram");
        System.out.println(v);
        v.remove("Reena");
        System.out.println(v.contains("Ram"));
        System.out.println(v);
        System.out.println("_______Normal For loop");
        for(int i =0;i<v.size();i++)
        {
            System.out.println(v.get(i));
        }
        System.out.println("____For Each Loop");
        for(Object o:v)
        {
            System.out.println(o);
        }
        System.out.println("_____Itretor_____");
        Iterator iterator = v.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        System.out.println("___Enumaration____");
        Enumeration<Object> enumeration =v.elements();
        while(enumeration.hasMoreElements())
        {
            System.out.println(enumeration.nextElement());
        }
        System.out.println("ListIterator");
        ListIterator listIterator = v.listIterator();
        while(listIterator.hasNext())
        {
            System.out.println(listIterator.next());
        }
        System.out.println("Backword Priniting");
        while(listIterator.hasPrevious())
        {
            System.out.println(listIterator.hasPrevious());
        }
    }
}
