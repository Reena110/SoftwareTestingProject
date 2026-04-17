package ex_33_Array;

public class sumArray {
    public static void main(String args[])
    {
        int arr[] = {1,2,6,4};
        int sum =0;
        for(int num : arr)
        {
            sum = sum +num;
        }
        System.out.println(sum);
    }
}
