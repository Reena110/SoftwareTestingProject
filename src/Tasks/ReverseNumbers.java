package Tasks;

import java.io.IOException;

public class ReverseNumbers
{
    public static void main(String args[]) throws IOException
    {
        int n=12345,d;
        int r=0;
        while (n>0) {
            d = n % 10;
            r= r * 10 + d;
            n=n/10;
        }
            System.out.println("Reverse of the Number =" +r);
        }
    }

