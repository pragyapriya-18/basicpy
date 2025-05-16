public class ParameterizedConstructor {

    String name;
    int age;

    // Parameterized constructor
    ParameterizedConstructor(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
         ParameterizedConstructor s1 = new  ParameterizedConstructor("Alice", 20); // Passing values to constructor
        s1.display();
    }
}