package Practice_Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class maximumElementArrayList {
    public static void main(String args[])
    {
        List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,60,50));
        int max= list.get(0);
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)> max)
            {
                max=list.get(i);
            }
        }
        System.out.println("Maximum Number =" +max);
    }
}
