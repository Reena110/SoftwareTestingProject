package Tasks;


    public class Person {
        // Fields
        String name;
        int age;
        String address;
        String phone;
        boolean isMale;

        // Default Constructor
        public Person() {
            System.out.println("Default Constructor called");
            name = "Unknown";
            age = 0;
            address = "Not Provided";
            phone = "0000000000";
            isMale = true;
        }

        // Parameterized Constructor
        public Person(String name, int age, String address, String phone, boolean isMale) {
            System.out.println("Parameterized Constructor called");
            this.name = name;
            this.age = age;
            this.address = address;
            this.phone = phone;
            this.isMale = isMale;
        }

        // Behaviors / Methods
        public void eat() {
            System.out.println(name + " is eating.");
        }

        public void sleep() {
            System.out.println(name + " is sleeping.");
        }

        public void walk() {
            System.out.println(name + " is walking.");
        }

        public void doHome() {
            System.out.println(name + " is doing homework.");
        }

        public void printDetails() {
            System.out.println("---- Person Details ----");
            System.out.println("Name    : " + name);
            System.out.println("Age     : " + age);
            System.out.println("Address : " + address);
            System.out.println("Phone   : " + phone);
            System.out.println("Gender  : " + (isMale ? "Male" : "Female"));
            System.out.println("------------------------");
        }

        // Main method to test
        public static void main(String[] args) {
            // Using Default Constructor
            Person p1 = new Person();
            p1.printDetails();
            p1.eat();
            p1.sleep();
            p1.walk();
            p1.doHome();

            System.out.println();

            // Using Parameterized Constructor
            Person p2 = new Person("Amit", 28, "Bangalore", "9876543210", true);
            p2.printDetails();
            p2.eat();
            p2.sleep();
            p2.walk();
            p2.doHome();
        }
    }

