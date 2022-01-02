package pers.menthe59.chapter3;

import java.util.Scanner;

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
/*      System.out.println("Enter a, b, c, d, e, f:");
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
        }*/

        //quiz3.4
/*      int randNum = (int)(Math.random() * 12 + 1);
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
        }*/



    }
}