package Practice_Java;

public class SummetionOfNumbers
{
    public static void main(String args[])
    {
        int n=10777888, sum=0;
        while (n>0)
        {
            int d=n%10;
            sum= sum+d;
            n=n/10;
            }
        System.out.println("Sum of the Numbers =" +sum);
    }
}
