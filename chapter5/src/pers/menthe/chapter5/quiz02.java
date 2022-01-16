package pers.menthe.chapter5;

import java.util.Scanner;

public class quiz02 {
    public static void main(String[] args) {
        int correctCount = 0,count = 0;
        long startTime = System.currentTimeMillis();
        String output = " ";
        Scanner input = new Scanner(System.in);

        while (count < 10){
            int number1 = (int) (1 + Math.random() * 15);
            int number2 = (int) (1 + Math.random() * 15);

            System.out.println("What is " + number1 + " + " + number2 + " ? ");
            int answer = input.nextInt();

            if (number1 + number2 == answer){
                System.out.println("You are correct!");
                correctCount++;
            }
            else
                System.out.println("Your answer is wrong.\n" + number1 + " + " + number2
                        + " should be " + (number1 + number2));
            count++;
            output += "\n" + number1 + " + " + number2 + " = " + answer
                    + ((number1 + number2 == answer) ? " correct " : " wrong");
        }
        long engTime  = System.currentTimeMillis();
        long testTime = engTime - startTime;

        System.out.println("Correct count is " + correctCount + "\nTest time is "
                    + testTime / 1000 + " second\n" + output);
    }
}
