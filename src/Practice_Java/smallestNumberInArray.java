package Practice_Java;

public class smallestNumberInArray {
    public static void main(String args[])
    {
        int arr[]={1,2,4,9,0,-1};
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("Smallest Number =" +min);
    }
}
