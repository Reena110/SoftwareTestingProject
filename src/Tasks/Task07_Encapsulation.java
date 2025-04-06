package Tasks;

class ATBStudent {
    private String name;
    private int age;
    private String course;

    // Getter & Setter
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
        this.age = age;
    }

    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }

    // toString Method
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Course: " + course;
    }
}
