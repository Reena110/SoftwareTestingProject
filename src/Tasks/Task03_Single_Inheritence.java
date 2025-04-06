package Tasks;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Task03_Single_Inheritence {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound(); // from Animal
        d.bark();  // from Dog
    }
}