package pers.menthe59.chapter6;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class quiz05 {
    public static void main(String[] args) {
        double num1, num2, num3;
        System.out.println("Enter three numbers :");
        Scanner input = new Scanner(System.in);
        num1 = input.nextDouble();
        num2 = input.nextDouble();
        num3 = input.nextDouble();
        input.close();
        displaySortNumber(num1,num2,num3);
    }

    public static void displaySortNumber(double num1, double num2, double num3) {
        if (num1 < num2){
            if (num1 < num3) {
                System.out.print(num1 + " ");
                if (num2 < num3)
                    System.out.print(num2 + " " + num3);
                else
                    System.out.print(num3 + " " + num2);
            } else
                System.out.println(num3 + " " + num1 + " " + num2);
            }
        else {
            if (num2 < num3){
                System.out.print(num2 + " ");
                if (num1 < num3)
                    System.out.print(num1 + " " + num3);
                else
                    System.out.print(num3 + " " + num1);
        }else
            System.out.print(num3 + " " + num2 + " " + num1);
        }
        System.out.println();
    }
}
