package FileIO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("file2",true);
            String name = "Mashnoor";
            double cgpa = 16.3;

            writer.append("\n"+ name + " " + cgpa + "\n");
            writer.close();
        } catch (IOException e) {
           // throw new RuntimeException(e);
        }

    }
}
