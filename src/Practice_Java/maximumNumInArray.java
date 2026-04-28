package Practice_Java;

public class maximumNumInArray
{
    public static void main(String args[])
    {
        int arr[]={7,4,2,3,1,0};
        int max = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("Maximum Number =" +max);
    }
}
