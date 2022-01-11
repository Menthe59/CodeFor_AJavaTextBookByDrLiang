package pers.menthe59.chapter6;
import java.util.Scanner;

public class quiz02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer:");
        long number = input.nextInt();
        System.out.println("The sum of the digits in an integer :" + sumDigits(number));
    }

    public static int sumDigits(long number) {
        int sum = 0;
        while(number >= 10){
            sum += number%10;
            number /= 10;
        }
        return (int)(sum+number);
    }
}
