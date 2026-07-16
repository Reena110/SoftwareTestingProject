package Practice_Java;

public class reverseEachWord16july {
    public static void main(String args[])
    {
        String str =" Selenium Webdriver with Concepts";
        String words[] = str.split(" ");
        for(String word : words)
        {
            for(int i=word.length()-1;i>=0;i--)
            {
                System.out.print(word.charAt(i));
            }
            System.out.print(" ");
        }

    }
}
