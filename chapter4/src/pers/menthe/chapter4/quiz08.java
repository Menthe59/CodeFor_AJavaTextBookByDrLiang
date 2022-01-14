package pers.menthe.chapter4;

import java.util.Scanner;

public class quiz08 {
    public static void main(String[] args) {
        System.out.println("Enter an ASCII code : ");
        Scanner input = new Scanner(System.in);
        int asciiCode = input.nextInt();
        System.out.println("The character for ASCII code " + asciiCode + " is " + (char)asciiCode);
    }
}
