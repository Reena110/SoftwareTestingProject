package Tasks;


    class Ani {
        void sound() {
            System.out.println("Animal sound");
        }
    }

    class Doggy extends Animal {
        void bark() {
            System.out.println("Dog barks");
        }
    }

    class Puppy extends Dog {
        void weep() {
            System.out.println("Puppy weeps");
        }
    }

    public class Task04_Multilevel_Inheritence {
        public static void main(String[] args) {
            Puppy p = new Puppy();
            p.sound(); // from Animal
            p.bark();  // from Dog
            p.weep();  // from Puppy
        }
    }

