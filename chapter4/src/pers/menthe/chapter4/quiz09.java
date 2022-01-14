package pers.menthe.chapter4;

import java.util.Scanner;

public class quiz09 {
    public static void main(String[] args) {
        System.out.println("Enter a character : ");
        Scanner input = new Scanner(System.in);
        String uniCode = input.nextLine();
        char transCode = uniCode.charAt(0);
        System.out.println("The character for ASCII code " + uniCode + " is " + (int)transCode);
    }
}
