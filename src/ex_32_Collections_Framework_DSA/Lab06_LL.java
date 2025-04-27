package ex_32_Collections_Framework_DSA;
import java.util.List;
import java.util.LinkedList;

public class Lab06_LL
{
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList();
        animals.add("Dog");
        animals.add("Lion");
        animals.addFirst("Elephant");
        animals.addLast("Cock");
        System.out.println("LinkedList :" +animals.getFirst());
        System.out.println("LinkedList :" +animals.getLast());
        animals.removeFirst();
        animals.removeLast();
        System.out.println("Linkedlist after removal :" +animals);
        System.out.println("Size of LinkedList :" +animals.size());

    }
}
