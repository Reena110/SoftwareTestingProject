package Tasks;

public class Task12_CLI_user_input
{
    public static void main(String[] args) {
        System.out.println("Enter the Name age salary");
        String name = args[0];
        int age = Integer.parseInt(args[1]);
        double salary = Double.parseDouble(args[2]);
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}
