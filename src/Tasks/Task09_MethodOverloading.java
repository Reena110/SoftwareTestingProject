package Tasks;

class Banking {

    // Method 1: Calculate interest with principal only (default rate and time)
    double calculateInterest(double principal) {
        double rate = 5.0;  // default rate
        int time = 1;       // default time in years
        return (principal * rate * time) / 100;
    }

    // Method 2: Calculate interest with principal and rate (default time)
    double calculateInterest(double principal, double rate) {
        int time = 1; // default time in years
        return (principal * rate * time) / 100;
    }

    // Method 3: Calculate interest with principal, rate, and time
    double calculateInterest(double principal, double rate, int time) {
        return (principal * rate * time) / 100;
    }
}

// Main class to test method overloading
public class Task09_MethodOverloading {
    public static void main(String[] args) {
        Banking bank = new Banking();

        System.out.println("Interest (Default Rate & Time): ₹" + bank.calculateInterest(10000));
        System.out.println("Interest (Custom Rate): ₹" + bank.calculateInterest(10000, 6.5));
        System.out.println("Interest (Custom Rate & Time): ₹" + bank.calculateInterest(10000, 7.0, 2));
    }
}