
import java.io.FileWriter;

// 1.ADD METHOD TO A CLASS:--->

// import java.io.*;

// class revision {
//     public static void main(String [] args){
//         box b = new box();
//         b.width = 78;
//         b.height = 56;
//         b.depth = 56;
//         b.volume();
//     }
// }

// class box {
//     double width;
//     double height;
//     double depth;
//     void volume(){
//         System.out.println("volume is:" + width*height*depth);
//     }
// }

// -----------------------------------------------------------------

// 2.finalize:--->

// class revision{
//     public static void main (String [] args){
//         String s = "hello";
//         s = null;
//         System.gc();
//         System.out.println("garbage collector");
//     }
//     protected void revision()
//     {
//         System.out.println("finalize");
//     }
// }

// ---------------------------------------------------------------------

// 3.PrimitiveDatatypes:---->

// class revision{
//     public static void main(String [] args){
//         char c = 'c';
//         int i = 56;
//         float f = 56.5f;
//         double  d = 56.6d;
//         byte b = 4;
//         boolean a = true ;
//         short s = 546;

//         System.out.println("float:" + f);
//         System.out.println("int:" + i);
//         System.out.println("double:" + d);
//         System.out.println("char:" + c);
//         System.out.println("byte:" + b);
//         System.out.println("boolean:" + a);
//         System.out.println("short:" + s);
//     }
// }

// -----------------------------------------------------------------------

// 4.Overload---->

// class revision{
//     void show (int a){
//         System.out.println(a);
//     }
//     void show(String s){
//         System.out.println(s);
//     }
//     public static void main(String[] args) {
//         revision obj = new revision();
//         obj.show(10);
//         obj.show("java");
//     }
// }

// ---------------------------------------------------------------------

// 5.override:---->

// class A {
//     void show(){
//         System.out.println("parent");
//     }
// }

// class B extends A{
//     void show(){
//         System.out.println("child");
//     }
// }

// class revision {
//     public static void main(String [] args){
//         A obj = new B();
//         obj.show();
//     }
// }

// ----------------------------------------------------------------------

// 6.OneDArray:---->

// class revision{
//     public static void main(String [] args){
//         int arr[] = {10,20,30,40,50};
//         System.out.println("array elements");
//         for(int i = 0; i <  arr.length; i++){
//             System.out.println("array:" + arr[i]);
//         }
//     }
// }

// ------------------------------------------------------------------------

// 7.BoxingAndUnboxing:---->

// class revision{
//     public static void main(String [] args){
//         int a = 10;
//         Integer boxedA = a;
//         System.out.println("boxed valued" + boxedA);

//         int b = 20;
//         Integer unboxedB = b;
//         System.out.println("unboxed valued" + unboxedB);
//     }
// }

// ------------------------------------------------------------------------

// 8.switch statement:---->

// import java io.*;
// import java.util.Scanner;

// class revision{
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.println("input year");
//         int year = in.nextInt();

//         switch (year) {

//             case 1:
//                 System.out.println("you are in 1st year");
//                 break;
//             case 2:
//                 System.out.println("you are in 2nd year");
//                 break;
//             case 3:
//                 System.out.println("you are in 3rd year");
//                 break;
//             default:
//                 System.out.println("please ente valid year");
//                 break;
//         }
//     }
// }


// ----------------------------------------------------------------------

// 9. StringMethod:---->

// import java.util.Scanner;

// class revision{
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.println("enter string");
//         String str = in.nextLine();

//         System.out.println("orginal ccharacter" + str);
//         System.err.println("length of str" + str.length());
//         System.out.println("uppercase" + str.toUpperCase());
//         System.out.println("Lower case" + str.toLowerCase());
//         System.out.println("firstchar" + str.charAt(0));
//         System.out.println("substring (first 3 char)" + str.substring(0,3));
//         System.out.println("concat" + str.concat(("awesome")));
//     }
// }

// ----------------------------------------------------------------------

// 10.StringBuffer:---->

// class revision{
//     public static void main(String[] args) {
//         StringBuffer a = new StringBuffer("java");

//         a.append("programming");
//         System.out.println("after append" + a);

//         a.insert(4, "language");
//         System.out.println("after insert" + a);

//         a.reverse();
//         System.out.println("after reverse" + a);
//     }
// }

// ----------------------------------------------------------------------

// 11.DynamicMethodDispatchr:----->

// class A{
//     void show(){
//         System.out.println("parent class");
//     }
// }
// class B extends A{
//     void show(){
//         super.show();
//         System.out.println("child class");
//     }
// }
// class revision{
//     public static void main(String[] args) {
//         A obj = new B();
//         obj.show();
//     }
// }

