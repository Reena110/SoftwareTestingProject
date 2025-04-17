package ex_06_Ternary_Operator;

public class Lab49_Interview_Ready_Ques
{
    public static void main(String[] args) {
        //Nested ternary operator
        //result = condition1 ? expression1 :(condition2 ? expression2 :express)

        int n = 25;
        String result = (n>10) ? (n>20 ? "N>20" : "N<20") : "B";
        System.out.println(result);
    }
}
