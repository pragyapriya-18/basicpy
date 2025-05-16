class DoWhileStatement
 {
    public static void main(String[] args) 
    {
        int i = 1;
        int sum = 0;
        System.out.println("Printing numbers from 1 to 10:");
        do {
            System.out.println("Value: " + i);
            sum += i;
            i++;
        } 
        while (i <= 5);
        
        System.out.println("Sum of numbers from 1 to 10 is: " + sum);
    }
}