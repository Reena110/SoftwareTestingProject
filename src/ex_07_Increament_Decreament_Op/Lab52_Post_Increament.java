package ex_07_Increament_Decreament_Op;

public class Lab52_Post_Increament
{
    public static void main(String[] args) {
        int a =10;
        System.out.println(a++ + ++a);
        System.out.println(a);

        //a++ --> A -> Exp ->10, a -> 11
        // +
        // ++a -> B -> ExpB -> 12, a ->12
        //A+B -> ExpA + ExpB -> 10+12 -> 22, a->12
    }
}
