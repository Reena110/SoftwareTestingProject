package Tasks;

import java.util.HashMap;

public class StoreEmpIdNameUsingMap {
    public static void main(String args[])
    {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(101,"Reena");
        map.put(102,"HareRam");
        map.put(103,"Babi");
        System.out.println(map);
    }
}
