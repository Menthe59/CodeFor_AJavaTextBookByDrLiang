package pers.menthe.chapter7;

import java.util.Scanner;

public class quiz01
{
    public static void main(String[] args) {
        System.out.println("Enter the number of students : ");
        Scanner input = new Scanner(System.in);
        int studentNumber = input.nextInt();
        System.out.println("Enter " + studentNumber + " scores : ");
        double[] studentScore = new double[studentNumber];

        double maxScore = 0;
        for (int i = 0; i < studentNumber; i++){
            studentScore[i] = input.nextDouble();
            if (studentScore[i] > maxScore){
                maxScore = studentScore[i];
            }
        }
        for (int i = 0; i < studentNumber; i++){
            System.out.println("Student " + i + " score is " + studentScore[i] + " and grade is " + calMax(studentScore[i],maxScore));
        }
    }

    public static String calMax(double studentNumber, double maxScore) {
        if (studentNumber >= maxScore - 10)
            return "A";
        else if (studentNumber >= maxScore - 20)
            return "B";
        else if (studentNumber >= maxScore - 30)
            return "C";
        else if (studentNumber >= maxScore - 40)
            return "D";
        return "F";
    }
}
