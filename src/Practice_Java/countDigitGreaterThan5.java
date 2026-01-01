package Practice_Java;

import java.awt.desktop.SystemSleepEvent;

public class countDigitGreaterThan5
{
    public static void main(String args[])
    {
        int n =139678,count=0;
        while (n>0)
        {
            int d=n%10;
            if(d>5)
            {
                count++;
            }
            n=n/10;
            }
        System.out.println("Count digit greater than 5 =" +count);
    }
}
