class A {

    void show() {
        System.out.println("Class A");
    }
}

class B extends A {

    void showB() {
        System.out.println("Class B");
    }
}

class C extends A {

    void showC() {
        System.out.println("Class C");
    }
}

class Hierarchical {

    public static void main(String[] args) {
        B obj1 = new B();
        C obj2 = new C();

        obj1.show();
        obj2.show();
    }
}