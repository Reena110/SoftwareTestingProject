package ex_19_Inheritance;

// Base class
class Employee {
    String name = "John Doe";
    int employeeId = 101;

    void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
    }
}

// Intermediate class
class Manager extends Employee {
    String department = "IT";

    void showDepartment() {
        System.out.println("Department: " + department);
    }
}

// Derived class
class SeniorManager extends Manager {
    void approveBudget() {
        System.out.println("Senior Manager approved the project budget.");
    }
}

// Main class with main() method
public class Lab02_Multilevel {
    public static void main(String[] args) {
        SeniorManager sm = new SeniorManager();
        sm.displayDetails();
        sm.showDepartment();
        sm.approveBudget();
    }
}
