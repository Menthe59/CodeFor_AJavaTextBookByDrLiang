package pers.menthe.chapter2;

public class quiz17 {
    public static double calWindChill(double tempe, double windSpeed) {
        double windchill = 35.74 + 0.6215*tempe - 35.75*Math.pow(windSpeed,0.16) + 0.4275*tempe*Math.pow(windSpeed,0.16);
        return windchill;
    }
}
