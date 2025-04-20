package ex_10_For_Loop;

public class Lab71_for_loop_even_odd
{
    public static void main(String[] args) {
        // to find the even and odd number 1 to 50 using for loop

        for(int i=0;i<=50;i++)
        {
            if(i%2==0)
            {
                System.out.println("Even -->" +i);
            }
//            else
//            {
//                System.out.println("Odd --> " +i);
//            }
        }
    }
}
