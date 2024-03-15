package Lesson2;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int marks = scanner.nextInt();

        if (marks < 80) {
            System.out.println("F");
        } else if (marks < 90) {
            System.out.println("B");
        } else if (marks < 100) {
            System.out.println("A");
        } else {
            System.out.println("Invalid output");
        }

        // boolean invalidMarks = marks<0 && marks>100;
        //System.out.println("invalidMarks");

        // boolean isPrime = true;

        //if(isPrime){
        //     System.out.println("Truth");
        // }


        //int w = 0;
       // while (w < 5) {
        //    System.out.println("Doing my work");
        //}
    }
}
