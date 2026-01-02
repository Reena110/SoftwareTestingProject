package Practice_Java;

public class findConsonent
{
    public static void main(String args[])
    {
        String str="Reena";
        int count =0;
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if((ch>='a' && ch<= 'z') || (ch>='A' && ch<='Z'))
            {
                if(!(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'))
                {
                    count++;
                }
            }
        }
        System.out.println("Number of Consonent in this String =" +count);
    }
}
