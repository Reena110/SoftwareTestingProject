package Tasks;

// Enum for Employee Role
enum Role {
    DEVELOPER,
    TESTER,
    MANAGER,
    ANALYST
}

// Main class
public class Lab01_enum {

    // Method to print role responsibilities
    static void printRoleResponsibilities(Role role) {
        switch (role) {
            case DEVELOPER:
                System.out.println("Writes and maintains code.");
                break;
            case TESTER:
                System.out.println("Performs testing and reports bugs.");
                break;
            case MANAGER:
                System.out.println("Manages team and project timelines.");
                break;
            case ANALYST:
                System.out.println("Analyzes requirements and writes documentation.");
                break;
            default:
                System.out.println("Unknown role.");
        }
    }

    public static void main(String[] args) {
        // Assigning roles
        Role emp1Role = Role.DEVELOPER;
        Role emp2Role = Role.TESTER;

        // Displaying details
        System.out.println("=== Employee 1 Role ===");
        System.out.println("Role: " + emp1Role);
        printRoleResponsibilities(emp1Role);

        System.out.println("\n=== Employee 2 Role ===");
        System.out.println("Role: " + emp2Role);
        printRoleResponsibilities(emp2Role);
    }
}