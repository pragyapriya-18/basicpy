class MultiCatch {

    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Caught");
        } catch (Exception e) {
            System.out.println("General Exception Caught");
        }
    }
}