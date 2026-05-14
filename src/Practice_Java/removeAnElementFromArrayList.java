package Practice_Java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class removeAnElementFromArrayList {
    public static void main(String args[])
    {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.remove(1);
        System.out.println(list);

    }
}
