package Lesson3;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        System.out.print("Input a number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2*i+1 ; j++) {

              if (i % 2 == 0)
                    System.out.print("*");
               else
                System.out.print("+");


            }
            System.out.print("\n");

        }
    }
}

