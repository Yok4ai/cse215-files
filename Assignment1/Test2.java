package Assignment1;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        int year;
        System.out.print("Enter an Year : ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
            System.out.print("Specified year is a leap year");
        else
            System.out.print("Specified year is not a leap year");
    }
}

