package Assignment2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int [][] matrix = new int[3][3];
        int sumRow, sumCol, sumDiag1=0, sumDiag2=0;

        System.out.print("Enter values: ");
        Scanner scanner = new Scanner(System.in);
        //Row
        for(int i=0; i<3; i++){
            sumRow = 0;

            for(int j=0; j<3; j++){
                matrix[i][j] = scanner.nextInt();
                sumRow = sumRow + matrix[i][j];
            }

            System.out.println("Sum of row " + (i+1) + " is " + sumRow + " ");
        }
        //Column
        for(int i=0; i<3; i++){
            sumCol = 0;
            for(int j=0; j<3; j++){
                sumCol = sumCol + matrix[j][i];
            }

            System.out.println("Sum of col " + (i+1) + " is " + sumCol + " ");
        }

        //Diag1
        for(int i=0; i<3; i++){
                sumDiag1 = sumDiag1 + matrix[i][i];
        }
        System.out.println("Sum of Diag1 is: " + sumDiag1 );
        //Diag2
        for(int i=0; i<3; i++){
            for(int j=0; j<3;j++){
                if(i+j==2){
                    sumDiag2 = sumDiag2 + matrix[i][j];
                }
            }
        }
        System.out.println("Sum of Diag2 is: " + sumDiag2 );



        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
