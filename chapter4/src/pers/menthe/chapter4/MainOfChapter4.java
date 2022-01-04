package pers.menthe.chapter4;

import java.util.*;

public class MainOfChapter4 {
    public static void main(String[] args) {
        /*Please remove the double slash used for comments before test.
        测试相关题目前请删去对应注释。
        */
        Scanner input = new Scanner(System.in);

        //quiz4.1
/*
        System.out.println("Enter the length from the center to a vertex: ");
        double length = input.nextDouble();
        System.out.println("The area of the pentagon is: " + quiz01.calPentagonArea(length));
*/

        //quiz4.2
/*
        System.out.println("Enter point 1(latitude and longitude) in degrees :");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.println("Enter point 2(latitude and longitude) in degrees :");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        System.out.println("The distance between the two points is " +
                quiz02.calMaxDistance(x1,x2,y1,y2) + " km");
*/

        //quiz4.3
/*
        */
/*
        * GPS Location:
        * Atlanta:(35.2270869,-80.8431267)
        * Orlando:(33.7489954,-84.3879824)
        * Savannah:(32.0835407,-81.0998342)
        * Charlotte:(28.5383355,-81.3792365)
        *//*

        final double AVERAGE_RADIUS = 6371.01;
        final double ATLANTA_X = 35.2270869;
        final double ATLANTA_Y = -80.8431267;
        final double ORLANDO_X = 33.7489954;
        final double ORLANDO_Y = -84.3879824;
        final double SAVANNAH_X = 32.0835407;
        final double SAVANNAH_Y = -81.0998342;
        final double CHARLOTTE_X = 28.5383355;
        final double CHARLOTTE_Y = -81.3792365;

        double distanceAO,distanceOS,distanceSC,distanceCA,distanceAS,perArea1,perArea2,area1,area2,area;
        distanceAO = AVERAGE_RADIUS * Math.acos( Math.sin(Math.toRadians(ATLANTA_X)) * Math.sin(Math.toRadians(ORLANDO_X)) +
                Math.cos(Math.toRadians(ATLANTA_X)) * Math.cos(Math.toRadians(ORLANDO_X)) * Math.cos(Math.toRadians(ATLANTA_Y-ORLANDO_Y)));
        distanceOS = AVERAGE_RADIUS * Math.acos( Math.sin(Math.toRadians(ORLANDO_X)) * Math.sin(Math.toRadians(SAVANNAH_X)) +
                Math.cos(Math.toRadians(ORLANDO_X)) * Math.cos(Math.toRadians(SAVANNAH_X)) * Math.cos(Math.toRadians(ORLANDO_Y-SAVANNAH_Y)));
        distanceSC = AVERAGE_RADIUS * Math.acos( Math.sin(Math.toRadians(SAVANNAH_X)) * Math.sin(Math.toRadians(CHARLOTTE_X)) +
                Math.cos(Math.toRadians(SAVANNAH_X)) * Math.cos(Math.toRadians(CHARLOTTE_X)) * Math.cos(Math.toRadians(SAVANNAH_Y-CHARLOTTE_Y)));
        distanceCA = AVERAGE_RADIUS * Math.acos( Math.sin(Math.toRadians(CHARLOTTE_X)) * Math.sin(Math.toRadians(ATLANTA_X)) +
                Math.cos(Math.toRadians(CHARLOTTE_X)) * Math.cos(Math.toRadians(ATLANTA_X)) * Math.cos(Math.toRadians(CHARLOTTE_Y-ATLANTA_Y)));
        distanceAS = AVERAGE_RADIUS * Math.acos( Math.sin(Math.toRadians(ATLANTA_X)) * Math.sin(Math.toRadians(SAVANNAH_X)) +
                Math.cos(Math.toRadians(ATLANTA_X)) * Math.cos(Math.toRadians(SAVANNAH_X)) * Math.cos(Math.toRadians(ATLANTA_Y-SAVANNAH_Y)));
        perArea1 = (distanceAO + distanceOS +distanceAS) / 2;
        area1 = Math.sqrt(perArea1*(perArea1-distanceAO)*(perArea1-distanceOS)*(perArea1-distanceAS));
        perArea2 = (distanceCA + distanceSC + distanceAS) / 2;
        area2 = Math.sqrt(perArea2*(perArea2-distanceCA)*(perArea2-distanceSC)*(perArea2-distanceAS));
        area = area1+ area2;
        System.out.println("The area closed by four cities is " + area +" km²");
        //I don't know where's wrong，but the answers is wrong.
*/

        //quiz4.4
/*
        System.out.println("Enter the side :");
        double sideOfHexagon = input.nextDouble();
        double areaOfHexagon = (6*Math.pow(sideOfHexagon,2)) / (4*Math.tan(Math.PI / 6));
        System.out.println("The area of the hexagon is " + areaOfHexagon);
*/

        //quiz4.5
/*
        System.out.println("Enter the number of sides :");
        double numOfSide = input.nextDouble();
        System.out.println("Enter the side :");
        double lengthOfSide = input.nextDouble();
        double polygonArea = ( numOfSide * Math.pow(lengthOfSide,2)) / ( 4*Math.tan(Math.PI / numOfSide));
        System.out.println("The area of the polygon is " + polygonArea);
*/

        //quiz4.6
/*
        double x1,y1,x2,y2,x3,y3;
        double angleA,angleB,angleC,angle;
        double a,b,c;
        final double radius = 40.0;

        angle = Math.random() * 2 * Math.PI;
        x1 = radius * Math.cos(angle);
        y1 = radius * Math.sin(angle);
        angle = Math.random() * 2 * Math.PI;
        x2 = radius * Math.cos(angle);
        y2 = radius * Math.sin(angle);
        angle = Math.random() * 2 * Math.PI;
        x3 = radius * Math.cos(angle);
        y3 = radius * Math.sin(angle);

        a = Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2));
        b = Math.sqrt(Math.pow(x2-x3,2) + Math.pow(y2-y3,2));
        c = Math.sqrt(Math.pow(x1-x3,2) + Math.pow(y1-y3,2));

        angleA = Math.toDegrees(Math.acos((Math.pow(b,2)+Math.pow(c,2)-Math.pow(a,2))/(2*b*c)));
        angleB = Math.toDegrees(Math.acos((Math.pow(a,2)+Math.pow(c,2)-Math.pow(b,2))/(2*a*c)));
        angleC = Math.toDegrees(Math.acos((Math.pow(a,2)+Math.pow(b,2)-Math.pow(c,2))/(2*a*b)));

        System.out.println("The first angle in degree is " + angleA);
        System.out.println("The second angle in degree is " + angleB);
        System.out.println("The third angle in degree is " + angleC);
*/

        //quiz4.7
/*
        double x1,y1,x2,y2,x3,y3,x4,y4,x5,y5;
        System.out.println("Enter the radius if the bounding circle :");
        double radius = input.nextDouble();

        x1 = radius * Math.cos(Math.PI/2 - 2*Math.PI/5);
        y1 = radius * Math.sin(Math.PI/2 - 2*Math.PI/5);
        x2 = radius * Math.cos(Math.PI/2);
        y2 = radius * Math.sin(Math.PI/2);
        x3 = radius * Math.cos(Math.PI/2 + 2*Math.PI/5);
        y3 = radius * Math.sin(Math.PI/2 + 2*Math.PI/5);
        x4 = radius * Math.cos(Math.PI/2 + 2*(2*Math.PI/5));
        y4 = radius * Math.sin(Math.PI/2 + 2*(2*Math.PI/5));
        x5 = radius * Math.cos(Math.PI/2 - 2*(2*Math.PI/5));
        y5 = radius * Math.sin(Math.PI/2 - 2*(2*Math.PI/5));
        System.out.println("The coordinates of five points on the pentagon are :");
        System.out.printf("(%f,%f)\n",x1,y1);
        System.out.printf("(%f,%f)\n",x2,y2);
        System.out.printf("(%f,%f)\n",x3,y3);
        System.out.printf("(%f,%f)\n",x4,y4);
        System.out.printf("(%f,%f)\n",x5,y5);
*/

























    }
}