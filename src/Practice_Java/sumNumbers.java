package Practice_Java;

import java.io.IOException;

public class sumNumbers
{
    public static void main(String args[])throws IOException
    {
        int n =1234, r=0,sum=0;
        while (n>0)
        {
           int digit=n%10;
             sum=sum+digit;
             n=n/10;
                    }
        System.out.println("Sum of the Numbers ="+sum);
    }
}

