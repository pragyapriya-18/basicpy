public class DefaultConstructor{

    String name;
    int age;

    // Default constructor with values
    public DefaultConstructor() {
        this.name = "John Doe";
        this.age = 25;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        DefaultConstructor p = new DefaultConstructor();
        p.display();
    }
}