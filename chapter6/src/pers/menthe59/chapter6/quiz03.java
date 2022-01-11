package pers.menthe59.chapter6;
import java.util.Scanner;
public class quiz03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int number = input.nextInt();
        if (isPalindrome(number)){
            System.out.println(number + " is palindrome");
        }else{
            System.out.println(number + " is not palindrome");
        }
    }

    public static int reverse(int number) {
        int reverseNumber = 0;
        do {
            reverseNumber = reverseNumber*10 + number % 10;
            number /= 10;
        }while (number > 0);
        return reverseNumber;
    }
    public static boolean isPalindrome(int number){
        return (number == reverse(number));
    }
}
