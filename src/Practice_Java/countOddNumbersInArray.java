package Practice_Java;

public class countOddNumbersInArray {
    public static void main(String[] args)
    {
        int arr[] ={10,20,30,45,25};
        int count =0;
        for(int i=0;i<arr.length;i++)
        {

            if(arr[i]%2 != 0)
            {
                count++;
            }

        }
        System.out.println("Odd numbers count ="+count);

    }
}
