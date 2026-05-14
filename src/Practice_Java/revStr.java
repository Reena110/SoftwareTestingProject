package Practice_Java;

public class revStr {
    public static void main(String args[])
    {
        String str ="Reena";
        String  reverse ="";
        for(int i=str.length()-1;i>=0;i--)
        {
            char ch = str.charAt(i);
            reverse=reverse +ch;
        }
        System.out.println("Reverse of the String =" + reverse);
    }
}
