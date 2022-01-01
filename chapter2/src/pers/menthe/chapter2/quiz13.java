package pers.menthe.chapter2;

public class quiz13 {
    public static double calAccountValue(int amount) {
        double finalValue = amount * (1 + 0.05 / 12);
        for(int n= 1; n < 6; n++){
            finalValue = ( 100+finalValue ) * (1 + 0.05 / 12);
        }
        return finalValue;
    }
}
