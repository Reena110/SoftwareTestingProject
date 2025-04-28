package ex_32_Collections_Framework_DSA;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab253_Set_Exmaple
{
    public static void main(String[] args) {
        Set hs = new HashSet();
        Set hl = new LinkedHashSet();
        Set ts = new TreeSet();
        hs.add("Reena"); // In Set duplicates are not allowed
        hs.add("Reena");
        System.out.println(hs);

    }

}
