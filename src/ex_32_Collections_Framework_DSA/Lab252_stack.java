package ex_32_Collections_Framework_DSA;

import java.util.Stack;

public class Lab252_stack
{
    public static void main(String[] args) {
        // Stack
        // Last In -> First Out(LIFO)

        Stack s = new Stack();
        s.push("Reena");
        s.push("Shobha");
        s.push("Ram");
        s.push("Anjalii");
        System.out.println(s);

        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.empty());
        System.out.println(s.size());


    }
}
