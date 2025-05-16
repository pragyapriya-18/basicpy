import java.util.Scanner;
class ForLoopSum{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        int sum=0;

        // Using for loop to calculate sum
        for(int i=1;i<=n;i++){
            sum=sum +i;
        }
        System.out.println("sum of first:"+n+"natural no is"+sum);
        sc.close();
        
    }
}