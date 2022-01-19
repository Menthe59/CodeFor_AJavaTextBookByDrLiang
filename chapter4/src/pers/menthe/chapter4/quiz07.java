package pers.menthe.chapter4;

import java.util.Scanner;

public class quiz07 {
    public static void main(String[] args) {
        double x1,y1,x2,y2,x3,y3,x4,y4,x5,y5;
        System.out.println("Enter the radius if the bounding circle :");
        Scanner input = new Scanner(System.in);
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

        input.close();
    }
}
