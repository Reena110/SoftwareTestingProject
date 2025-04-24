package Tasks;

class Vehical
{
    String brand ="Ford";

    void honk()
    {
        System.out.println("Beep Beep");
    }

}
class Car extends Vehical
{
    String modelName ="Mustang";
    void displayInfo()
    {
        System.out.println("Brand :" + brand);
        System.out.println("Model : " +modelName);
    }
}

public class Task15_Inheritance
{
    public static void main(String[] args) {
        Car c = new Car();
        c.honk();
        c.displayInfo();
    }
}