// ----------------------------------------------------------------------

// 12.single inheritance:---->

// class A{
//     void display(){
//         System.out.println("parent");
//     }
// }
// class B extends A{
//     void show(){
//         System.out.println("class");
//     }
// }
// class revision { 
//     public static void main(String[] args) {
//         B obj = new B();
//         obj.display();
//         obj.show();
//     }
// }

// -----------------------------------------------------------------------

// 13.Hierarchical:---->

// class A {
//     void show (){
//         System.out.println("class a");
//     }
// }
// class B extends A{
//     void show (){
//         System.out.println("class b");
//     }
// }
// class C extends A{
//     void show (){
//         System.out.println("class c");
//     }
// }
// class revision{
//     public static void main(String[] args) {
//         B obj1 = new B();
//         C obj2 = new C();

//         obj1.show();
//         obj2.show();
//     }
// }

// ------------------------------------------------------------------------

// 14.multilevel:---->

// class A {
//     void showA(){
//         System.out.println("class a");
//     }
// }

// class B extends A {
//     void showB(){
//         System.out.println("class b");
//     }
// }

// class C extends A {
//     void showC(){
//         System.out.println("class c");
//     }
// }
// class revision {
//     public static void main(String[] args) {
//         C obj = new C();

//         obj.showA();
//         obj.showB();
//         obj.showC();
//     }
// }

// -------------------------------------------------------------------------

// 15.MultiCatch:---->

// class revision {

//     public static void main(String[] args) {
//         try {
//             int a = 10 / 0;
//         } catch (ArithmeticException e) {
//             System.out.println("Arithmetic Exception Caught");
//         } catch (Exception e) {
//             System.out.println("General Exception Caught");
//         }
//     }
// }

// --------------------------------------------------------------------------

// 16.enum:---->

// enum level{
//     Low,medium,high
// }
// class revision{
//     public static void main(String[] args) {
//         level l = level.medium;
//         System.out.println(l);
//     }
// }
// -------------------------------------------------------------------------

// 17.throw:---->

// class MyException extends Exception{

//     MyException (String msg) {
//         super(msg);
//     }

// class revision{
//     public static void main(String[] args) {
//         try{
//             throw new MyException("custom exception");
//         }
//         catch(MyException e){
//             System.out.println(e.getMessage()); 
//         }
//         }
//     }
// }

// --------------------------------------------------------------------------

// 18.ifelseif:----->

// class revision{
//     public static void main(String[] args) {
//         int marks = 95;

//         if (marks>90){
//             System.out.println("grade a");
//         }
//         else if (marks>75){
//             System.out.println("grade b");
//         }
//         else if (marks>65){
//             System.out.println("grade c");
//         }
//         else{
//             System.out.println("fail");
//         }
//     }
// }

// --------------------------------------------------------------------------

// 19.abstractmethod:---->

// abstract class A {
//     abstract void show();
//     }

// class B extends A {
//     void show(){
//         System.out.println("abstract");
//     }
// }

// class revision{
//     public static void main(String[] args) {
//         A obj = new B();
//         obj.show();
//     }
// }

// ---------------------------------------------------------------------------

// 20.interface:----> 

// interface A{
//     void show();
// }
// class B implements A{
//     public void show(){
//         System.out.println("interface");
//     }
// }
// class revision {
//     public static void main(String[] args) {
//         A obj = new B();
//         obj.show();
//     }
// }

// ----------------------------------------------------------------------------

// 21.ForLoopSum:---->

// class revision{
//     public static void main(String[] args) {
//         int sum = 0;
//         for (int i = 0 ; i <= 10 ; i++){
//             sum += i;
//             System.out.println("sum:" + sum);
//         }
//     }
// }

// ----------------------------------------------------------------------------

// 22.filereader:---->

// import java.io.FileWriter;

// class revision{
//   public static void main(String[] args) {
//       FileWriter fw = new FileWriter("text.nxt");
//       fw.write("hello");
//       fw.close();
//   }
// }

// ----------------------------------------------------------------------------

// 23.filewriter :---->

// import java.io.FileReader;
// import java.IOException;

// class revision{
//   public static void main(String[] args) {
//       FileReader fr = new FileReader("text.nxt");

//       int i;
//       while((i = fr.rread()) ! = -1){
//         System.out.println((char)i);
//       }
//       fr.close();
//   }
// }

// ------------------------------------------------------------------------------

// 24.OCPD:---->

// -------------------------------------------------------------------------------

  // 25.break-continue:---->


