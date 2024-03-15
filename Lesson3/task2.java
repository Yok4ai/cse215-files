package Lesson3;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        System.out.print("Input a number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i ; j++) {
                System.out.print("_");
            }
            for(int j = 0; j<i+1; j++){
            System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}