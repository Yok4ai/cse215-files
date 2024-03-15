package Quiz1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.print("Input two integers: ");
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();
        int max = scanner.nextInt();



        for (int i = min; i <= max; i++) {
            boolean notPrime = false;
            for (int j = 2; j < i; j++) {
                if (i%j==0) {
                    notPrime = true;
                }
            }
            if (notPrime && i%2!=0)
                System.out.print(i+" ");

        }

    }
}