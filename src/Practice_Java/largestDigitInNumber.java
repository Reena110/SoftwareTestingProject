package Practice_Java;

public class largestDigitInNumber
{
    public static void main(String args[])
    {
        int n=2000781, max=0;
        while (n>0)
        {
           int d=n%10;
           if(d>max)
           {
               max=d;
           }
           n=n/10;

        }
        System.out.println("Largest Digit of Numbers=" +max);
    }
}
