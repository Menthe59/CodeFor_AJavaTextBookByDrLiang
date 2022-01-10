package pers.menthe59.chapter3;

import java.awt.font.ImageGraphicAttribute;
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
/*
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
*/

        //quiz3.7
/*
        System.out.println("Enter an amount in double, for example 11.56:");
        double amount = input.nextDouble();

        int remainingAmount = (int)(amount * 100);

        int numberOfOneDollars = remainingAmount /100;
        remainingAmount = remainingAmount % 100;

        int numberOfQuarters = remainingAmount /25;
        remainingAmount = remainingAmount % 25;

        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        int numberOfNickel = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        int  numberOfPennies = remainingAmount;

        System.out.println("Your amount " + amount + " consist of ");
        if (numberOfOneDollars > 0){
            if (numberOfOneDollars == 1)
                System.out.print(numberOfOneDollars + " dollar ");
            else
                System.out.print(numberOfOneDollars + " dollars ");
        }
        if (numberOfQuarters > 0){
            if (numberOfQuarters == 1)
                System.out.print(numberOfQuarters + " quarter ");
            else
                System.out.print(numberOfQuarters + " quarters ");
        }
        if (numberOfDimes > 0){
            if (numberOfDimes == 1)
                System.out.print(numberOfDimes + " dime ");
            else
                System.out.print(numberOfDimes + " dimes ");
        }
        if (numberOfNickel > 0){
            if (numberOfNickel == 1)
                System.out.print(numberOfNickel + " nickle ");
            else
                System.out.print(numberOfNickel + " nickles ");
        }
        if (numberOfPennies > 0){
            if (numberOfPennies == 1)
                System.out.print(numberOfPennies + " penny ");
            else
                System.out.print(numberOfPennies + " pennies ");
        }
*/

        //quiz3.8
/*
        System.out.println("Enter three integers:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if (num1 < num2){
            if (num1 < num3){
                System.out.print(num1 + " ");
                if (num2 < num3)
                    System.out.print(num2 + " " + num3);
                else
                    System.out.print(num3 + " " + num2);
            }
            else
                System.out.print(num3 + " " + num1 + " " + num1);
        }
        else
        {
            if (num2 < num3){
                System.out.print(num2 + " ");
                if (num1 < num2)
                    System.out.print(num1 + " " + num3);
                else
                    System.out.println(num3 + " " + num1);
            }
            else
                System.out.println(num3 + " " + num2 + " " + num1);
        }
*/

        //quiz3.9
/*
        System.out.println("Enter the first 9 digits of an ISBN an integer :");
        int numOfISBN = input.nextInt();
        int d9 = numOfISBN % 10;
        int d8 = numOfISBN / 10 % 10;
        int d7 = numOfISBN / 100 % 10;
        int d6 = numOfISBN / 1000 % 10;
        int d5 = numOfISBN / 10000 % 10;
        int d4 = numOfISBN / 100000 % 10;
        int d3 = numOfISBN / 1000000 % 10;
        int d2 = numOfISBN / 10000000 % 10;
        int d1 = numOfISBN / 100000000;

        int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6
                    + d7 * 7 + d8 * 8 + d9 * 9) % 11;

        if (d10 == 10){
            System.out.println("The ISBN-10 number is 0" + numOfISBN + "X");
        }else {
            System.out.println("The ISBN-10 number is 0" + numOfISBN + d10);
        }
*/

        //quiz3.10
/*
        int num1 = (int)(Math.random() * 100);
        int num2 = (int)(Math.random() * 100);

        System.out.println("What is " + num1 + " + " + num2 + " ? ");
        int answer = input.nextInt();
        if (num1 + num2 == answer){
            System.out.println("You are correct!");
        }else{
            System.out.println("Your answer is wrong.");
            System.out.println(num1 + " + " + num2 + " should be " + (num1 + num2));
        }
*/

        //quiz3.11
