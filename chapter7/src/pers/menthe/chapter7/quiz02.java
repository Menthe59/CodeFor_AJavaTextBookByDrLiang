package pers.menthe.chapter7;

import java.util.Scanner;

public class quiz02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 integer : ");
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++)
            numbers[i] = input.nextInt();
        for (int i = 0; i < 10; i++)
            System.out.println(numbers[i] + " ");
        System.out.println("");
        for (int i = 9; i >= 0; i--)
            System.out.println(numbers[i] + " ");
    }
}
