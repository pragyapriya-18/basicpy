class Overload {

    void show(int a) {
        System.out.println(a);
    }

    void show(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        Overload obj = new Overload();

        obj.show(10);
        obj.show("Java");
    }
}