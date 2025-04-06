package Tasks;


class Employee {
    String name = "Rahul";
    int empId = 1001;

    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + empId);
    }
}

class Developer extends Employee {
    void writeCode() {
        System.out.println("Developer writes code.");
    }
}

public class Task05_Hierarchical_Inheritance {
    public static void main(String[] args) {
        Developer dev = new Developer();
        dev.showDetails();
        dev.writeCode(); // You said error is here
    }
}