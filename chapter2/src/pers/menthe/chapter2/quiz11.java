package pers.menthe.chapter2;

public class quiz11 {

    public static double calPopuOfYear(long year) {

        double initPopu = 312032486;
        double popuOfEach = 0;
        int secOf5Year = 365 * 24 * 60 * 60;

        for(int i = 0; i <= year; i++){
            popuOfEach = initPopu + i * secOf5Year * 1/7.0 - i * secOf5Year * 1/13.0 + i * secOf5Year * 1/45.0;
        }

        return popuOfEach;
    }
}
