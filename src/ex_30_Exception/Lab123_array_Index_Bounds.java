package ex_30_Exception;

public class Lab123_array_Index_Bounds
{
    public static void main(String[] args) {

        try
        {
            int[] n = {1,2,3};
            System.out.println(n[5]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("You tried to access an invalid array index");
        }
    }
}
