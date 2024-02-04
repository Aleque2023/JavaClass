//Alejandro Quezada
//2/4/2024
//Module 5 Programming Assignment

import java.io.*;
import java.util.*;

public class moduleFive_2 {
    public static void main(String[] args) {
        String fileName = "data.file";

        File file = new File(fileName);

        try {
            if (!file.exists()) {
                file.createNewFile();
            }

            writeFile(file, 10);
            readFile(file);

        } catch (IOException e) {
        e.printStackTrace();
    }

}

    private static void writeFile(File file, int num) throws IOException {
        try (FileWriter write = new FileWriter(file, true)) {
            Random ranNum = new Random();
            for (int i = 0; i < num; ++i) {
                int ranInt = ranNum.nextInt(25);
                write.write(ranInt + " ");
            }
        }
    }

    private static void readFile(File file) throws IOException {
        try (BufferedReader read = new BufferedReader(new FileReader(file))) {
            String text;
            while ((text = read.readLine()) != null) {
                System.out.println(text);
            }
        }
    }
}
