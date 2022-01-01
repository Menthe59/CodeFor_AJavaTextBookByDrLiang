package pers.menthe.chapter2;

public class quiz10 {
    public static double calEnergy(double amount, double initial, double finnal){
        double needed = amount * ( finnal - initial) * 4184;
        return needed;
    }
}
