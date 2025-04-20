package ex_14_Strings;

public class Lab89_String_Function
{
    public static void main(String[] args) {
        String name = "Reena";
        System.out.println(name.length());
        System.out.println(name.charAt(3));

       // Concat
        System.out.println(name.concat("Singh"));
        // Contains
        System.out.println(name.contains("om"));
         // Equal
        System.out.println(name.equals("Reena"));
        //EqualIgnoreCase
        System.out.println(name.equalsIgnoreCase("Reena"));
        //Checking Index
        System.out.println(name.indexOf('e'));
        // length
        System.out.println(name.length());
        // Replaced
        System.out.println(name.replace('n', 'N'));

        // Split

        String name1 = "reena123@gmail.com";
        String[] split = name1.split("@");
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);

        // Substring

        System.out.println(name.substring(1,3));

        // LowerCase

        System.out.println("REENA".toLowerCase());



        //UpperCase

        System.out.println("Reena".toUpperCase());


        //Startswith
        System.out.println(name.startsWith("s"));

        //endswith
        System.out.println(name.endsWith("a"));

        //trim
        String name3 = "Reena Singh    ";
        System.out.println(name3.trim());

        //CompareTo
        System.out.println(name.compareTo("Reena"));

        //CompareToInoreCase

        System.out.println(name.compareToIgnoreCase("Reena"));

    }
}
