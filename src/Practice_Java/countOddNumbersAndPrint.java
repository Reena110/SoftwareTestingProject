package Practice_Java;

public class countOddNumbersAndPrint {
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,6,8,9,5};
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                System.out.print(arr[i] +" ");
                count++;
                 }
        }
        System.out.println("Odd numebers=" +count);
    }
}
