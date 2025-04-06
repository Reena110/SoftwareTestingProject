package ex_17_OOPs;

public class Lab01_OOPs
{
    //Attributes | Properties | Instence variables | Data Members
     String name;
     String phone;
     byte age;
     String color_eyes;
     int legs;
     double salary;
     double weight;
     boolean IsMale;
    //Behaivour | Function | Methods

    void sleep()
    {
        System.out.println("I am sleeing");
    }
    String greet(String name)
    {
        return "Hello" +name;
    }
    void talk()
    {

    }
    int remaining_amount_sal(int salary, int tax)
    {

        return salary-tax;
    }

    public static void main(String[] args) {
        Lab01_OOPs p2 = new Lab01_OOPs();
         // Lab01_OOPs = class
        //  p2 = Obeect Refernce
        //  new Lab01_OOPs() = Object
        p2.sleep();
    }



}
