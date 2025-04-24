class MyException extends Exception {

    MyException(String msg) {
        super(msg);
    }
}

class ThrowDemo {

    public static void main(String[] args) {
        try {
            throw new MyException("Custom Exception");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}