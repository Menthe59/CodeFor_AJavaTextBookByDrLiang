package pers.menthe.chapter4;

public class quiz02 {
    public static double calMaxDistance(double x1, double x2, double y1, double y2) {
        final double AVERAGE_RADIUS = 6371.01;
        double distance = AVERAGE_RADIUS * Math.acos( Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) +
                Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1-y2)));
        return distance;
    }
}