/*
        System.out.println("Enter a number of month :");
        int numOfMonth = input.nextInt();

        System.out.println("Enter a number of year :");
        int numOfYear = input.nextInt();

        switch (numOfMonth){
            case 1:
                System.out.println("January " + numOfYear + " has 31 days");
                break;
            case 2:
                if (numOfYear % 4 == 0 && numOfYear % 100 != 0 || numOfYear % 400 == 0){
                    System.out.println("February " + numOfYear + " has 29 days");
                }else {
                    System.out.println("February " + numOfYear + " has 28 days");
                }
                break;
            case 3:
                System.out.println("March " + numOfYear + " has 31 days");
                break;
            case 4:
                System.out.println("April " + numOfYear + " has 30 days");
                break;
            case 5:
                System.out.println("May " + numOfYear + " has 31 days");
                break;
            case 6:
                System.out.println("June " + numOfYear + " has 30 days");
                break;
            case 7:
                System.out.println("July " + numOfYear + " has 31 days");
                break;
            case 8:
                System.out.println("August " + numOfYear + " has 31 days");
                break;
            case 9:
                System.out.println("September " + numOfYear + " has 30 days");
                break;
            case 10:
                System.out.println("October " + numOfYear + " has 31 days");
                break;
            case 11:
                System.out.println("November " + numOfYear + " has 30 days");
                break;
            case 12:
                System.out.println("December " + numOfYear + " has 31 days");
                break;
        }
*/

        //quiz3.12
/*
        System.out.println("Enter a three-digit integer :");
        int threeDigNum,firstDig,lastNum;
        threeDigNum = input.nextInt();
        lastNum = threeDigNum % 10;
        firstDig = threeDigNum / 100;
        if (lastNum == firstDig){
            System.out.println(threeDigNum + " is palindrome");
        }else {
            System.out.println(threeDigNum + " is not palindrome");
        }
*/

        //quiz3.13
/*
        System.out.println("(0-single filter, 1-married jointly or qualifying widow(er)," +
                " 2-head of separately, 3-head of household) Enter the filing status : ");

        int status = input.nextInt();

        System.out.println("Enter the taxable income : ");
        double income = input.nextDouble();

        double tax = 0;

        if (status == 0){
            if (income <= 8350){
                tax = income * 0.01;
            }else if (income <= 33950){
                tax = 8350 * 0.01 + (income - 8350) * 0.15;
            }else if (income <= 82250){
                tax = 8350 * 0.01 + (33950 - 8350) * 0.15 + (income - 33590) * 0.25;
            }else if (income <= 171550){
                tax = 8350 * 0.01 + (33950 - 8350) * 0.15 + (82250 - 33590) * 0.25
                        + (income - 82250) * 0.28;
            }else if (income <= 372950){
                tax = 8350 * 0.01 + (33950 - 8350) * 0.15 + (82250 - 33590) * 0.25
                        + (171550 - 82250) * 0.28 + (income - 171550) * 0.33;
            }else {
                tax = 8350 * 0.01 + (33950 - 8350) * 0.15 + (82250 - 33590) * 0.25
                        + (171550 - 82250) * 0.28 + (income - 171550) * 0.33 + (income - 372950) * 0.35;
            }
        } else if (status == 1){
            if (income <= 16700){
                tax = income * 0.01;
            }else if (income <= 67900){
                tax = 16700 * 0.01 + (income - 16700) * 0.15;
            }else if (income <= 137050){
                tax = 16700 * 0.01 + (67900 - 16700) * 0.15 + (income - 137050) * 0.25;
            }else if (income <= 208850){
                tax = 16700 * 0.01 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25
                        + (income - 137050) * 0.28;
            }else if (income <= 372950){
                tax = 16700 * 0.01 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25
                        + (208850 - 137050) * 0.28 + (income - 208850) * 0.33;
            }else {
                tax = 16700 * 0.01 + (income - 16700) * 0.15 + (137050 - 137050) * 0.25
                        + (208850 - 137050) * 0.28 + (372950 - 208850) * 0.33 + (income - 372950) * 0.35;
            }
        }else if (status ==2){
            if (income <= 8350){
                tax = income * 0.01;
            }else if (income <= 33950){
                tax = 8350 * 0.01 + (income - 8350) * 0.15;
            }else if (income <= 68525){
                tax = 8350 * 0.01 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
            }else if (income <= 104425){
                tax = 8350 * 0.01 + (33950 - 8350) * 0.15 + (68525 - 33590) * 0.25
                        + (income - 68525) * 0.28;
            }else if (income <= 186475){
                tax = 8350 * 0.01 + (33950 - 8350) * 0.15 + (68525 - 33590) * 0.25
                        + (104425 - 68525) * 0.28 + (income - 104425) * 0.33;
            }else {
                tax = 8350 * 0.01 + (33950 - 8350) * 0.15 + (68525 - 33590) * 0.25
                        + (104425 - 68525) * 0.28 + (income - 104425) * 0.33 + (income - 186475) * 0.35;
            }
        }else if (status ==3){
            if (income <= 11950){
                tax = income * 0.01;
            }else if (income <= 45500){
                tax = 11950 * 0.01 + (income - 11950) * 0.15;
            }else if (income <= 117450){
                tax = 11950 * 0.01 + (45500 - 11950) * 0.15 + (income - 45500) * 0.25;
            }else if (income <= 190200){
                tax = 11950 * 0.01 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25
                        + (income - 117450) * 0.28;
            }else if (income <= 372950){
                tax = 11950 * 0.01 + (44550 - 11950) * 0.15 + (117450 - 45500) * 0.25
                        + (190200 - 117450) * 0.28 + (income - 190200) * 0.33;
            }else {
                tax = 11950 * 0.01 + (income - 11950) * 0.15 + (income - 45500) * 0.25
                        + (190200 - 117450) * 0.28 + (372950 - 190200) * 0.33 + (income - 372950) * 0.35;
            }
        }else{
            System.out.println("Error : invalid status");
            System.exit(1);
        }

        System.out.println("Tax is " + (int)(tax * 100) / 100.0);
*/

        //quiz3.14
