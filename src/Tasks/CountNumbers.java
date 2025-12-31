package Tasks;

import java.io.IOException;

public class CountNumbers
{
    public static void main(String args[])throws IOException
    {
        int n=12345;
        int count =0;
        while (n>0)
        {
            count++;
            n=n/10;
        }
            System.out.println("Counting of digits =" +count);
    }
}
