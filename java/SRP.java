
class Student {

    void displayDetails() {
        System.out.println("Student Name: Rahul");
        System.out.println("Roll Number: 101");
    }
}

class StudentResult {

    void displayResult() {
        System.out.println("Total Marks: 450");
        System.out.println("Result: Pass");
    }
}

class SRP {

    public static void main(String[] args) {

        Student s = new Student();
        StudentResult r = new StudentResult();

        s.displayDetails();
        r.displayResult();
    }
}