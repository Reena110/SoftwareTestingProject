package ex_32_Collections_Framework_DSA;

import java.util.*;

public class Lab254_HS_LHS_TS
{
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        // Hashing Mechanism to store the element
        // No order
        // No duplicates

        hs.add("Reena");
        hs.add("Singh");
        hs.add("Ram");
        hs.add("Ram");
        //hs.add(123);
        hs.add("null");
        //hs.add("null");
        System.out.println(hs);
        System.out.println("_____________");

//        Iterator iterator = hs.iterator();
//        {
//            while(iterator.hasNext())
//            {
//                System.out.println(iterator.hasNext());
//            }
//        }
        System.out.println("_____________");

        Set lhs = new LinkedHashSet();
        // Linked Hasset is a mechanism to store the element
        // order will maintain, no duplicates

        lhs.add("Apple");
        lhs.add("Orange");
        lhs.add("Banana");
        lhs.add("WaterMelon");
        lhs.add("WaterMelon");
        lhs.add("null");
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Apple"));
        System.out.println(lhs.size());


        System.out.println("_____________");

        Set ts = new TreeSet();
        // Black and red mechanism to store the element
        // Order will maintain, Natural sorting is done
        // Natural sorting means - ASCII values

        ts.add("Dapple");
        ts.add("Apple");
        ts.add("Orange");
        ts.add("Coco");

        // ts.add("null "); not allowed null
        // ts.add(123); interger not allowed
        System.out.println(ts);

        System.out.println("_______For each loop________");

        for (Object o:ts)
        {
            System.out.println(o);
        }



    }
}
