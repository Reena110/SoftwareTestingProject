package ex_22_Polymorphism;


    // Parent class
    class Animal {
        void sound() {
            System.out.println("Animals make different sounds.");
        }
    }

    // Child class 1
    class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Dog barks.");
        }
    }

    // Child class 2
    class Cat extends Animal {
        @Override
        void sound() {
            System.out.println("Cat meows.");
        }
    }

    // Main class to test method overriding
    public class MethodOverridingExample {
        public static void main(String[] args) {
            Animal animal;

            animal = new Dog();   // Object of Dog
            animal.sound();       // Calls Dog's version of sound()

            animal = new Cat();   // Object of Cat
            animal.sound();       // Calls Cat's version of sound()
        }
    }

