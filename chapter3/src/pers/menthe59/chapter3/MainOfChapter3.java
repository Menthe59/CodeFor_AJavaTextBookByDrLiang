package pers.menthe59.chapter3;

import java.util.*;

public class MainOfChapter3 {
    public static void main(String[] args) {
        /*Please remove the double slash used for comments before test.
        测试相关题目前请删去对应注释。
        */

        Scanner input = new Scanner(System.in);

        //quiz3.1
/*
        System.out.println("Enter a,b,c :");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double judgeNum = Math.pow(b, 2) - 4*a*c;

        if(judgeNum < 0){
            System.out.println("The equation has no real roots.");
        }else if(judgeNum == 0){
            System.out.println("The equation has one root " + -b/a*0.5);
        }else{
            System.out.println("The equation has two roots "
                    + (-b+Math.pow(judgeNum,0.5)) / 2*a + " " + (-b-Math.pow(judgeNum,0.5)) / 2*a);
        }
*/

        //quiz3.2
/*      int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random() * 10);
        int num3 = (int)(Math.random() * 10);

        System.out.println("What is " + num1 + " + " + num2 + " + " + num3 + " ?");
        int answer = input.nextInt();

        System.out.println(num1 + " + " + num2 + " + " + num3 + " = "
                + answer + " is " + (num1 + num2  + num3 == answer));*/

        //quiz3.3
/*        System.out.println("Enter a, b, c, d, e, f:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        if(a*d - b*c == 0){
            System.out.println("The equation has no solution.");
        }else{
            System.out.println("x is " + (e*d - b*f)/(a*d - b*c)
                    + " and y is " + (a*f -e*c)/(a*d - b*c));
        }
*/

        //quiz3.4
/*
        int randNum = (int)(Math.random() * 12 + 1);
        switch (randNum){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("Noverber");
                break;
            case 12:
                System.out.println("December");
                break;
        }
*/

        //quiz3.5
/*
        System.out.println("Enter today's day:");
        int today = input.nextInt();
        System.out.println("Enter the number of days elapsed since today:");
        int daysPast = input.nextInt();
        int futureDay = (today + daysPast) % 7;
        switch (today){
            case 0:
                System.out.print("Today is Sunday and the future day is ");
                break;
            case 1:
                System.out.print("Today is Monday and the future day is ");
                break;
            case 2:
                System.out.print("Today is Tuesday and the future day is ");
                break;
            case 3:
                System.out.print("Today is Wednesday and the future day is ");
                break;
            case 4:
                System.out.print("Today is Thursday and the future day is ");
                break;
            case 5:
                System.out.print("Today is Friday and the future day is ");
                break;
            case 6:
                System.out.print("Today is Saturday and the future day is ");
                break;
        }
        switch (futureDay){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }

*/

        //quiz3.6
        double pounds,feet,inches;
        final double KILO_PER_POUND = 0.45359237;
        final double METER_PER_INCH = 0.0254;
        System.out.println("Enter weight in pounds:");
        pounds = input.nextDouble();
        System.out.println("Enter feet:");
        feet = input.nextDouble();
        System.out.println("Enter inches:");
        inches = input.nextDouble();
        double bmi = (pounds * KILO_PER_POUND) / (Math.pow((feet*12+inches)*METER_PER_INCH,2));
        System.out.println("BMI is " + bmi);
        if (bmi < 18.5){
            System.out.println("Underweight");
        }else if (bmi < 25 && bmi > 18.5){
            System.out.println("Normal");
        }else if (bmi < 30 && bmi > 25){
            System.out.println("Overweight");
        }else{
            System.out.println("Obese");
        }






















    }
}