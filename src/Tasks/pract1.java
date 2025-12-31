package Tasks;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

public class pract1
{
    public static void main(String args[])throws IOException
    {
        int evenCount =0, oddCount=0;

        for(int i =1;i<=100;i++)
        {
            if(i%2==0)
            {
                System.out.println("Even Numbers =" +i);
                evenCount++;

            }
            else
            {
                System.out.println("Odd Numbers=" +i);
                oddCount++;

            }

        }
         System.out.println("Total Odd Numbers="+oddCount);
        System.out.println("Total Even Numbers="+evenCount);
    }


}
