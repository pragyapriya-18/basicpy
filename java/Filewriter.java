import java.io.FileWriter;

class fliewrtiter {

    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("test.txt");

        fw.write("Hello File");
        fw.close();
    }
}