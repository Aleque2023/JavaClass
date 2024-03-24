package src;
import java.io.*;

public class AwriteMod_1 {
    public static void main(String[] args) {
        try {
            FileWriter mWriter = new FileWriter("C:\\Users\\Alex\\Documents\\GitHub\\JavaClass\\src\\Alejandrodatafile.dat");
            mWriter.write("This is a test.");
            mWriter.close();
            System.out.println("Program has successfully written to designated file.");
        } catch (IOException e) {
            System.out.println("There is an error in your code. :(");
            e.printStackTrace();
        }
    }
}
