package Quiz1;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                if(j%2==0)
                System.out.print("0");

                else
                    System.out.print("1");
            }
            System.out.print("\n");
        }
    }
}