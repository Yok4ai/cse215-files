package Lesson3;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.print("Input a number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i ; j--) {
                System.out.print("*");

            }
            System.out.print("\n");
        }
    }
}



