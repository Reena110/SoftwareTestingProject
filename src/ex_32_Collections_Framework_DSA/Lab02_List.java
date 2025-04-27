package ex_32_Collections_Framework_DSA;

import java.util.ArrayList;

public class Lab02_List
{
    public static void main(String[] args) {
        ArrayList<String> movie = new ArrayList<>();
        movie.add("Lee");
        movie.add("Black water");
        movie.add("Frontage");
        System.out.println("Movie =" +movie);
        movie.remove("Lee");
        System.out.println("After removing 1 movie name = "+movie);
        System.out.println("Total movie name in the list =" +movie.size());
    }
}
