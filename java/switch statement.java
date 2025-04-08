// import java.io.*;
import java.util.Scanner;
class Switchcase{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("input year");
        int year = in.nextInt();
        switch (year){
            case 1:
                 System.out.println("you are in 1st year");
                    break;
            case 2:
                System.out.println("you are in 2nd year");
                break;
            case 3:
                System.out.println("you are in 3rd year");
                break;
            default:
                System.out.println("please enter the valid year");
                break;
        }
    }
}