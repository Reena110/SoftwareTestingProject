package Tasks;

class car
{

        private String brand;
       private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
public class Task14_Encapsulation
{
    public static void main(String[] args) {
        car c = new car();
        c.setBrand("Lamborghini");
        c.setSpeed(1000);
        System.out.println(c.getBrand()+ " car speed is " +c.getSpeed());

    }
}
