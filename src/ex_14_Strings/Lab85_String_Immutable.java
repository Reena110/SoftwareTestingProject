package ex_14_Strings;

public class Lab85_String_Immutable
{
    public static void main(String[] args) {
        String s1 = "Hello";
        s1 = s1.concat("   World"); // Concat add the values, Merge the value
        System.out.println(s1);
    }
}
