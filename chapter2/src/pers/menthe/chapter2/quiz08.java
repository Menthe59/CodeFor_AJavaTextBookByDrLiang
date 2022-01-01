package pers.menthe.chapter2;

public class quiz08 {
    public static void curTime(int curGMT) {
        long sec = (System.currentTimeMillis() / 1000) % 60;
        long min = (System.currentTimeMillis() / 1000 / 60) % 60;
        long hour = (System.currentTimeMillis() / 1000 / 60 / 60) % 24 + curGMT + 12;
        //Here it is to prevent negative time in some time zones.
        //Need to optimize the 24-hour system.
        System.out.println( "The current time is " + hour + ":" + min + ":" + sec);
    }
}
