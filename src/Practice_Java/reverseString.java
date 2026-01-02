package Practice_Java;

public class reverseString
{
    public static void main(String args[])
    {
        String str = "Reena";
        String rev ="";
        for(int i=str.length()-1;i>=0;i--)
        {
            char ch= str.charAt(i);
            rev = rev +ch;
        }
        System.out.println("Reverse of the String =" +rev);
    }
}