/*
        int symbolNumber = (int)(Math.random() * 2);
        int userGuess;
        System.out.println("Enter your guess , 0 for tail , 1 for head :");
        userGuess = input.nextInt();

        if (userGuess == symbolNumber){
            System.out.println("Your guess is right!");
        }else {
            System.out.println("Your guess is wrong!");
        }
*/

        //quiz3.15
/*
        int lottery = (int)(Math.random() * 1000);

        System.out.println("Enter your lottery pick(three digits) :");
        int guess = input.nextInt();

        int lotteryDigit1 = lottery % 10;
        int lotteryDigit2 = lottery / 10 % 10;
        int lotteryDigit3 = lottery / 100;

        int guessDigit1 = guess % 10;
        int guessDigit2 = guess / 10 % 10;
        int guessDigit3 = guess / 100;

        System.out.println("The lottery number is " + lottery);

        if (lottery == guess){
            System.out.println("Exact match : you win $10,000 ");
        }else if ((lotteryDigit1 == guessDigit1 && lotteryDigit2 ==guessDigit3 && lotteryDigit3 == guessDigit2)
        || (lotteryDigit1 == guessDigit3 && lotteryDigit3 == guessDigit2 && lotteryDigit2 == guessDigit1)
        || (lotteryDigit1 == guessDigit2 && lotteryDigit2 == guessDigit1 && lotteryDigit3 == guessDigit3)
        || (lotteryDigit1 == guessDigit3 && lotteryDigit2 == guessDigit1 && lotteryDigit3 == guessDigit2)
        || (lotteryDigit1 == guessDigit3 && lotteryDigit2 == guessDigit2 && lotteryDigit3 == guessDigit1)){
            System.out.println("Match all digits : you win $3,000");
        }else if (lotteryDigit1 == guessDigit1 || lotteryDigit1 == guessDigit2 || lotteryDigit1 ==guessDigit3
        || lotteryDigit2 == guessDigit1 || lotteryDigit2 == guessDigit2 || lotteryDigit2 == lotteryDigit3
        || lotteryDigit3 == guessDigit1 || lotteryDigit3 == guessDigit2 || lotteryDigit3 == guessDigit3){
            System.out.println("Match one digit : you win $1,000");
        }else {
            System.out.println("Sorry , no match");
        }
*/

        //quiz3.16
