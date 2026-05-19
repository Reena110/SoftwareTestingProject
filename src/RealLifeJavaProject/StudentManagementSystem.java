package RealLifeJavaProject;
import java.util.ArrayList;
import java.util.Scanner;


    class student
    {
        int id;
        String name;
        int marks;
        student(int id, int marks,String name)
        {
            this.id=id;
            this.name=name;
            this.marks=marks;
        }
        void dislay()
        {
            System.out.println(id + " " +name +" " +marks);
        }
    }
public class StudentManagementSystem {
    public static void main(String args[]) {
        ArrayList<student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1 Add Students");
            System.out.println("2 Display student");
            System.out.println("3 Search Student");
            System.out.println("4 Exit");
            System.out.println("Enter Choice");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Enter id");
                int id = sc.nextInt();
                System.out.println("Enter Name");
                String name = sc.next();
                System.out.println("Enter marks");
                int marks = sc.nextInt();
                student s = new student(id,marks,name);
                list.add(s);
                System.out.println("Student Added");
            } else if (choice == 2) {
                for (student s : list) {
                    s.dislay();
                }
            } else if (choice == 3) {
                System.out.println("Enter student id");
                int sid = sc.nextInt();
                boolean found = false;
                for (student s : list) {
                    if (s.id == sid) {
                        s.dislay();
                        found = true;
                    }
                }
                if (found == false) {
                    System.out.println("Student not found");

                }
            } else if (choice == 4) {
                System.out.println("Thank you");
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }
    }

}
