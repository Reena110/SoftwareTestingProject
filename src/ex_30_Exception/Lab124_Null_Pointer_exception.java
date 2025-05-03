package ex_30_Exception;

public class Lab124_Null_Pointer_exception
{
    public static void main(String[] args) {
        String s = null;
        try
        {
            System.out.println(s.trim());
        } catch (NullPointerException e) {
            System.out.println("Oops ! you are trying to print null value");
        }
    }
}
