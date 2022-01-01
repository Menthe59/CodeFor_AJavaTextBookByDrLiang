package pers.menthe.chapter2;

public class quiz21 {
    public static double calFutVla(double amount, double rate, double year) {
        double value = amount * Math.pow( (1+rate/1200) , (year*12) );
        return value;
    }
}
