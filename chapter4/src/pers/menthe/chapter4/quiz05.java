package pers.menthe.chapter4;

import java.util.Scanner;

public class quiz05 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter the number of sides :");
        double numOfSide = input.nextDouble();
        System.out.println("Enter the side :");
        double lengthOfSide = input.nextDouble();
        double polygonArea = ( numOfSide * Math.pow(lengthOfSide,2)) / ( 4*Math.tan(Math.PI / numOfSide));
        System.out.println("The area of the polygon is " + polygonArea);
        input.close();
    }
}
