// // break

class BreakContinue
 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Breaking the loop at i = " + i);
                break; // Exits the loop when i == 3
            }
            System.out.println("i = " + i);
        }
    }
}

// continue

class BreakContinue
{
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3){
                continue; // Skips the rest of the loop body for i == 3
            }
            System.out.println(i); 
        }
    }
}