/*
        double pointX = Math.random() * 50;
        double pointY = Math.random() * 100;

        int directionX = (int)(Math.random() * 2);
        int directionY = (int)(Math.random() * 2);

        if (directionX == 0){
            pointX *= -1;
        }
        if (directionY == 0){
            pointY *= -1;
        }

        System.out.println("The random point is (" + pointX + " , " + pointY +")");
*/

        //quiz3.17
/*
        final int userGuess,computerGuess;

        computerGuess = (int)(Math.random() * 3);
        System.out.println("scissor(0) , rock(1) , paper(2)");
        userGuess = input.nextInt();

        if(computerGuess == 0){
            if (userGuess == 0){
                System.out.println("The compute is scissor. You are scissor. It is a draw");
            }else if (userGuess == 1){
                System.out.println("The computer is scissor. You are rock. You won");
            }else if (userGuess == 2){
                System.out.println("The computer is scissor. You are paper. You lost");
            }
        }else if (computerGuess == 1){
            if (userGuess == 0){
                System.out.println("The compute is rock. You are scissor. You lost");
            }else if (userGuess == 1){
                System.out.println("The computer is rock. You are rock. It is a draw");
            }else if (userGuess == 2){
                System.out.println("The computer is rock. You are paper. You win");
            }
        }else if (computerGuess == 2){
            if (userGuess == 0){
                System.out.println("The compute is paper. You are scissor. You win");
            }else if (userGuess == 1){
                System.out.println("The computer is paper. You are rock. You lost");
            }else if (userGuess == 2){
                System.out.println("The computer is paper. You are paper. It is a draw");
            }
        }
*/

        //quiz3.19
/*
        System.out.println("Enter the weight of package(pounds):");
        double userWeight = input.nextDouble();

        if (userWeight > 0 && userWeight <= 1){
            System.out.println("You're cost is $ 3.5");
        }else if (userWeight > 1 && userWeight <= 3){
            System.out.println("You're cost is $ 5.5");
        }else if (userWeight > 3 && userWeight <= 10){
            System.out.println("You're cost is $ 8.5");
        }else if (userWeight >10 && userWeight <= 20){
            System.out.println("You're cost is $ 10.5");
        }else {
            System.out.println("The package cannot be shipped");
        }
*/

        //quiz3.20
/*
        double edge1, edge2, edge3, perimeter = 0;

        System.out.println("Enter the first edge of the triangle :");
        edge1 = input.nextDouble();
        System.out.println("Enter the second edge of the triangle :");
        edge2 = input.nextDouble();
        System.out.println("Enter the third edge of the triangle :");
        edge3 = input.nextDouble();

        if (edge1 + edge2 > edge3 && edge1 + edge3 > edge2 && edge2 + edge3 > edge1){
            perimeter = edge1 + edge2 + edge3;
        }else {
            System.out.println("The input is invalid");
        }

        if (perimeter != 0){
            System.out.println("The perimeter of triangle is " + perimeter);
        }
*/

        //quiz3.21
/*
        int year, month, day, j, h, q, m, k;

        System.out.println("Enter year:(e.g., 2012)");
        year = input.nextInt();
        System.out.println("Enter month:1-12");
        month = input.nextInt();
        System.out.println("Enter the day of the month:1-31");
        day = input.nextInt();

        if (month  == 1 || month == 2){
            month += 12;
            year -= 1;
        }

        q = day;
        m = month;
        j = year / 100;
        k = year % 100;
        h = (q + (26*(m+1)/10) + k + k/4 + j/4 + 5*j) % 7;

        switch (h){
            case 0:
                System.out.println("Day of the week is Saturday");
                break;
            case 1:
                System.out.println("Day of the week is Sunday");
                break;
            case 2:
                System.out.println("Day of the week is Monday");
                break;
            case 3:
                System.out.println("Day of the week is Tuesday");
                break;
            case 4:
                System.out.println("Day of the week is Wednesday");
                break;
            case 5:
                System.out.println("Day of the week is Thursday");
                break;
            case 6:
                System.out.println("Day of the week is Friday");
                break;
        }
*/

        //quiz3.22
