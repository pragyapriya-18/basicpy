import java.util.Scanner;

class StringMethod{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a string");
        String str=sc.nextLine();

        System.out.println("original String" + str);
        System.out.println("length of string" + str.length());
        System.out.println("UpperCase" + str.toUpperCase());
        System.out.println("LowerCase" + str.toLowerCase());
        System.out.println("First Charcater" + str..charAt(0));
        System.out.println("substring(first 3 character)" + str.substring(0,3));
        System.out.println("Concatentaion" + str.concat("is awesome"));

        sc.close();
    }
}