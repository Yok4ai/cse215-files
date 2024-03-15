package Lesson5;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int [] nums = new int[6];
        Scanner scanner = new Scanner(System.in);

        for(int i=0;i<nums.length;i++){
            nums[i] = scanner.nextInt();
        }
    }
}
