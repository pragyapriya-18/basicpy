class Finalize {
    public static void main(String[] args) {
        String s = "Hello";
        s = null;
        System.gc();
        System.out.println("Garbage collector");
    }
    
    protected void Finalize() 
    {
        System.out.println("finalize() method class");
    }
}