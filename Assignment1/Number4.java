//Number4
package Assignment1;

public class Number4 {
    public static void main(String[] args) {
        int min = 1990 , max = 2020;
        int a = (int)(Math.random()*(max-min+1)+min);
           System.out.print(a + ":");

            if (a%4==0 && a%100!=0 || a%400==0)
                System.out.print("True");
            else
                System.out.print("False");
    }
}