package Practice_Java;

public class countEvenNumbersInArray {
    public static void main(String args[])
    {
        int arr[]={1,2,5,6,3,8};
        int count = 0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                System.out.print(arr[i] +" ");
                count++;
            }
        }
        System.out.println("Even numbers=" +count);
    }
}
