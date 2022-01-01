package pers.menthe.chapter2;

public class quiz14 {
    public static double calBMI(double weight, double height) {
        double valueOfBMI = ( weight*0.45359237 ) / (Math.pow( height*0.0254 , 2)) ;
        return valueOfBMI;
    }
}
