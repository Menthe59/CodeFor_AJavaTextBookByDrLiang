package pers.menthe.chapter4;

import java.util.Scanner;

public class quiz15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        String str = input.nextLine();
        char letter = str.toUpperCase().charAt(0);
        if (letter == 'A' || letter == 'B' || letter == 'C')
            System.out.println("The corresponding number is 2");
        else if (letter == 'D' || letter == 'E' || letter == 'F')
            System.out.println("The corresponding number is 3");
        else if (letter == 'G' || letter == 'H' || letter == 'I')
            System.out.println("The corresponding number is 4");
        else if (letter == 'J' || letter == 'K' || letter == 'L')
            System.out.println("The corresponding number is 5");
        else if (letter == 'M' || letter == 'N' || letter == 'O')
            System.out.println("The corresponding number is 6");
        else if (letter == 'P' || letter == 'Q' || letter == 'R')
            System.out.println("The corresponding number is 7");
        else if (letter == 'T' || letter == 'U' || letter == 'V')
            System.out.println("The corresponding number is 8");
        else
            System.out.println("The corresponding number is 9");
    }
}
