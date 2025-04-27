package ex_32_Collections_Framework_DSA;

import java.util.ArrayList;
import java.util.List;

public class Lab249_Nested_Arraylist
{
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Banana");
        System.out.println("Fruits" +fruits);


        List fruits2 = new ArrayList<>();
        fruits2.add("Orange");
        fruits2.add("Apple");
        fruits2.add("Banana");
        System.out.println("Fruits" +fruits2);

        List Vegetables = new ArrayList<>();
        Vegetables.add("Tomato");
        Vegetables.add("Potato");
        Vegetables.add("Brinjal");
        System.out.println("Fruits" +Vegetables);

        List all_fruits = new ArrayList<>();
        all_fruits.add("Tomato");
        all_fruits.add("Potato");
        all_fruits.add("Orange");
        System.out.println(all_fruits);
        System.out.println(all_fruits.get(2));



    }
}
