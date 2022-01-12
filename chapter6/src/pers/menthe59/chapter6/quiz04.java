package pers.menthe59.chapter6;
import java.util.Scanner;

public class quiz04 {
    public static void main(String[] args) {
        System.out.println("Enter an integer:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();
        System.out.println("Reverse number is " + reverse(number));
    }

    public static int reverse(int number) {
        int reverse = 0;
        do {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }while (number > 0);
        return reverse;
    }
}
