package src.Assignment2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 0, b = 1, c;
        int[] fib = new int[n];

        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < n; i++) {
            c = a + b;
            fib[i] = c;
            a = b;
            b = c;
        }
        System.out.print("First " + n + " fibonacci numbers are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + fib[i]);
        }
    }
}