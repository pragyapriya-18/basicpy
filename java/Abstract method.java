abstract class A {

    abstract void show();
}

class B extends A {

    void show() {
        System.out.println("Abstract Class Implemented");
    }
}

class AbstractDemo {

    public static void main(String[] args) {
        A obj = new B();

        obj.show();
    }
}