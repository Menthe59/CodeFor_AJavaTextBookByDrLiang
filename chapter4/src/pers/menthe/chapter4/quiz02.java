package pers.menthe.chapter4;

import java.util.Scanner;

public class quiz02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter point 1(latitude and longitude) in degrees :");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.println("Enter point 2(latitude and longitude) in degrees :");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        System.out.println("The distance between the two points is " +
                quiz02.calMaxDistance(x1,x2,y1,y2) + " km");
        input.close();
    }
    public static double calMaxDistance(double x1, double x2, double y1, double y2) {
        final double AVERAGE_RADIUS = 6371.01;
        double distance = AVERAGE_RADIUS * Math.acos( Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) +
                Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1-y2)));
        return distance;
    }
}
