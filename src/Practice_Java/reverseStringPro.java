package Practice_Java;

public class reverseStringPro {
    public static void main(String args[])
    {
        String str ="Reena";
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
          char c =str.charAt(i);
          rev = rev+c;
        }
        System.out.println(rev);
    }
}
