interface A {

    void show();
}

class B implements A {

    public void show() {
        System.out.println("Interface Implemented");
    }
}

class InterfaceDemo {

    public static void main(String[] args) {
        A obj = new B();

        obj.show();
    }
}