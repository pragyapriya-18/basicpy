public class StaticVariable {

    static int count = 0; // Static variable shared by all objects

    // Constructor that increases count whenever an object is created
    StaticVariable() {
        count++;
        System.out.println("Count: " + count);
    }

    public static void main(String[] args) {
        new StaticVariable(); // Object 1 → count = 1
        new StaticVariable(); // Object 2 → count = 2
    }
}
