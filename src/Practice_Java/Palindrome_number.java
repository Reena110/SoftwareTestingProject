package Practice_Java;

public class Palindrome_number
{
    public static void main(String args[])
    {
        int num = 121;
        int org = num;
        int rev =0;
        while(num !=0)
        {
            int digit = num%10;
            rev = rev *10+digit;
            num =num/10;
        }
        if(org ==rev)
        {
            System.out.println(org + "is a Palindrome number.");
        }
        else
        {
            System.out.println(org + "is not a Palindrome number");
        }
    }
}
