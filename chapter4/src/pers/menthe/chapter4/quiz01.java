package pers.menthe.chapter4;

import java.util.Scanner;

public class quiz01 {
    public static void main(String[] args) {
        System.out.println("Enter the length from the center to a vertex: ");
        Scanner input = new Scanner(System.in);
        double length = input.nextDouble();
        System.out.println("The area of the pentagon is: " + quiz01.calPentagonArea(length));
        input.close();
    }
    public static double calPentagonArea(double length) {
        double sOfPent, area;
        sOfPent = 2 * length * Math.sin(Math.PI / 5);
        area = (5 * Math.pow(sOfPent, 2)) / (4 * Math.tan(Math.PI / 5));
        return area;
    }
}
