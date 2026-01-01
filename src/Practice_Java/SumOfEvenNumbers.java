package Practice_Java;

public class SumOfEvenNumbers
{
    public static void main(String args[])
    {
        int n=123456, sum =0;
        while (n>0)
        {
            int d = n%10;
            if(d%2==0)
            {
                sum =sum+d;

            }
            n=n/10;
        }
        System.out.println("Sum of Even numbers =" +sum);
    }
}
