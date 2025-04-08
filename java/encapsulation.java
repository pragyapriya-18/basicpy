class Student {
    private String name;

    public void setName(String name) { // Setter method
        this.name = name;
    }

    public String getName() { // Getter method
        return name;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("l");
        System.out.println("Student Name: " + s.getName());
    }
}