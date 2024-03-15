package Assignment2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Size: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        System.out.print("Enter Numbers: ");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.print("Output: ");
        for (int i = 1; i < n; i++) {
            if (i != n - 1) {
                if (a[i] == a[i - 1] && a[i] == a[i + 1]) {
                    System.out.print(a[i] + " ");
                }
            }
        }
    }
}