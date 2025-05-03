package ex_30_Exception;

public class Lab120_exceptionHandling
{
    public static void checkEligibility(int age) throws ArithmeticException
    {
        if(age<18)
        {
            throw new ArithmeticException("Not eligible to Vote");
        }
        else {
            System.out.println("Yor are eligible to vote");
        }
    }
    public static void main(String args[])
    {
        int[] ages = {25,15,30};
        for(int age :ages)
        {
            try
            {
                System.out.println("Checking age :" +age);
                checkEligibility(age);
            }
            catch (ArithmeticException e)
            {
                System.out.println("Exception caught :" +e.getMessage());
            }
            finally {
                System.out.println("Check completed for age : " +age);
                System.out.println("____________________________");
            }
        }
    }

}







