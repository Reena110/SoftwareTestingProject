package ex_24_Abstration;

// Abstract class example
abstract class Animal {
    // Abstract method (no body)
    abstract void sound();

    // Regular method
    void sleep() {
        System.out.println("Sleeping...");
    }
}

// Interface example
interface Bird {
    void fly(); // implicitly public and abstract
}

// Concrete class extends abstract class and implements interface
class Dog extends Animal {
    // Must override abstract method
    void sound() {
        System.out.println("Dog barks");
    }
}

class Sparrow extends Animal implements Bird {
    // Implementing abstract method from Animal
    void sound() {
        System.out.println("Sparrow chirps");
    }

    // Implementing method from interface Bird
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}

// Main class to test the code
public class AbstractionDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.sleep();

        System.out.println();

        Sparrow sparrow = new Sparrow();
        sparrow.sound();
        sparrow.sleep();
        sparrow.fly();
    }
}
