package pers.menthe.chapter8;

import java.util.Scanner;

public class quiz01 {
    public static void main(String[] args) {
        double[][] matrix = new double[3][4];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-4 martix row by row: ");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++){
                matrix[i][j] = input.nextDouble();
            }
        }
        for (int i = 0; i < 4; i++){
            System.out.println("Sum of the elements at column " + i + " is " + sumColumn(matrix,i));
        }
    }

    public static double sumColumn(double[][] m,int columnIndex) {
        double sum = 0;
        for (int j = 0; j < 3; j++){
            sum += m[j][columnIndex];
        }
        return sum;
    }
}
