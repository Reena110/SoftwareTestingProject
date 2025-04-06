package Tasks;

public class Task01_ReturnType {

        int A = 10; // A - variable with value 10

        // 1. Without Parameters and Without Return Type
        public void displayA() {
            System.out.println("Value of A is: " + A);
        }


        // 2. Without Parameters but With Return Type
        public int getDoubleOfA() {
            return A * 2;
        }

        // 3. With Parameters and Without Return Type
        public void updateA(int newA) {
            A = newA;
            System.out.println("A is updated to: " + A);
        }

        // 4. With Parameters and With Return Type
        public int addToA(int value) {
            return A + value;
        }

        // main method to test
        public static void main(String[] args) {
            Task01_ReturnType p = new Task01_ReturnType();

            // Call 1: No parameters, no return
            p.displayA();

            // Call 2: No parameters, with return
            int result = p.getDoubleOfA();
            System.out.println("Double of A is: " + result);

            // Call 3: With parameters, no return
            p.updateA(25);

            // Call 4: With parameters, with return
            int newValue = p.addToA(5);
            System.out.println("A + 5 = " + newValue);
        }
    }