/*
        double coordinateX,coordinateY,distance;

        System.out.println("Enter a point two coordinates:");
        coordinateX = input.nextDouble();
        coordinateY = input.nextDouble();
        distance = Math.sqrt(Math.pow(coordinateX,2)+Math.pow(coordinateY,2));

        if (distance < 10){
            System.out.println("Point (" + coordinateX + "," + coordinateY + ") is in the circle");
        }else {
            System.out.println("Point (" + coordinateX + "," + coordinateY + ") is not in the circle");
        }
*/

        //quiz3.23
/*
        double coordinateX,coordinateY,distance;
        System.out.println("Enter a point with two coordinates:");
        coordinateX = input.nextDouble();
        coordinateY = input.nextDouble();

        if (Math.abs(coordinateX) < 5 && Math.abs(coordinateY) < 2.5){
            System.out.println("Point (" + coordinateX + "," + coordinateY + ") is in the rectangle");
        }else{
            System.out.println("Point (" + coordinateX + "," + coordinateY + ") is not in the rectangle");
        }
*/

        //quiz3.24
/*
        int number,color;

        Random r1 = new Random();
        Random r2 = new Random();
        number = r1.nextInt(13);
        color = r2.nextInt(4);

        switch (number){
            case 0:
                System.out.print("The card you picked is Ace of");
                break;
            case 1:
                System.out.print("The card you picked is 2 of");
                break;
            case 2:
                System.out.print("The card you picked is 3 of");
                break;
            case 3:
                System.out.print("The card you picked is 4 of");
                break;
            case 4:
                System.out.print("The card you picked is 5 of");
                break;
            case 5:
                System.out.print("The card you picked is 6 of");
                break;
            case 6:
                System.out.print("The card you picked is 7 of");
                break;
            case 7:
                System.out.print("The card you picked is 8 of");
                break;
            case 8:
                System.out.print("The card you picked is 9 of");
                break;
            case 9:
                System.out.print("The card you picked is 10 of");
                break;
            case 10:
                System.out.print("The card you picked is Jack of");
                break;
            case 11:
                System.out.print("The card you picked is Queen of");
                break;
            case 12:
                System.out.print("The card you picked is king of");
                break;
        }
        switch (color){
            case 0:
                System.out.println(" Clubs");
                break;
            case 1:
                System.out.println(" Diamonds");
                break;
            case 2:
                System.out.println(" Hearts");
                break;
            case 3:
                System.out.println(" Spades");
                break;
        }
*/

        //quiz3.25
/*
        double x1,y1,x2,y2,x3,y3,x4,y4;
        double a,b,c,d,e,f,x,y,discriminant;

        x1 = input.nextDouble();
        y1 = input.nextDouble();
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        x3 = input.nextDouble();
        y3 = input.nextDouble();
        x4 = input.nextDouble();
        y4 = input.nextDouble();

        a = y1 - y2;
        b = x2 - x1;
        c = y3 - y4;
        d = x4 - x3;
        e = a * x1 + b * y1;
        f = c * x3 + d * y3;
        discriminant = a * d - b * c;

        if (discriminant != 0){
            x = (e * d - b * f) / discriminant;
            y = (a * f - e * c) / discriminant;
            System.out.println("The intersecting point is at (" + x + "," + y + ")");
        }else {
            System.out.println("The two lines are parallel");
        }
*/

        //quiz3.26
