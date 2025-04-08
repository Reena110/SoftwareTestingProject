package Tasks;

public class Lab01_static_Keyword {

    // Static variable
    static String companyName = "TechCorp";

    // Non-static (instance) variables
    String employeeName;
    int employeeId;

    // Static block (SIB) - runs once when class loads
    static {
        System.out.println("Static Block Executed - Class Loaded");
    }

    // Constructor
    Lab01_static_Keyword(String name, int id) {
        this.employeeName = name;
        this.employeeId = id;
    }

    // Static method
    static void showCompany() {
        System.out.println("Company: " + companyName);
    }

    // Non-static method
    void showEmployeeDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
    }

    // Main method
    public static void main(String[] args) {
        // Calling static method
        Lab01_static_Keyword.showCompany();

        // Creating objects and accessing non-static members
        Lab01_static_Keyword emp1 = new Lab01_static_Keyword("Alice", 101);
        Lab01_static_Keyword emp2 = new Lab01_static_Keyword("Bob", 102);

        System.out.println("\n--- Employee 1 Details ---");
        emp1.showEmployeeDetails();

        System.out.println("\n--- Employee 2 Details ---");
        emp2.showEmployeeDetails();
    }
}
