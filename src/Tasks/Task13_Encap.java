package Tasks;

class Person {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Task13_Encap {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Reena");
        p.setAge(25);
        System.out.println(p.getName() + " is " + p.getAge() + " years old");
    }
}