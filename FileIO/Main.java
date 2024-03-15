package FileIO;

import java.io.*;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("file1");
        try {
            if(file.createNewFile()){
                System.out.println("File Created");
            }
            else{
                System.out.println("File Already Exists");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Scanner scanner = new Scanner(file);
            //int i=0;
            //while (i<10){

              //  i++;
            //}
            while (scanner.hasNext()) {
                String name = scanner.next();
                double cgpa = scanner.nextDouble();
                Student student = new Student(name,cgpa);
                System.out.println(student);
                FileWriter f = new FileWriter("idk",true);
                PrintWriter p = new PrintWriter(f);
                p.println(student);
                p.close();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("IO Error");
        }

    }
}



