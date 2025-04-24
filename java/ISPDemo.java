interface Printer {

    void print();
}

interface Scanner {

    void scan();
}

class Machine implements Printer, Scanner {

    public void print() {
        System.out.println("Printing");
    }

    public void scan() {
        System.out.println("Scanning");
    }
}

class ISPDemo {

    public static void main(String[] args) {
        Machine obj = new Machine();

        obj.print();
        obj.scan();
    }
}