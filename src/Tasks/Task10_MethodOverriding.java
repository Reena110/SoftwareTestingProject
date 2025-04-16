package Tasks;

// Parent class
class Bank {
    double getRateOfInterest() {
        return 0; // Default rate
    }
}

// Child class 1
class SBI extends Bank {
    @Override
    double getRateOfInterest() {
        return 6.5;
    }
}

// Child class 2
class HDFC extends Bank {
    @Override
    double getRateOfInterest() {
        return 7.0;
    }
}

// Child class 3
class ICICI extends Bank {
    @Override
    double getRateOfInterest() {
        return 6.75;
    }
}

// Main class to test
public class Task10_MethodOverriding {
    public static void main(String[] args) {
        Bank bank;

        bank = new SBI();
        System.out.println("SBI Interest Rate: " + bank.getRateOfInterest() + "%");

        bank = new HDFC();
        System.out.println("HDFC Interest Rate: " + bank.getRateOfInterest() + "%");

        bank = new ICICI();
        System.out.println("ICICI Interest Rate: " + bank.getRateOfInterest() + "%");
    }
}
