package Practice_Java;

public class countChars
{
    public static void main(String args[])
    {
        String str ="Automation";
        int count =0;
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            count++;
        }
        System.out.println("Count the characters of the string =" +count);
    }
}
