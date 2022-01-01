package pers.menthe.chapter2;

public class quiz09 {
    public static double calAcceleration(double velZero, double velOne, double time) {
        double accel = (velOne - velZero) / time;
        return accel;
    }
}
