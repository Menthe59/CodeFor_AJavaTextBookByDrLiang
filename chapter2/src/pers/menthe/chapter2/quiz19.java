package pers.menthe.chapter2;

public class quiz19 {
    public static double calTriArea(double x1, double x2, double x3, double y1, double y2, double y3) {
        double side1 = Math.pow((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2), 0.5);
        double side2 = Math.pow((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3), 0.5);
        double side3 = Math.pow((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2), 0.5);
        double allsides = (side1 + side2 + side3) / 2;
        double area = Math.pow(allsides * (allsides - side1) * (allsides - side2) * (allsides - side3), 0.5);
        return area;
    }
}
