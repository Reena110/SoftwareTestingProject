package ex_30_Exception;

public class Lab122_divided_by_zero
{
    public static void main(String[] args) {
        try
        {
            int a = 10, b=0;
            int result = a/b;
            System.out.println("Result :" +result);

        }
        catch (ArithmeticException e)
        {
            System.out.println("Cannot divided by zero");
        }
    }
}
