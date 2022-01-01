package pers.menthe.chapter2;

import java.util.Scanner;

public class MainOfChapter2 {
    public static void main(String[] args) {
        /*Please remove the double slash used for comments before test.
        测试相关题目前请删去对应注释。
        */

        Scanner input = new Scanner (System.in);

        //quiz2.1
/*
        System.out.println("Enter a degree in Celsius :" );

        double enterDegInCel = input.nextDouble();

        System.out.println(enterDegInCel + " Celsius is " + quiz01.transDegree(enterDegInCel) + " Fahrenheit.");
*/

        //quiz2.2
/*
        System.out.println("Enter a radius and length of a cylinder :" );

        double enterRadius = input.nextDouble();
        double enterLength = input.nextDouble();

        quiz02.calCylinder(enterRadius,enterLength);
*/

        //quiz2.3
/*
        System.out.println("Enter a value for feet : ");

        double enterFeet = input.nextDouble();

        System.out.println(enterFeet + " feet is " + quiz03.transFeet(enterFeet) + " meters.");
*/

        //quiz2.4
/*
        System.out.println("Enter a number ins pounds: ");

        double enterPounds = input.nextDouble();

        System.out.println( enterPounds + " pounds is " + quiz04.transWeight(enterPounds) + " kilograms.");
*/

        //quiz2.5
/*
        System.out.println("Enter the subtotal and a gratuity rate :");

        double enterSubtotal = input.nextDouble();
        double enterGratify = input.nextDouble();

        System.out.println("The gratuity is $" + quiz05.calTips(enterSubtotal,enterGratify) + " and total is $" + (enterSubtotal + quiz05.calTips(enterSubtotal,enterGratify)) );
*/

        //quiz2.6
/*
        System.out.println("Enter a number betwwen 0 and 1000:");

        int enterInt = input.nextInt();

        System.out.println("The sum of the digits is " + quiz06.sumOfInt(enterInt));
*/

        //quiz2.7
/*
        System.out.println("Enter a number of minutes :");

        long enterMin = input.nextLong();

        System.out.println(enterMin + " minutes is approximately " + quiz07.calYear(enterMin) + " years and " + quiz07.calDays(enterMin) + " days");
*/

        //quiz2.8
/*
        System.out.println("Enter the time of zone offset to GMT :");

        int enterGMT = input.nextInt();

        quiz08.curTime(enterGMT);
*/

        //quiz2.9
/*
        System.out.println("Enter v0, v1, and t :");

        double enterVelZero = input.nextDouble();
        double enterVelOne = input.nextDouble();
        double enterTime = input.nextDouble();

        System.out.println("The average acceleration is : " + quiz09.calAcceleration(enterVelZero, enterVelOne,enterTime));
*/

        //quiz2.10
/*
        System.out.println("Enter the amount of water in kilograms : ");
        double amoOfWater = input.nextDouble();

        System.out.println("Enter the initial temperature : ");
        double initTemp = input.nextDouble();

        System.out.println("Enter the finnal temperature : ");
        double finnalTemp = input.nextDouble();

        System.out.println("The energy needed is " + quiz10.calEnergy(amoOfWater,initTemp,finnalTemp));
*/

        //quiz2.11
/*
        System.out.println("Enter the number of years :");

        long enterYear = input.nextLong();

        System.out.println("The population in " + enterYear + " years is " + quiz11.calPopuOfYear(enterYear));
*/

        //quiz2.12
/*
        System.out.println("Enter speed and acceleration : ");

        double enterSpeed = input.nextDouble();
        double enterAccel = input.nextDouble();

        System.out.println("The minimum runway length for this airplane is " + quiz12.calRunway(enterSpeed,enterAccel));
*/

        //quiz2.13
/*
        System.out.println("Enter the monthly saving amount : ");

        int enterAmount = input.nextInt();

        System.out.println("After the six month, the account walue is $" + quiz13.calAccountValue(enterAmount));
*/

        //quiz2.14
 /*       System.out.println("Enter weight in pounds : ");
        double enterWeight = input.nextDouble();
        System.out.println("Enter height is inches : ");
        double enterHeight = input.nextDouble();

        System.out.println("BMI is " + quiz14.calBMI(enterWeight,enterHeight));
*/

        //quiz2.15
/*
        System.out.println("Enter x1 and y1 :");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.println("Enter x2 and y2 :");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        System.out.println("The distance between the two points is " + quiz15.calDistance(x1,x2,y1,y2));
*/

        //quiz2.16
/*
        System.out.println("Enter the length of the side : ");
        double sideLength = input.nextDouble();
        System.out.println("The area of the hexagon is " + quiz16.calHexagon(sideLength));
*/

        //quiz2.17
/*
        System.out.println("Enter the temperature in Fahrenheit between -58℉ and 41℉ :");
        double enterTempe = input.nextDouble();
        System.out.println("Enter the wind speed (>=2) in miles per hour :");
        double enterWindSpeed = input.nextDouble();
        System.out.println("The wind chill index is " + quiz17.calWindChill(enterTempe,enterWindSpeed));
*/

        //quiz2.18
        /*quiz18.prtTable();
*/

        //quiz2.19
/*
        System.out.println("Enter the coordinates of three points separated by spaces" +
                " like x1 y1 x2 y2 x3 y3 :");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        System.out.println("The area of the triangle is " + quiz19.calTriArea(x1,x2,x3,y1,y2,y3));
*/

        //quiz2.20
/*
        System.out.println("Enter the balance and interest rate (eg. , 3 for 3% ) : ");
        double enterBlance = input.nextDouble();
        double enterRate = input.nextDouble();
        System.out.println("The interest is " + quiz20.calInterest(enterBlance,enterRate));
*/

        //quiz2.21
/*
        System.out.println("Enter investment amount : ");
        double enterInvAmt = input.nextDouble();
        System.out.println("Enter annual interest rate in percentage : ");
        double enterAnnuaRate = input.nextDouble();
        System.out.println("Enter number of years : ");
        double numOfYear = input.nextDouble();
        System.out.println("Future value is $" + quiz21.calFutVla(enterInvAmt,enterAnnuaRate,numOfYear));
*/

        //quiz2.22
        //This ode reference book, only according to the requirements.
/*
        System.out.println("Enter an amount in integer, for example 1156 means 11 dollars and 56 cents: ");
        int amount = input.nextInt();

        int remainingAmount = amount;

        // Find the number of one dollars
        int numOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        // Find the number of quaters in the remaining amount
        int numOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        // Find the number of dimes in the remaining amount
        int numOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        // Find the number of nickels in the remaining amount
        int numOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        // Find the number of pennies in the remaining amount
        int numOfPennies = remainingAmount;

        // Display results
        System.out.println("Your amount " + amount + " consists of ");
        System.out.println(numOfOneDollars + " dollars");
        System.out.println(numOfQuarters + " quarters");
        System.out.println(numOfDimes + " dimes");
        System.out.println(numOfNickels + " nickels");
        System.out.println(numOfPennies + " pennies");
*/

        //quiz23
/*
        System.out.println("Enter the driving distance : ");
        double driDis = input.nextDouble();
        System.out.println("Enter miles per gallon : ");
        double milePerGal = input.nextDouble();
        System.out.println("Enter price per gallon : ");
        double pricePerGallon = input.nextDouble();
        System.out.println("The cost of driving is $" + quiz23.calCost(driDis,milePerGal,pricePerGallon));
*/


    }
}
