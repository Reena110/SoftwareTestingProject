package Tasks;

public class Task10_MethodOverriding
{
    class Trainer {
        void conductClass() {
            System.out.println("Trainer conducts a general class.");
        }
    }

    class SeleniumTrainer extends Trainer {
        @Override
        void conductClass() {
            System.out.println("SeleniumTrainer conducts Selenium session.");
        }
    }
}
