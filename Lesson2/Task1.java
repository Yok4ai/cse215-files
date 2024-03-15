package Lesson2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if(n%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        int remainder = n%2;
        switch (remainder){
            case 0:
                System.out.println("Even");
            case 1:
                System.out.println("Odd");
            break;
        }
    }
}