/*
        System.out.println("Enter an integer:");
        int userInt = input.nextInt();

        System.out.println("Is " + userInt + " divisible by 5 and 6? " +
                (userInt % 5 == 0 && userInt % 6 ==0));
        System.out.println("Is " + userInt + " divisible by 5 or 6? " +
                (userInt % 5 ==0 || userInt % 6 ==0));
        System.out.println("Is " + userInt +  "divisible by 5 or 6, but not both? " +
                ((userInt % 5 ==0 || userInt % 6 ==0) ^ (userInt % 5 == 0 && userInt % 6 ==0)));
*/

        //quiz3.27
        //Something wrong
/*
        double xCoordinate,yCoordinate;
        double edge1,edge2,edge3,p,area;
        final double triangleArea = 10000.0;
        System.out.println("Enter a point's x- and y-coordinates:");
        xCoordinate = input.nextDouble();
        yCoordinate = input.nextDouble();

        edge1 = Math.sqrt(Math.pow(xCoordinate - 0,2) + Math.pow(yCoordinate - 0,2));
        edge2 = Math.sqrt(Math.pow(xCoordinate - 0,2) + Math.pow(yCoordinate - 100,2));
        edge3 = Math.sqrt(Math.pow(xCoordinate - 200,2) + Math.pow(yCoordinate - 0,2));
        p = (edge1 + edge2 + edge3) / 2;
        area = Math.sqrt(p*(p-edge1)*(p-edge2)*(p-edge3));

        if (area == triangleArea){
            System.out.println("The point is in the triangle");
        }else{
            System.out.println("The point is not in the triangle");
        }
*/

        //quiz3.28
/*
        double xCoordinate1,yCoordinate1,xCoordinate2,yCoordinate2,width1,height1,width2,height2,xDistance,yDistance;

        System.out.println("Enter r1's center x-, y-coordinates, width, and height:");
        xCoordinate1 = input.nextDouble();
        yCoordinate1 = input.nextDouble();
        width1 = input.nextDouble();
        height1 = input.nextDouble();
        System.out.println("Enter r1's center x-, y-coordinates, width, and height:");
        xCoordinate2 = input.nextDouble();
        yCoordinate2 = input.nextDouble();
        width2 = input.nextDouble();
        height2 = input.nextDouble();

        xDistance = xCoordinate1 - xCoordinate2 >= 0 ? xCoordinate1 - xCoordinate2 : xCoordinate2 - xCoordinate1;
        yDistance = yCoordinate1 - yCoordinate2 >= 0 ? yCoordinate1 - yCoordinate2 : yCoordinate2 - yCoordinate1;

        if (xDistance < (width1 - width2) / 2 && yDistance < (height1 - height2) / 2){
            System.out.println("r2 is inside r1");
        }else if (xDistance < (width1 + width2) / 2 && yDistance < (height1 + height2) / 2){
            System.out.println("r2 overlaps r1");
        }else{
            System.out.println("r2 does not overlap r1");
        }
*/
        //quiz3.29
/*
        double xCoordinate1,yCoordinate1,xCoordinate2,yCoordinate2,radius1,radius2,distance;

        System.out.println("Enter circle1's center x- ,y-coordinates, and radius :");
        xCoordinate1 = input.nextDouble();
        yCoordinate1 = input.nextDouble();
        radius1 = input.nextDouble();
        System.out.println("Enter circle2's center x- ,y-coordinates, and radius :");
        xCoordinate2 = input.nextDouble();
        yCoordinate2 = input.nextDouble();
        radius2 = input.nextDouble();

        distance = Math.sqrt(Math.pow(xCoordinate2 - xCoordinate1,2) + Math.pow(yCoordinate2 - yCoordinate1,2));
        if (distance <= Math.abs(radius1 - radius2)){
            System.out.println("Circle2 is inside circle1");
        }else if (Math.abs(radius1 - radius2) < distance && distance <= radius1 + radius2){
            System.out.println("Circle2 is overlaps circle1");
        }else if (distance > radius1 + radius2){
            System.out.println("Circle2 is not overlap circle1");
        }
*/

        //quiz3.30
