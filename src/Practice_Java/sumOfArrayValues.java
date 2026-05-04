package Practice_Java;

public class sumOfArrayValues {
    public static void main(String args[])
    {
        int arr[] = {1,2,4,2,3,5};
        int sum =0;
         for(int i =0;i<arr.length;i++)
        {
            sum =sum+arr[i];

        }
        System.out.println("Sum of the array values =" +sum);
    }
}
