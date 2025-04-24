package Tasks;

class Employeee
{
    void work()
    {
        System.out.println("Employee is working ...");
    }
}
class Developerr extends Employee
{
    void work()
    {
        System.out.println("Developer is writing code");
    }
}
class tester extends Employee
{
    void work()
    {
        System.out.println("Tester is Testing the application");
    }
}

public class Task17_Method_Overriding
{
    public static void main(String[] args) {
        Employeee emp1 = new Employeee();
        Employeee emp2 = new Employeee();
        emp1.work();
        emp2.work();
    }
}
