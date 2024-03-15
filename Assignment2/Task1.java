package Assignment2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double [] a = new double [6];
        System.out.print("Input Numbers of the Array: ");
        double sum = 0;
        int count = 0;
        double percent = 0;

        for(int i=0; i<a.length; i++){
           a [i] =  scanner.nextDouble();
           sum = sum + a [i];
        }
        System.out.print("Your Inputs are: ");

        double avg = sum/6;

        for (int i=0; i<a.length; i++){
            System.out.print(a[i]+ " ");
                if(a[i]>avg){
                    count++;
                }
        }
        percent = (count*100)/6.0;

        System.out.println("");
        System.out.println("Average: " + avg);
        System.out.println("Percentage of Numbers greater than avg is: "+ percent);
    }

}
