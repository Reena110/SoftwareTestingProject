package ex_07_Increament_Decreament_Op;

public class Lab53_Post_Pre_Increament
{
    public static void main(String[] args) {
        int a =10;
        System.out.println(++a + ++a);
        System.out.println(a);

        //++a -> A -> ExpA -> 11, a->11
        //+
        // ++a -> B -> ExpB ->12, a->12
        //ExpA +ExpB ->11+12->23, a->12

    }
}
