package pers.menthe.chapter2;

public class quiz15 {
    public static double calDistance(double x1, double x2, double y1, double y2) {
        double vla = Math.pow( x2 - x1 , 2) + Math.pow(y2 - y1 , 2);
        double distance = Math.pow(vla, 0.5);
        return distance;
    }
}
