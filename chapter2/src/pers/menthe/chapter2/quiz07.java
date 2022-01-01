package pers.menthe.chapter2;

public class quiz07 {
    public static long calYear(long min) {
        long year = (min / 60 / 24) / 365;
        return year;
    }

    public static long calDays(long min) {
        long day = (min / 60 / 24) % 365;
        return day;
    }
}
