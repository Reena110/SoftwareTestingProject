package Practice_Java;

public class countLowercaseLetters
{
    public static void main(String args[])
    {
        String str = "reena";
        int count =0;
        for(int i =0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z')
            {
                count++;
            }
        }
        System.out.println("Count lower case letter from the string =" +count);
    }
}
