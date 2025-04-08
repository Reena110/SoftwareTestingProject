package ex_19_Inheritance;


    // Parent class
    class Animal {
        void eat() {
            System.out.println("This animal eats food.");
        }
    }

    // Child class
    class Dog extends Animal {
        void bark() {
            System.out.println("Dog barks.");
        }
    }

    public class Lab01_Single {
        public static void main(String[] args) {
            Dog dog = new Dog();
            dog.eat();   // Inherited method
            dog.bark();  // Own method
        }
    }

