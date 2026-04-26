package Practice_Java;

public class sumOfArrayElement
{
    public static void main(String args[])
    {
        int arr[]={1,2,6,3,4};
        int sum =0;
        for(int i =0;i<arr.length;i++)
        {
            sum =sum+arr[i];
        }
        System.out.println("Sum of the arrays =" +sum);
    }
}