/*
        int timeZoneOffset;
        long currentHours,currentMinters,currentSconds;

        currentSconds = (System.currentTimeMillis() / 1000) % 60;
        currentMinters = (System.currentTimeMillis() / 1000 / 60) % 60;
        currentHours = (System.currentTimeMillis() / 1000 / 60 / 60) % 24;

        System.out.println("Enter the time zone offset to GMT :");
        timeZoneOffset = input.nextInt();

        currentHours = (currentHours + timeZoneOffset +24) % 24;

        if (currentHours <= 12){
            System.out.println("The current time is " + currentHours + " : " + currentMinters + " : " + currentSconds + " AM");
        }else {
            currentHours %= 12;
            System.out.println("The current time is " + currentHours + " : " + currentMinters + " : " + currentSconds + " PM");
        }
*/

        //quiz3.31
/*
        double exchangeRate,moneyAccount;
        int convertSymbol;

        System.out.println("Enter the exchange rate from dollars to RMB :");
        exchangeRate = input.nextDouble();
        System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa :");
        convertSymbol = input.nextInt();

        if (convertSymbol == 0){
            System.out.println("Enter the dollar amount:");
            moneyAccount = input.nextDouble();
            System.out.println("$" + moneyAccount + " is " + moneyAccount * exchangeRate + " yuan");
        }else if (convertSymbol == 1){
            System.out.println("Enter the RMB amount:");
            moneyAccount = input.nextDouble();
            System.out.println(moneyAccount + " yuan is $" + moneyAccount / exchangeRate);
        }
*/

        //quiz3.32
/*
        double x0,y0,x1,y1,x2,y2,judgeSymbol;
        System.out.println("Enter three point for p0, p1 and p2");
        x0 = input.nextDouble();
        y0 = input.nextDouble();
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        x2 = input.nextDouble();
        y2 = input.nextDouble();

        judgeSymbol = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
        if (judgeSymbol > 0){
            System.out.println("(" + x2 + "," + y2 + ") is on the left side of the line form ("
                    + x0 + "," + y0 + ") to (" + x1 + "," + y1 + ")");
        }else if (judgeSymbol == 0){
            System.out.println("(" + x2 + "," + y2 + ") is on the line form ("
                    + x0 + "," + y0 + ") to (" + x1 + "," + y1 + ")");
        }else if (judgeSymbol < 0){
            System.out.println("(" + x2 + "," + y2 + ") is on the right side of the line form ("
                    + x0 + "," + y0 + ") to (" + x1 + "," + y1 + ")");
        }
*/

        //quiz3.33
/*
        double weight1,price1,weight2,price2;
        System.out.println("Enter weight and price for package 1:");
        weight1 = input.nextDouble();
        price1 = input.nextDouble();
        System.out.println("Enter weight and price for package 2:");
        weight2 = input.nextDouble();
        price2 = input.nextDouble();

        if((weight1/price1) < (weight2 / price2)){
            System.out.println("Package 2 has a better price");
        }else if ((weight1/price1) > (weight2 / price2)){
            System.out.println("Package 1 has a better price");
        }else if ((weight1/price1) == (weight2 / price2)){
            System.out.println("Two packages have the same price");
        }
*/

        //quiz3.34
/*
        double x0,y0,x1,y1,x2,y2,judgeSymbol;
        System.out.println("Enter three point for p0, p1 and p2");
        x0 = input.nextDouble();
        y0 = input.nextDouble();
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        x2 = input.nextDouble();
        y2 = input.nextDouble();

        judgeSymbol = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
        if (judgeSymbol == 0){
            System.out.println("(" + x2 + "," + y2 + ") is on the line segment form ("
                    + x0 + "," + y0 + ") to (" + x1 + "," + y1 + ")");
        }else if (judgeSymbol != 0){
            System.out.println("(" + x2 + "," + y2 + ") is not on the line segment form ("
                    + x0 + "," + y0 + ") to (" + x1 + "," + y1 + ")");
        }
*/
        input.close();
    }
}