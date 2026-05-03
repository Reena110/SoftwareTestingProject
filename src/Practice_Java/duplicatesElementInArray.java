package Practice_Java;

public class duplicatesElementInArray
{
    public static void main(String args[])
    {
        int arr[]={1,2,2,3,4,1};
        int max =arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
       System.out.println("Duplicates number =" +max);

    }
}
