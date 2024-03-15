package Lesson2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.print("Enter an input: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.print("Your divisors are: ");

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (i<n) {
                    System.out.print(i + ",");
                }
                if (i==n) {
                    System.out.print(i + ".");
                }
            }
        }
    }
}
