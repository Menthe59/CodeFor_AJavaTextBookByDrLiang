package pers.menthe59.chapter6;
import javax.swing.*;
import java.util.Scanner;

public class quiz06 {
    public static void main(String[] args) {
        Scanner inpute = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int n = inpute.nextInt();
        inpute.close();
        displayPattern(n);
    }

    public static void displayPattern(int n) {
        for (int i = 1; i <= n; i++){
            for (int j = n; j > i; j--){
                System.out.print("  ");
            }
            for (int j = i; j > 0; j--){
                System.out.print(" " + j);
            }
            System.out.println();
        }
    }
}
