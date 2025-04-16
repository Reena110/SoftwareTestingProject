package ex_23_Encapsulation;

// Student.java (Encapsulated class)
class Student {
    private String name;
    private int age;
    private String course;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}

// Main class with main method
public class EncapsulationTest {
    public static void main(String[] args) {
        // Creating object of Student
        Student s1 = new Student();

        // Setting values using setter methods
        s1.setName("Ravi");
        s1.setAge(24);
        s1.setCourse("Java Automation Testing");

        // Getting values using getter methods
        System.out.println("Student Name: " + s1.getName());
        System.out.println("Student Age: " + s1.getAge());
        System.out.println("Enrolled Course: " + s1.getCourse());
    }
}