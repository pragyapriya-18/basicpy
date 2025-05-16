public class ThisKeyword {

    String name;

    ThisKeyword(String name) {
        this.name = name; // 'this' refers to the instance variable
    }

    void display() {
        System.out.println("Employee Name: " + name);
    }

    public static void main(String[] args) {
        ThisKeyword e1 = new ThisKeyword("John");
        e1.display();
    }
}