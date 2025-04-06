package ex_17_OOPs;

public class Lab03_AllTypesOfMethods
{
    public void tester()
    {
        System.out.println("Without parameter and without Return type");
    }
    public int developer()
    {

        int A=10, B=2,c=A*B;
        System.out.println("Without parameter and with return type" +c);
        return c;
    }
    public void devops(int D, int K)
    {
     float sum = D+K;
        System.out.println("Sum of the statement =" +sum);
    }
   public int admin_Id(int d)
   {
       System.out.println("Admin id");
       return d;
   }

    public static void main(String[] args) {
        Lab03_AllTypesOfMethods s1= new Lab03_AllTypesOfMethods();
        s1.tester();
        s1.devops(10,2);
        s1.admin_Id(1235);
        s1.developer();
    }

}
