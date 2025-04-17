package ex_03_Literals;

public class Lab30_Char_Literals
{
    public static void main(String[] args) {
        char ch ='A'; // A-Z a-z @#$%^*((
        // char ch1 ="A"; // This is not char its a string

        //Escape char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        //ASCII (Limited numbers) -A --> 65;

        char ruppes = '₹';
        System.out.println(ruppes);
        char my_laugh_smily= '\u1f60';
        System.out.println(my_laugh_smily);


    }
}
