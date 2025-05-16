// import java.io.*;

class AddAMethodToAClass {
    public static void main(String[] args) {
        Box b = new Box();  // Create an instance of the Box class
        // Assign values to the instance variables
        b.width = 20.5;
        b.height = 91.7;
        b.depth = 45.2;
        // Call the volume method
        b.volume();  // This will print the volume of the box
    }
}

class Box {
    // Instance variables
    double width;
    double height;
    double depth;
     // Method to calculate and print the volume of the box
    void volume(){
        System.out.println("volume is:"+ width*height*depth);
    }
}