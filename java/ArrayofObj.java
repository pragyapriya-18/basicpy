class Student {

    String name;

    Student(String name) {
        this.name = name;
    }
}

public class ArrayObjects {

    public static void main(String[] args) {
        Student[] students = new Student[2];
        students[0] = new Student("Alice");
        students[1] = new Student("Bob");

        for (Student s : students) {
            System.out.println(s.name);
        }
    }
}