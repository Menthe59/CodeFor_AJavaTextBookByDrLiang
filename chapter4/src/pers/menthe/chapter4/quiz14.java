package pers.menthe.chapter4;

import java.util.Scanner;

public class quiz14 {
    public static void main(String[] args) {
        String letterGrade;

        System.out.println("Enter a letter grade : ");
        Scanner input = new Scanner(System.in);
        letterGrade = input.next();

        if (letterGrade.length() != 1)
            System.exit(1);
        else{
            if ("ABCDE".indexOf(letterGrade) != -1){
                if ("F".equals(letterGrade))
                    System.out.println("The numeric value for grade F is 0");
                else
                    System.out.println("The numeric value for graded " + letterGrade
                    + Math.abs('E' - letterGrade.charAt(0)));
            }
            else
                System.out.println(letterGrade + " is an invalid grade");
        }
    }
}
