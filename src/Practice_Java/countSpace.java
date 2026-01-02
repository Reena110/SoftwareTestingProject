package Practice_Java;

public class countSpace
{
    public static void main(String args[])
    {
        String str="Reena is here";
        String st=" ";

        int count =0;
        for(int i=0;i<str.length();i++)
        {

            char ch = str.charAt(i);
            if(ch== ' ') {
                count++;
            }
        }
        System.out.println("Space between the string =" +count);
    }
}
