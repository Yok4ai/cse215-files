package Quiz3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter values of x,y: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        try {
            ProperFraction p = new ProperFraction(x,y);
        } catch (Exception e) {
            System.out.println(e.getMessage());
       // } catch (ZeroDenominatorException e) {
            //System.out.println(e.getMessage());
        }
    }
}
