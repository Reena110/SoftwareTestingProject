package Tasks;

public class Task08_Array_Students_
{
    public class ATBMain {
        public static void main(String[] args) {
            ATBStudent[] students = new ATBStudent[3];

            // Create and assign students
            for (int i = 0; i < students.length; i++) {
                students[i] = new ATBStudent();
                students[i].setName("Student" + (i + 1));
                students[i].setAge(20 + i);
                students[i].setCourse("Automation Testing");
            }

            // Print student details
            for (ATBStudent s : students) {
                System.out.println(s);
            }
        }
    }
}
