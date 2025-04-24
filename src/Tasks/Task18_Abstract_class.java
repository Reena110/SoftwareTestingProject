package Tasks;

import java.awt.*;

abstract class show
{
    abstract void draw();
}
class Circle extends show
{
    void draw()
    {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends show
{
    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}
public class Task18_Abstract_class {
    public static void main(String[] args) {
        show s1 = new Circle();
        show s2 = new Rectangle();
        s1.draw();
        s2.draw();
    }
}
