package ex_33_Array;

public class eleExist {
    public static void main(String args[])
    {
        int arr[] ={1,2,5,8};
        int key =8;
        boolean found = false;
        for(int num :arr)
        {
            if(num==key)
            {
                found =true;
            }
        }
        System.out.println(found);
    }
}
