package pers.menthe.chapter4;

import java.util.Scanner;

public class quiz04 {
    public static void main(String[] args) {
        System.out.println("Enter the side :");
        Scanner input = new Scanner(System.in);
        double sideOfHexagon = input.nextDouble();
        double areaOfHexagon = (6*Math.pow(sideOfHexagon,2)) / (4*Math.tan(Math.PI / 6));
        System.out.println("The area of the hexagon is " + areaOfHexagon);
        input.close();
    }
}
