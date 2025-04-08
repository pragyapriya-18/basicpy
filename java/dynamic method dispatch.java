class Parent {
    void show() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    void show() { // Overriding method
        super.show(); // Calls Parent class method
        System.out.println("Child class method");
    }
}

public class DynamicMethodArray {
    public static void main(String[] args) {
        Parent obj = new Child(); // Upcasting
        obj.show(); // Calls Child class method
    }
}
