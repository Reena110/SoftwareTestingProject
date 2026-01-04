package Practice_Java;

public class countUppercaseLetters
{
    public static void main(String args[])
    {
        String str = "REEna";
        int count =0;
        for(int i =0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch>='A' && ch<='Z')
            {
                count++;
            }
        }
        System.out.println("Count the Upper case letters in the String =" +count);

    }
}
