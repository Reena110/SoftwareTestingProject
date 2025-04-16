package ex_02_Java_Basic_2;

public class Lab20_printf
{
    public static void main(String[] args) {
        int a = 10;
        System.out.printf("you variable is %d", a);
        //%d  --> int, byte, long, short - data Type
        //%s --> String
        //%f --> float, double
        //%b --> boolean
        int b =20;
        System.out.println("____");
        System.out.printf("%d +%d",a,b);
    }
}
