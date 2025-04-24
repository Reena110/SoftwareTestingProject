package Tasks;

class Calculator
{
    int add(int a,int b)
    {
        return a+b;
    }
    double add(double a, double b)
    {
        return a +b;
    }
    int add(int a, int b,int c)
    {
        return a+b+c;
    }
}

public class Task16_Method_Overloading
{
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println("Add 2 int : "+cal.add(10,30));
        System.out.println("Add 2 double" +cal.add(5.5,6.2));
        System.out.println("Add 3 int :" + cal.add(1,2,3));

    }
}
