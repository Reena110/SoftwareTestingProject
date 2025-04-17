package ex_05_TypeCasting;

public class Lab46_TypeCasting_Narrowing
{
    public static void main(String[] args) {
        int val = 200;
        //byte b = val; //Invalid - Narrowing - Implicit Casting is not allowed
        byte b2 = (byte) val; // Valid Narrowing Explicit casting - Allowed
        //Data Loss
        System.out.println(b2);
    }
}
