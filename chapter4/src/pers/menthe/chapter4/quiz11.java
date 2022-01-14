package pers.menthe.chapter4;

import java.util.Scanner;

public class quiz11 {
    public static void main(String[] args) {
        //declare variables
        int decNum;

        System.out.println("Enter a decimal value (0 to 15) : ");
        Scanner input = new Scanner(System.in);
        decNum = input.nextInt();

        if (0 <= decNum && decNum <= 9)
            System.out.println("The hex value is " + decNum);
        else if (10 <= decNum && decNum <= 15)
            System.out.printf("The hex value is %c ",(decNum - 10 + 'A'));
        else
            //determine whether the input is valid
            System.out.println(decNum + " is an invalid input.");

        input.close();
    }
}
