package Practice_Java;

public class averageNumberOfArrayValues {
    public static void main(String args[])
    {
        int arr[] = {1,3,4};
        int sum =0;
        double avg =0;
        for(int i=1;i<arr.length;i++)
        {
             sum =sum+arr[i];
              }
        avg = (double)sum/arr.length;
        System.out.println("Average of the numbers =" +avg);
    }
}
