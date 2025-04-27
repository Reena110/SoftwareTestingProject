package ex_31_Generics;

public class Lab236_generics_concept
{
    public static void main(String[] args) {
        temp_sum(3,2);
        temp_sum(2.34,5.43);
        temp_sum("Reena","Ram");
    }
    static int temp_sum(int a,int b)
    {
        return  a+b;
    }
    static double temp_sum(double a,double b)
    {
        return a+b;
    }
    static String temp_sum(String a, String b)
    {
        return a+b;
    }

}
